package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Cliente;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.repository.ClienteRepository;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.servicebase.BaseServiceImp;

@Service
public class ClienteService 
	extends BaseServiceImp<Cliente, String, ClienteRepository>{

}
