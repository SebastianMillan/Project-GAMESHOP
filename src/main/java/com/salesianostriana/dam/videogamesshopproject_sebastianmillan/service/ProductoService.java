package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Producto;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.repository.ProductoRepository;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.servicebase.BaseServiceImp;

@Service
public class ProductoService 
	extends BaseServiceImp<Producto, Long, ProductoRepository>{

}
