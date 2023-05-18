package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Usuario;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/user/profile")
	public String me(@AuthenticationPrincipal Usuario usuario, Model model) {
		model.addAttribute("usuario", usuario);
		model.addAttribute("edic", false);
		return "perfil";
	}
	
	@PostMapping("/user/profile/editProfile")
	public String editProfile(@AuthenticationPrincipal Usuario u, Model model) {
		model.addAttribute("usuario", u);
		model.addAttribute("edic", true);
		return "perfil";
	}
	
	@PostMapping("/user/profile/editProfile/submit")
	public String processEditProfile(@ModelAttribute("usuario") Usuario usuario) {
		if(usuario.isAdmin()) {
			usuario.setPassword("{bcrypt}$2a$10$RlcLSXIvm8VDjEBq19oB7OFEB3sJnxvJETStFrBeHwU1pYc0EGTTa");
		}else {
			usuario.setPassword("{bcrypt}$2a$10$bnFKD2JlOON0nuv94.KPqumWUSa9LORejpDtcumz/Vlg/diEjajzi");
		}
		Usuario usuarioEdit = usuarioService.save(usuario);
		Authentication auth = new 
				UsernamePasswordAuthenticationToken(usuarioEdit, null, usuarioEdit.getAuthorities());
		
		SecurityContextHolder.getContext().setAuthentication(auth);
		
		return "redirect:/user/profile";
	}
	
	@GetMapping("/user/ventas")
	public String showUserVentas(@AuthenticationPrincipal Usuario u, Model model){
		model.addAttribute("misCompras", u.getVentas());
		return "perfil_venta";
	}
	
	@GetMapping("/addUsuario")
	public String showFormAddUsuario(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "form_cliente";
	}
	
	@PostMapping("/addUsuario/submit")
	public String processFormAddUsuario(@ModelAttribute("usuario") Usuario u) {
		usuarioService.save(u);
		return "redirect:/admin/clientes";
	}
	
	@GetMapping("/editUsuario/{id}")
	public String showFormEditUsuario(@PathVariable("id") long id, Model model) {
		Usuario uEditar = usuarioService.findById(id).get();
		if(uEditar!=null) {
			model.addAttribute("usuario", uEditar);
			return "form_cliente";
		}else {
			return "redirect:/admin/clientes";
		}
	}
	
	@PostMapping("/editUsuario/submit")
	public String processFormEditUsuario(@ModelAttribute("usuario") Usuario u) {
		usuarioService.save(u);
		return "redirect:/admin/clientes";
	}
	
	@GetMapping("/deleteUsuario/{id}")
	public String deleteUsuario(@PathVariable("id") long id, Model model) {
		Usuario userEncont = usuarioService.findById(id).get();
		
		if(usuarioService.countNumVentasByUser(userEncont) == 0) {
			usuarioService.delete(userEncont);
		}else {
			return "redirect:/admin/clientes/?error=true";
		}
		return "redirect:/admin/clientes";
	}
	
}
