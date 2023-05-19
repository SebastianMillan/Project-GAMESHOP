package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.excepciones;

public class ExcepcionBorrarProducto extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ExcepcionBorrarProducto() {
		
	}
	public ExcepcionBorrarProducto(String mensaje) {
		super("No se puede eliminar un producto que existe en ventas");
	}
}
