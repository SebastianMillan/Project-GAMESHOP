package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

	@Query("select count(lv) from LineaVenta lv where lv.producto = ?1")
	int countNumProductoByLineaVenta(Producto producto);
}
