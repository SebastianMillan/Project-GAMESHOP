package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Producto;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Usuario;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.ProductoService;

@Controller
public class MainController {

	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/")
	public String indice(@AuthenticationPrincipal Usuario u, Model model) {
		model.addAttribute("listaProductos", productoService.findAll());
		model.addAttribute("esAdmin", u.isAdmin());
		return "index";	
	}
	
	@GetMapping("/videojuego/{id}")
	public String mostrarDetalle(@PathVariable("id") Long id, Model model) {
		
		Producto p = productoService.findById(id).get();
		if (p != null) {
			model.addAttribute("producto", p);
			return "producto_detalle";
		}
		return "redirect:/";
	}
}
