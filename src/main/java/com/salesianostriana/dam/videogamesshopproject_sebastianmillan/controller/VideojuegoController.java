package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VideojuegoController {

	@GetMapping("/formVideojuego")
	public String showFormVideojuego(Model model) {

		//Videojuego videojuego = new Videojuego();
		return "form_videojuego";	
	}
}
