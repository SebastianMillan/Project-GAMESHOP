package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.ProductoService;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.UsuarioService;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.VentaService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private VentaService ventaService;
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/")
	public String mostrarListaVideojuegos(Model model) {
		model.addAttribute("videojuegos", productoService.findAll());
		return "lista_videojuegos";
	}
	
	@GetMapping("/clientes")
	public String mostrarListaClientes(Model model) {
		model.addAttribute("usuarios", usuarioService.findAll());
		return "lista_usuarios";
	}
	
	@GetMapping("/ventas")
	public String mostrarListaVentas(Model model) {
		model.addAttribute("ventas", ventaService.findAll());
		return "lista_ventas";
	}
	
}
