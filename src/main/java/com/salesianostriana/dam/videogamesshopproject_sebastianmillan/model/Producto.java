package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
public class Producto {

	@Id
	@GeneratedValue
	private Long id;

	private String nombre, descripcion, empresa, imagen, plataforma;
	
	//@Column(name="fecha_lanzamiento")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaLanzamiento;
	
	//@Column(name="precio_base")
	private double precioBase;
	
	private double calificacion;
    
	@Enumerated(EnumType.STRING)
	private VideojuegoGenero genero;
	
	@Enumerated(EnumType.STRING)
	private VideojuegoPEGI pegi;
	
	//@Column(name = "es_edic_coleccionista")
	private boolean esEdicColeccionista;
	
	//@Column(name = "tipo_desarrollo")
	@Enumerated(EnumType.STRING)
	private VideojuegoTipoDesarrollo tipoDesarrollo;
	
	//@Column(name = "es_para_reservar")
	private boolean esParaReservar;
	
	
}
