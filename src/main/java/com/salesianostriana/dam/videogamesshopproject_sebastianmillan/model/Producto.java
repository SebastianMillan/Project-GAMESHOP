package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@MappedSuperclass
public abstract class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codProducto;

	private String nombre, descripcion, empresa, imagen;
	private LocalDate fechaLanzamiento;
	private double precioBase, calificacion;
	
	public Producto(Long codProducto, String nombre, String descripcion, String empresa, String imagen,
			LocalDate fechaLanzamiento, double precioBase, double calificacion) {
		this.codProducto = codProducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.empresa = empresa;
		this.imagen = imagen;
		this.fechaLanzamiento = fechaLanzamiento;
		this.precioBase = precioBase;
		this.calificacion = calificacion;
	}
	
	
}
