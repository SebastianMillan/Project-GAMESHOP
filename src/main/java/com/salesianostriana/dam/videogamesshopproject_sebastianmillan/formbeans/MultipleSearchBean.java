package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.formbeans;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.VideojuegoGenero;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.VideojuegoPEGI;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MultipleSearchBean {

	private String plataforma;
	private VideojuegoGenero genero;
	private VideojuegoPEGI pegi;
	
}
