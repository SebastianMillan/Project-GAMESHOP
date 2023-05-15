package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.LineaVenta;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Producto;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.repository.LineaVentaRepository;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.servicebase.BaseServiceImp;

@Service
public class LineaVentaService 
	extends BaseServiceImp<LineaVenta, Long, LineaVentaRepository>{
	
	@Autowired
	private LineaVentaRepository lineaVentaRepository;
	
	public double calcularImporte(LineaVenta lv) {
		return lv.getPrecioUnitario()*lv.getCantidad();
	}
	
	public LineaVenta findByProducto(Producto p) {
		return lineaVentaRepository.findByProducto(p).get();
	}
}
