package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.LineaVenta;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Producto;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.repository.LineaVentaRepository;

@Service
@Scope (value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CestaService {

	private LineaVentaRepository lineaVentaRepository;
	
	private List<LineaVenta> venta = new ArrayList<>();
	
	@Autowired	
	public CestaService(LineaVentaRepository lineaVentaRepository) {
		this.lineaVentaRepository = lineaVentaRepository;
	}

	public void addLineaVenta (LineaVenta lv) {
		if (venta.contains(lv)) {
			venta.get(venta.indexOf(lv)).setCantidad(lv.getCantidad()+1);
		}else {
			venta.add(lv);
		}
	}
	
	public void removeLineaVenta (LineaVenta lv) {
		if (venta.contains(lv)) {
			if(lv.getCantidad()>1) {
				venta.get(venta.indexOf(lv)).setCantidad(lv.getCantidad()-1);
			}else if(lv.getCantidad()==1){
				venta.remove(lv);
			}
		}
	}
	
	public LineaVenta findByProducto(Producto p) {
		return lineaVentaRepository.findByProducto(p).orElse(null);
	}
	
	public List<LineaVenta> getLineasVentaInCart(){
		return Collections.unmodifiableList(venta);
	}
}
