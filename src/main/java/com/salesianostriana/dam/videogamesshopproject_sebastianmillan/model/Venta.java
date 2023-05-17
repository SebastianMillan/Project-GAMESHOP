package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

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
	private boolean isOpen;
	
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime fecha;
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name="fk_venta_cliente"))
	private Usuario usuario;
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy = "venta", cascade=CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@Builder.Default
	private List<LineaVenta> lineasVenta = new ArrayList<>();
	
	//Métodos helper para las asociaciones con cliente
	public void addToUsuario(Usuario usuario) {
		this.usuario = usuario;
		usuario.getVentas().add(this);
	}
	public void removeFromUsuario(Usuario usuario) {
		this.usuario=null;
		usuario.getVentas().remove(this);
	}
	
	//Métodos helper para las asociaciones con linea de venta
	public void addLineaVenta(LineaVenta lineaVenta) {
		lineaVenta.setVenta(this);
		this.getLineasVenta().add(lineaVenta);
	}
	public void removeLineaVenta(LineaVenta lineaVenta) {
		lineaVenta.setVenta(null);
		this.getLineasVenta().remove(lineaVenta);
	}
	
}
