package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long>{

	@Query("select count(ln) from LineaVenta ln where ln.venta = ?1")
	int countNumLinVentasByVentas(Venta venta);
	
	@Query("select v from Venta v where v.isOpen = true")
	List<Venta> collectByIsOpen();
}
