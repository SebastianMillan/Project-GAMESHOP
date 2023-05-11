package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Usuario;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.repository.UsuarioRepository;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.servicebase.BaseServiceImp;

@Service
public class UsuarioService 
	extends BaseServiceImp<Usuario, Long, UsuarioRepository>{
	
	private UsuarioRepository usuarioRepository;
	
	public Optional<Usuario> findByDNI(String dni) {
		return Optional.of(usuarioRepository.findByDNI(dni));
	}
	
	public Optional<Usuario> deleteByDNI(String dni) {
		return Optional.of(usuarioRepository.deleteByDNI(dni));
	}
}
