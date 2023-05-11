package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@GetMapping("/addUsuario")
	public String showFormAddUsuario(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "form_cliente";
	}
	
	@PostMapping("/addUsuario/submit")
	public String processFormAddUsuario(@ModelAttribute("usuario") Usuario u) {
		usuarioService.save(u);
		return "redirect:/admin/clientes";
	}
	
	@GetMapping("/editUsuario/{dni}")
	public String showFormEditUsuario(@PathVariable("dni") String dni, Model model) {
		Usuario uEditar = usuarioService.findByDNI(dni).get();
		if(uEditar!=null) {
			model.addAttribute("usuario", uEditar);
			return "form_cliente";
		}else {
			return "redirect:/admin/clientes";
		}
	}
	
	@GetMapping("/editUsuario/submit")
	public String processFormEditUsuario(@ModelAttribute("usuario") Usuario u) {
		usuarioService.save(u);
		return "redirect:/admin/clientes";
	}
	
	@GetMapping("/deleteUsuario/{id}")
	public String deleteUsuario(@PathVariable("dni") String dni) {
		usuarioService.deleteByDNI(dni);
		return "redirect:/admin/clientes";
		
	}
}
