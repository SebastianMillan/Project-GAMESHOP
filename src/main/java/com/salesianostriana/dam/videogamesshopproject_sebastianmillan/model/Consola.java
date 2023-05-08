package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model;

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
@Table(name = "consola")
public class Consola extends Producto{

	private String color;
	
	
}
