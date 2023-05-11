package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	Optional<Usuario> findFirstByUsername(String username);
	
	Optional<Usuario> findByDni(String dni);
	
	Optional<Usuario> deleteByDni(String dni);

}
