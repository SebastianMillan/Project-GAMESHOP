package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Producto;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.VideojuegoGenero;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.VideojuegoPEGI;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.VideojuegoTipoDesarrollo;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.repository.ProductoRepository;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.servicebase.BaseServiceImp;

@Service
public class ProductoService 
	extends BaseServiceImp<Producto, Long, ProductoRepository>{

	@Autowired
	private ProductoRepository productoRepository;

	public List<String> obtenerValoresPegi() {
		List<String> listaPegi = new ArrayList<>();

		for(VideojuegoPEGI pegi : VideojuegoPEGI.values()) {
			listaPegi.add(pegi.toString());
		}
		return listaPegi;
	}
	
	public List<String> obtenerValoresGenero(){
		List<String> listaGenero = new ArrayList<>();
		
		for(VideojuegoGenero gene : VideojuegoGenero.values()) {
			listaGenero.add(gene.toString());
		}
		return listaGenero;
		
	}
	
	public List<String> obtenerValoresTipoDesarrollo(){
		List<String> listaTipo = new ArrayList<>();
		
		for(VideojuegoTipoDesarrollo tipo : VideojuegoTipoDesarrollo.values()) {
			listaTipo.add(tipo.toString());
		}
		return listaTipo;
		
	}

	public int countNumProductoByLineaVenta(Producto producto) {
		return productoRepository.countNumProductoByLineaVenta(producto);
	}
}
