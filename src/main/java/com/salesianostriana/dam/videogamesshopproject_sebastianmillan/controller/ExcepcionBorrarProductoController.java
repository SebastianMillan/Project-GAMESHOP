package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExcepcionBorrarProductoController {

	public String excepcionBorrarProducto(Model model, ExcepcionBorrarProductoController exDelProd) {
		model.addAttribute("exDelProd", exDelProd);
		return "";
	}
	
}
