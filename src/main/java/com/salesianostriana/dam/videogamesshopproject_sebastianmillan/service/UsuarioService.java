package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Usuario;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.repository.UsuarioRepository;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.servicebase.BaseServiceImp;

@Service
public class UsuarioService 
	extends BaseServiceImp<Usuario, Long, UsuarioRepository>{

}
