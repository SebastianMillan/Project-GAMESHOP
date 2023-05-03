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

	@GetMapping("/indice")
	public String indice(Model model) {
		//model.addAttribute("listaProductos", productoService.findAll());
		return "index";	
	}
	@GetMapping("/formCliente")
	public String lista(Model model) {
		//model.addAttribute("listaProductos", productoService.findAll());
		return "index";	
	}

	@GetMapping("/productoDetalle")
	public String detalle(Model model) {
		//model.addAttribute("listaProductos", productoService.findAll());
		return "producto_detalle";	
	}
	@GetMapping("/consolaAdmin")
	public String admin(Model model) {
		//model.addAttribute("listaProductos", productoService.findAll());
		return "admin_consola";	
	}
}
