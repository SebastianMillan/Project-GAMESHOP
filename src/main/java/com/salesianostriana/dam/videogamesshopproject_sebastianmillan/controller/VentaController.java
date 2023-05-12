package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.VentaService;

@Controller
public class VentaController {
	
	@Autowired
	private VentaService ventaService;
	
	@GetMapping("/deleteVenta/{id}")
	public String deleteVenta(@PathVariable("id") long id) {
		ventaService.deleteById(id);
		return "redirect:/admin/ventas";
	}
}
