package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	Optional<Usuario> findFirstByUsername(String username);
	
	@Query("select u from Usuario u where u.dni = ?1")
	Usuario findByDNI(String dni);
	
	@Query("select u from Usuario u where u.dni = ?1")
	Usuario deleteByDNI(String dni);

}
