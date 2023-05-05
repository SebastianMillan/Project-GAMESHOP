package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdministradorController {

	@GetMapping("/")
	public String showVistaAdmin(Model model) {
		return "admin/vista_admin";
	}
}
