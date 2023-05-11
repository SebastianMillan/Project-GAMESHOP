package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Producto;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.ProductoService;


@Controller
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/addVideojuego")
	public String showFormAddVideojuego(Model model) {
		model.addAttribute("producto", new Producto());
		model.addAttribute("pegis", productoService.obtenerValoresPegi());
		model.addAttribute("generos", productoService.obtenerValoresGenero());
		model.addAttribute("tipos", productoService.obtenerValoresTipoDesarrollo());

		return "form_videojuego";	
	}
	
	@PostMapping("/addVideojuego/submit")
	public String processFormAddVideojuego(@ModelAttribute("producto") Producto p) {
		productoService.save(p);
		return "redirect:/admin/";
	}
	
	@GetMapping("/editVideojuego/{id}")
	public String showFormEditVideojuego(@PathVariable("id") long id, Model model) {
		Producto pEditar = productoService.findById(id).get();
		if(pEditar!=null) {
			model.addAttribute("producto", pEditar);
			return "form_videojuego";
		} else {
			return "redirect:/admin/";
		}
		
	}
	@PostMapping("/editVideojuego/submit")
	public String processFormEditVideojuego(@ModelAttribute("producto") Producto p) {
		productoService.save(p);
		return "redirect:/admin/";
	}
	
	@GetMapping("/deleteVideojuego/{id}")
	public String deleteVideojuego(@PathVariable("id") long id) {
		productoService.deleteById(id);
		return "redirect:/admin/";
	}


}
