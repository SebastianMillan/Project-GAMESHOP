package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
//@MappedSuperclass
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Producto {

	@Id
	@GeneratedValue
	protected Long id;

	protected String nombre, descripcion, empresa, imagen;
	
	@Column(name="fecha_lanzamiento")
	protected LocalDate fechaLanzamiento;
	
	@Column(name="precio_base")
	protected double precioBase;
	
	protected double calificacion;
	
	
}
