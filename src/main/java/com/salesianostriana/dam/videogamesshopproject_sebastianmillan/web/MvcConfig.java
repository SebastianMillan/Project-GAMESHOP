package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/login");
		registry.addViewController("/admin").setViewName("admin/lista_videojuegos");
		registry.addViewController("/user/profile").setViewName("perfil");
	}
	
}

