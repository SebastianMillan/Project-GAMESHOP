package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Usuario implements UserDetails{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String dni, nombre, apellidos, username, email, password, telefono;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaNacim;
	
	private boolean admin;
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
	@Builder.Default
	private List<Venta> ventas = new ArrayList<>();

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		String role = "ROLE_";
		role += (admin) ? "ADMIN" : "USER";
		return List.of(new SimpleGrantedAuthority(role));
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
}
