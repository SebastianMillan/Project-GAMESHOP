package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConsolaController {

	@GetMapping("/admin/formConsola")
	public String showFormConsola(Model model) {
		//model.addAttribute("consola", new Consola());
		return "form_consola";	
	}
}
