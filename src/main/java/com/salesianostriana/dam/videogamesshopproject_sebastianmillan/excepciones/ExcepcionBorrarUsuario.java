package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.excepciones;

public class ExcepcionBorrarUsuario extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ExcepcionBorrarUsuario() {
		
	}
	public ExcepcionBorrarUsuario(String mensaje) {
		super("No se puede eliminar un usuario que tiene ventas asociadas");
	}
}
