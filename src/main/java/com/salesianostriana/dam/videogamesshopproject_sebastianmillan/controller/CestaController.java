package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.LineaVenta;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Producto;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.CestaService;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.LineaVentaService;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.ProductoService;

@Controller
public class CestaController {

	@Autowired
	private CestaService cestaService;
	
	@Autowired
	private LineaVentaService lineaVentaService;
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/venta")
	public String showCarrito(Model model) {
		if(model.addAttribute("venta", cestaService.getLineasVentaInCart()) == null) {
			return "redirect:/";
		}
		return "venta";
	}
	
	@GetMapping("/addLineaVenta/{id}")
	public String addLineaVenta(@PathVariable("id") Long id, Model model) {

        Producto p = productoService.findById(id).get();
        
		LineaVenta lv = new LineaVenta();
		lv.setCantidad(1);
		lv.setProducto(p);
		lv.setPrecioUnitario(p.getPrecioBase());
		lv.setImporte(lineaVentaService.calcularImporte(lv));
		
		lineaVentaService.save(lv);
		cestaService.addLineaVenta(lv);
		
		return "redirect:/venta";
	}
	
	@GetMapping("/deleteLineaVenta/{id}")
    public String deleteLineaVenta(@PathVariable("id") Long id) {
        
    	cestaService.removeLineaVenta(lineaVentaService.findById(id).get());
        return "redirect:/venta";
    }
	
	@ModelAttribute("importe_total")
	public double calcularImporteTotal() {
		if(cestaService.getLineasVentaInCart()!=null) {
			return cestaService.getLineasVentaInCart().stream()
					.mapToDouble(x -> x.getImporte())
					.sum();
		}else {
			return 0.0;
		}
	}
}
