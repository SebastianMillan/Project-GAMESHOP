package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Producto;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.ProductoService;

@Controller
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;

	@GetMapping("/")
	public String indice(Model model) {
		model.addAttribute("listaProductos", productoService.findAll());
		return "index";	
	}
	
	@GetMapping("/formVideojuego")
	public String showFormVideojuego(Model model) {
		//Producto videojuego = new Producto();
		return "form_videojuego";	
	}


}
