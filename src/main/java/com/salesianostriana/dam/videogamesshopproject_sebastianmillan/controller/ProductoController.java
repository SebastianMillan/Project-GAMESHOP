package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.ProductoService;

@Controller
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;

<<<<<<< HEAD
	@GetMapping("/indice")
	public String indice(Model model) {
		//model.addAttribute("listaProductos", productoService.findAll());
		return "index";	
	}

=======
	@GetMapping("/productos")
	public String lista(Model model) {
		//model.addAttribute("listaProductos", productoService.findAll());
		return "index";	
	}
	
	@GetMapping("/addVideojuego")
	public String showAdminVideojuego(Model model) {
		return "admin_videojuego";
	}
	
>>>>>>> hu02-form-videojuego
}
