package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
//@MappedSuperclass
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Producto {

	@Id
	@GeneratedValue
	protected Long id;

	protected String nombre, descripcion, empresa, imagen;
	
	@Column(name="fecha_lanzamiento")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	protected LocalDate fechaLanzamiento;
	
	@Column(name="precio_base")
	protected double precioBase;
	
	protected double calificacion;
	
	
}
