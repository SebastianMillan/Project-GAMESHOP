package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Usuario;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.repository.UsuarioRepository;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.servicebase.BaseServiceImp;

@Service
public class UsuarioService 
	extends BaseServiceImp<Usuario, Long, UsuarioRepository>{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario findByDNI(String dni) {
		return usuarioRepository.findByDni(dni).get();
	}
	
	public void deleteByDNI(String dni) {
		usuarioRepository.deleteByDni(dni).get();
	}
	
	public int countNumVentasByUser(Usuario usuario) {
		return usuarioRepository.countNumVentasByUser(usuario);
	}
}
