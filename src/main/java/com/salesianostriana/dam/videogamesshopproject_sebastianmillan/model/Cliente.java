package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Cliente {

	@Id
	private String dni;
	
	private String nombre, apellidos, email, contrasenya, telefono;
	private LocalDate fechaNacim;
	private int puntos;
	
	@OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
	@Builder.Default
	private List<Venta> ventas = new ArrayList<>();
	
}
