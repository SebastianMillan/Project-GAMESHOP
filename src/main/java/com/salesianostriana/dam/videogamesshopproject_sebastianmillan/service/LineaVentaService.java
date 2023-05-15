package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.LineaVenta;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.repository.LineaVentaRepository;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.servicebase.BaseServiceImp;

@Service
public class LineaVentaService 
	extends BaseServiceImp<LineaVenta, Long, LineaVentaRepository>{
	
	public double calcularImporte(LineaVenta lv) {
		return lv.getPrecioUnitario()*lv.getCantidad();
	}
}
