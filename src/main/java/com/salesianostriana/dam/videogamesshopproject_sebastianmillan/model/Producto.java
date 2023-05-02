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
public class Producto {

	@Id
	@GeneratedValue
	private Long codProducto;

	private String nombre, descripcion, empresa, imagen;
	private LocalDate fechaLanzamiento;
	private double precioBase, calificacion;
}
