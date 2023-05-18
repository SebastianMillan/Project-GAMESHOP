package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.LineaVenta;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.LineaVentaPK;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Producto;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Usuario;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Venta;
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
		model.addAttribute("ventaCompleta", ventaService.findByOpen());
		if(model.addAttribute("venta", ventaService.findByOpen().getLineasVenta())==null) {
			return "redirect:/";
		}
		return "venta";
	}
	
	@GetMapping("/addLineaVenta/{id}")
	public String addLineaVenta(@AuthenticationPrincipal Usuario usuario, @PathVariable("id") Long id, Model model) {

        Producto p = productoService.findById(id).get();
        
        if(ventaService.isVentasOpen()) {
        	Venta ventaOpen = ventaService.findByOpen();
        	LineaVenta lvEncontrada = ventaService.findByIDProducto(ventaOpen, id).orElse(null);
        	
        	if(lvEncontrada!=null) {
        		ventaService.addLineaVenta(ventaOpen, lvEncontrada);
        		lvEncontrada.setImporte(lvEncontrada.getCantidad()*lvEncontrada.getPrecioUnitario());
        		ventaOpen.setImporteTotal(calcularImporteTotal());
        		ventaService.save(ventaOpen);
        	}else {
        		LineaVenta lv = new LineaVenta();
            	lv.setCantidad(1);
            	lv.setPrecioUnitario(p.getPrecioBase());
            	lv.setProducto(p);
            	lv.setImporte(lv.getCantidad()*lv.getPrecioUnitario());
            	ventaService.addLineaVenta(ventaOpen, lv);
            	ventaOpen.setImporteTotal(calcularImporteTotal());
            	ventaService.save(ventaOpen);
        	}
        	
        }else {
        	Venta v = new Venta();
        	v.setFecha(LocalDateTime.now());
        	v.addToUsuario(usuario);
        	v.setOpen(true);
        	LineaVenta lv = new LineaVenta();
        	//El id de la linea de venta no puede ser null
        	//lv.setLineaVentaPK(new LineaVentaPK());
        	lv.setCantidad(1);
        	lv.setPrecioUnitario(p.getPrecioBase());
        	lv.setProducto(p);
        	lv.setImporte(lv.getCantidad()*lv.getPrecioUnitario());
        	ventaService.addLineaVenta(v, lv);
        	ventaService.save(v);
        	v.setImporteTotal(calcularImporteTotal());
        	ventaService.save(v);
        }
		
		return "redirect:/venta";
	}
	
	@GetMapping("/deleteLineaVenta/{lineaVenta_id}")
    public String deleteLineaVenta(@PathVariable("lineaVenta_id") Long lineaVenta_id) {
        LineaVenta lvEncontrada = ventaService.findByIDLineaVenta(lineaVenta_id).orElse(null);
    	if(lvEncontrada!=null) {
    		ventaService.removeLineaVenta(ventaService.findByOpen(), lvEncontrada);
    		ventaService.save(ventaService.findByOpen());
    	}else {
    		return "redirect:/venta";
    	}
        return "redirect:/venta";
    }
	
	@GetMapping("/processVenta")
	public String processVenta() {
		ventaService.findByOpen().setImporteTotal(calcularImporteTotal());
		ventaService.findByOpen().setOpen(false);
		ventaService.save(ventaService.findByOpen());
        return "redirect:/";
	}
	
	@ModelAttribute("importe_total")
	public double calcularImporteTotal() {
		return ventaService.calcularImporteTotal(ventaService.findByOpen());
	}
}
