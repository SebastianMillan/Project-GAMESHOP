package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String showLoginForm(Model model) {
		return "form_inicion_sesion";
	}
	
	@GetMapping("/login/submit")
	public String processLoginForm(Model model) {
		return "index";
	}
}
