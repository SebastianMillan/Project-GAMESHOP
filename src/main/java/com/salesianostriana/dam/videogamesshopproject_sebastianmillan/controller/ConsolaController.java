package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConsolaController {

	@GetMapping("/formConsola")
	public String showFormConsola(Model model) {
		//model.addAttribute("listaProductos", productoService.findAll());
		return "form_consola";	
	}
}
