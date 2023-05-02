package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model;

import javax.persistence.Entity;
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
public class Administrador {

	@Id
	private String dni;
	
	private String nombre, apellidos, email, contrasenya;
}
