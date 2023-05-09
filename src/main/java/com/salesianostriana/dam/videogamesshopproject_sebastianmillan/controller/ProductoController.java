package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProductoController {
	
	@GetMapping("/formVideojuego")
	public String showFormVideojuego(Model model) {
		//Producto videojuego = new Producto();
		return "form_videojuego";	
	}


}
