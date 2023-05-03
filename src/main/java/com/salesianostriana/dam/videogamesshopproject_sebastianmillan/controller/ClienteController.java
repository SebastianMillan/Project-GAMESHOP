package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Cliente;

@Controller
public class ClienteController {

	@GetMapping("/cliente")
	public String showFormCliente(Model model) {
		
		Cliente cliente = new Cliente();
		model.addAttribute("clienteForm", cliente);
		
		return "form_cliente";
	}
	
	@PostMapping("/addCliente")
	public String submit(@ModelAttribute("clienteForm") Cliente cliente, Model model) {
		
		model.addAttribute("cliente", cliente);
		//Devuelve el formulario de nuevo porque todavía no se guardarlo en la BBDD
		return "form_cliente";
	}
}
