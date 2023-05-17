package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.LineaVenta;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Producto;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Venta;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.CestaService;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.ProductoService;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service.VentaService;

@Controller
public class VentaController {
	
	@Autowired
	private VentaService ventaService;
		
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/deleteVenta/{id}")
	public String deleteVenta(@PathVariable("id") long id) {
		ventaService.deleteById(id);
		return "redirect:/admin/ventas";
	}
	@GetMapping("/venta")
	public String showCarrito(Model model) {
		if(model.addAttribute("venta", ventaService.findAll())==null) {
			return "redirect:/";
		}
		return "venta";
	}
	
	@GetMapping("/addLineaVenta/{id}")
	public String addLineaVenta(@PathVariable("id") Long id, Model model) {

        Producto p = productoService.findById(id).get();
        
        if(ventaService.isVentasOpen()) {
        	Venta ventaOpen = ventaService.findByOpen();
        	
        }else {
        	Venta v = new Venta();
        	LineaVenta lv = new LineaVenta();
            v.setImporteTotal(0);
            v.setOpen(true);
            v.setFecha(LocalDateTime.now());
    		lv.setCantidad(1);
    		lv.setProducto(p);
    		lv.setPrecioUnitario(p.getPrecioBase());
    		//lv.setImporte(lineaVentaService.calcularImporte(lv));
    		
    		
        	ventaService.save(v);
        }
		
		
		//lineaVentaService.save(lv);
		//cestaService.addLineaVenta(lv);
		
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
