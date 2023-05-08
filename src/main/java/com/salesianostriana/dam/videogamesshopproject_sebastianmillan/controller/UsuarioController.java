package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Usuario;

@Controller
@RequestMapping("/user")
public class UsuarioController {

	/*
	@GetMapping("/me")
	public String me() {
		Usuario u = (Usuario) SecurityContextHolder
			.getContext()
			.getAuthentication()
			.getPrincipal();
		return "";
	}
	*/
	
	@GetMapping("/me")
	public String me(@AuthenticationPrincipal Usuario u) {
		return "";
	}
}
