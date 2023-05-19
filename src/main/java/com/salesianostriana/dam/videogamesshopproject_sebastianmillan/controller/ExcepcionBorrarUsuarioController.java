package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.excepciones.ExcepcionBorrarUsuario;

@ControllerAdvice
public class ExcepcionBorrarUsuarioController {

	@ExceptionHandler (ExcepcionBorrarUsuario.class)	
	public String excepcionBorrarUsuario(Model model, ExcepcionBorrarUsuarioController exDelUs) {
		model.addAttribute("exdelUs", exDelUs);
		return "";
	}
}
