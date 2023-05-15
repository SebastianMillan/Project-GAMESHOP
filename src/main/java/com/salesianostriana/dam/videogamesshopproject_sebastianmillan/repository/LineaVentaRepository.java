package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.LineaVenta;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Producto;

public interface LineaVentaRepository extends JpaRepository<LineaVenta, Long>{

	@Query("select lv from LineaVenta lv where lv.producto = ?1")
	Optional<LineaVenta> findByProducto(Producto producto);
}
