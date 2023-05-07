package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
//@ToString(callSuper = true)
@Entity
@Table(name = "videojuego")
public class Videojuego extends Producto{
	
	private VideojuegoGenero genero;
	private VideojuegoPEGI pegi;
	
	@Column(name = "es_edic_coleccionista")
	private boolean esEdicColeccionista;
	
	@Column(name = "tipo_desarrollo")
	private VideojuegoTipoDesarrollo tipoDesarrollo;
	
	@Column(name = "es_para_reservar")
	private boolean esParaReservar;
	//private Consola plataforma;
	
}
