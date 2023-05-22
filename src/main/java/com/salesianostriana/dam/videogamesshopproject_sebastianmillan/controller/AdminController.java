package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.ProductoService;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.UsuarioService;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.VentaService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private VentaService ventaService;
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/")
	public String mostrarListaVideojuegos(Model model) {
		model.addAttribute("videojuegos", productoService.findAll());
		return "/admin/lista_videojuegos";
	}
	
	@GetMapping("/clientes")
	public String mostrarListaClientes(Model model) {
		model.addAttribute("usuarios", usuarioService.findAll());
		return "/admin/lista_usuarios";
	}
	
	@GetMapping("/ventas")
	public String mostrarListaVentas(Model model) {
		model.addAttribute("ventas", ventaService.findAll());
		return "/admin/lista_ventas";
	}
	
	@GetMapping("/estadisticas")
	public String mostrarEstadisticas(Model model) {
		if(ventaService.findProdMasVendido()!=null) {
			model.addAttribute("prodMasVendido",ventaService.findProdMasVendido());
			model.addAttribute("cantVentasProdMasVendido", ventaService.ventasProdMasVendido());
			model.addAttribute("gananciaTotal", ventaService.calcularGananciasTotales());
			model.addAttribute("gananciasSwitch",ventaService.calcularGananciaByPlataforma("Nintendo Switch"));
			model.addAttribute("gananciasPS4",ventaService.calcularGananciaByPlataforma("Playstation 4"));
			model.addAttribute("gananciasXBOX",ventaService.calcularGananciaByPlataforma("Xbox one"));
			return "/admin/admin_estadisticas";
		}else {
			return "redirect:/admin/ventas";
		}
		
	}
	
}
