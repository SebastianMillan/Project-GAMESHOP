package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Producto;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.VideojuegoGenero;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.VideojuegoPEGI;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

	@Query("select count(lv) from LineaVenta lv where lv.producto = ?1")
	int countNumProductoByLineaVenta(Producto producto);
	
	List<Producto> findByNombreContainingIgnoreCase(String nombre);
	
	List<Producto> findByEmpresaContainingIgnoreCase(String empresa);
	
	@Query("select p from Producto p where p.plataforma = ?1 and p.genero = ?2 and p.pegi = ?3")
	List<Producto> findByPlataformaGeneroPegi(String plataforma, VideojuegoGenero genero, VideojuegoPEGI pegi);
	
}
