package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.LineaVenta;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Venta;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.repository.VentaRepository;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.servicebase.BaseServiceImp;

@Service
public class VentaService 
	extends BaseServiceImp<Venta, Long, VentaRepository>{
	
	public double cargarPrecio(Venta venta) {
		double importeTotal;
		
		List<LineaVenta> lineasVenta = venta.getLineasVenta();
		
		importeTotal= lineasVenta.stream()
				.mapToDouble(x -> x.getImporte())
				.sum();
		
		return importeTotal;
	}
}
