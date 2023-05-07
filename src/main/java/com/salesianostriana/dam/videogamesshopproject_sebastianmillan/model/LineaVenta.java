package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class LineaVenta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private int cantidad;
	private double precioUnitario, importe;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name="fk_lineaventa_producto"))
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name="fk_lineaventa_venta"))
	private Venta venta;
}
