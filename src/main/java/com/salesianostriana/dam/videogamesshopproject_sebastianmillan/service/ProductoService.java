package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Consola;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Producto;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Videojuego;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.repository.ProductoRepository;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.servicebase.BaseServiceImp;

@Service
public class ProductoService 
	extends BaseServiceImp<Producto, Long, ProductoRepository>{

	
	public List<Producto> findAllVideojuegos(){
		List<Producto> lista = new ArrayList<>();
		return lista.stream()
				.filter(x -> x instanceof Videojuego)
				.collect(Collectors.toList());
	}
	
	public List<Producto> findAllConsolas(){
		List<Producto> lista = new ArrayList<>();
		return lista.stream()
				.filter(x -> x instanceof Consola)
				.collect(Collectors.toList());
	}
}
