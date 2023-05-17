package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
		if (compareLineaVenta(lv)) {
			//findByProductVenta(lv.getProducto()).setCantidad(findByProductVenta(lv.getProducto()).getCantidad()+1);
			venta.get(venta.indexOf(lv)).setCantidad(lv.getCantidad()+1);
		}else {
			venta.add(lv);
		}
	}
	
	public boolean compareLineaVenta(LineaVenta lv) {
		if(findByProductVenta(lv.getProducto())) {
			if(lv.getProducto().getId()==venta.get(venta.indexOf(lv)).getProducto().getId()) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	public boolean findByProductVenta(Producto p) {
		return venta.stream()
				.anyMatch(x -> x.getProducto().getId()==p.getId());
	}
	
	public LineaVenta findByProductoId(Producto p) {
		return lineaVentaRepository.findByProductoId(p.getId()).get();
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
	
	public List<LineaVenta> getLineasVentaInCart(){
		return Collections.unmodifiableList(venta);
	}
}
