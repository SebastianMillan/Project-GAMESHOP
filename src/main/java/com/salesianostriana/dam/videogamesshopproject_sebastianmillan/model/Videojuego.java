package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor
//@EqualsAndHashCode(callSuper = true)
//@ToString(callSuper = true)
@Entity
public class Videojuego extends Producto{
	
	private VideojuegoGenero genero;
	private VideojuegoPEGI pegi;
	private boolean esEdicColeccionista;
	private VideojuegoTipoDesarrollo tipoDesarrollo;
	private boolean esParaReservar;
	//private Consola plataforma;
	
	public Videojuego(Long codProducto, String nombre, String descripcion, String empresa, String imagen,
			LocalDate fechaLanzamiento, double precioBase, double calificacion, VideojuegoGenero genero,
			VideojuegoPEGI pegi, boolean esEdicColeccionista, VideojuegoTipoDesarrollo tipoDesarrollo,
			boolean esParaReservar) {
		super(codProducto, nombre, descripcion, empresa, imagen, fechaLanzamiento, precioBase, calificacion);
		this.genero = genero;
		this.pegi = pegi;
		this.esEdicColeccionista = esEdicColeccionista;
		this.tipoDesarrollo = tipoDesarrollo;
		this.esParaReservar = esParaReservar;
	}
	
	
	
	
}
