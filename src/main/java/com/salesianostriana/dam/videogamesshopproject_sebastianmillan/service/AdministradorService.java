package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Administrador;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.repository.AdministradorRepository;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.servicebase.BaseServiceImp;

@Service
public class AdministradorService 
	extends BaseServiceImp<Administrador, String, AdministradorRepository>{

}
