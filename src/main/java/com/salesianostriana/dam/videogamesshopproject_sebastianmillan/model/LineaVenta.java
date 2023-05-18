package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class LineaVenta {

	@EmbeddedId
	@Builder.Default
	private LineaVentaPK lineaVentaPK = new LineaVentaPK();
	
	private int cantidad;
	private double precioUnitario, importe;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name="fk_lineaventa_producto"))
	private Producto producto;
	
	@ManyToOne
	@MapsId("venta_id")
	@JoinColumn(name="venta_id")
	private Venta venta;

}
