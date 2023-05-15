package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.CestaService;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.LineaVentaService;

@Controller
public class CestaController {

	@Autowired
	private CestaService cestaService;
	
	@Autowired
	private LineaVentaService lineaVentaService;
	
	@GetMapping("/venta")
	public String showCarrito(Model model) {
		if(model.addAttribute("venta", cestaService.getLineasVentaInCart()) == null) {
			return "redirect:/";
		}
		return "venta";
	}
	
	/*
	@GetMapping("/lineaVentaAddVenta/{id}")
	public String lineaVentaAddVenta(@PathVariable("id") Long id, Model model) {
		cestaService.addLineaVenta(lineaVentaService.);
		return "redirect:/venta";
	}
	*/
}
