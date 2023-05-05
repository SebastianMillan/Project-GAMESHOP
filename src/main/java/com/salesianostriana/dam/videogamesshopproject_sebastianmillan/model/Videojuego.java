package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Videojuego {

	//Como todavía no se como hacer herencias en Spring colocaré todos los atributos de la madre, productos
	@Id
	@GeneratedValue
	private Long codProducto;

	private String nombre, descripcion, empresa, imagen;
	private LocalDate fechaLanzamiento;
	private double precioBase, calificacion;
	
	private VideojuegoGenero genero;
	private VideojuegoPEGI pegi;
	private boolean esEdicColeccionista;
	private VideojuegoTipoDesarrollo tipoDesarrollo;
	private boolean esParaReservar;
	//private Consola plataforma;
	
}
