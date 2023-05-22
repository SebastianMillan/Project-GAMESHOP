package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.formbeans.SearchBean;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Producto;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Usuario;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.ProductoService;

@Controller
public class MainController {

	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/")
	public String indice(@AuthenticationPrincipal Usuario u, Model model) {
		List<Producto> allProductos = productoService.findAll();
		Collections.shuffle(allProductos);
		model.addAttribute("listaProductos", allProductos);
		model.addAttribute("esAdmin", u.isAdmin());
		model.addAttribute("formBuscar", new SearchBean());
		return "index";	
	}
	
	@PostMapping("/buscar")
	public String buscarProducto(@ModelAttribute("formBuscar") SearchBean searchBean, Model model) {
		model.addAttribute("listaProductos", productoService.findByNombre(searchBean.getSearch()));
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
