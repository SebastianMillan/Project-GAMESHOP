package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Cliente;

@Controller
public class ClienteController {

	@GetMapping("/cliente")
	public String showFormCliente(Model model) {
		
		Cliente cliente = new Cliente();
		model.addAttribute("clienteForm", cliente);
		
		return "form_cliente";
	}
}
