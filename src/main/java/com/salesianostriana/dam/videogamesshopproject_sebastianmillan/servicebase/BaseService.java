package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.servicebase;

import java.util.List;
import java.util.Optional;

public interface BaseService<T, ID> {

	List<T> findAll();
	
	Optional<T> findById(ID id);
	
	T save(T t);
	
	T edit(T t);
	
	void delete(T t);
	
	void deleteById(ID id);
}
