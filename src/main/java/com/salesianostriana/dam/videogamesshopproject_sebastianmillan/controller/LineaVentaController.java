package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.LineaVenta;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Producto;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.LineaVentaService;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.ProductoService;

@Controller
public class LineaVentaController {

	@Autowired
	private LineaVentaService lineaVentaService;
	
	@Autowired
	private ProductoService productoService;
	
	public LineaVenta crearLineaVenta(Producto p) {
		return LineaVenta.builder()
			.id(p.getId()*100)
			.cantidad(1)
			.producto(p)
			.precioUnitario(p.getPrecioBase())
			.importe(p.getPrecioBase()*1)
			.build();
	}
	
	@GetMapping("/crearLineaVenta/{id}")
	public String createLineaVenta(@PathVariable("id") Long id, Model model) {
		lineaVentaService.save(crearLineaVenta(productoService.findById(id).get()));
		return "redirect:/venta";
	}
	
}
