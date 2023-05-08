package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model;

import java.time.LocalDateTime;

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
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private double importeTotal;
	private LocalDateTime fecha;
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name="fk_venta_cliente"))
	private Usuario usuario;
	
	//Métodos helper para las asociaciones con cliente
	public void addToCliente(Usuario cliente) {
		this.usuario = cliente;
		cliente.getVentas().add(this);
	}
	public void removeFromCurso(Usuario cliente) {
		this.usuario=null;
		cliente.getVentas().remove(this);
	}
}
