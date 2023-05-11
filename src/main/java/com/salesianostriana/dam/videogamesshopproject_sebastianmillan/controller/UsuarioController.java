package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Usuario;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/user/profile")
	public String me(@AuthenticationPrincipal Usuario u) {
		return "perfil";
	}
	
	public String showFormAddUsuario(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "form_cliente";
	}
}
