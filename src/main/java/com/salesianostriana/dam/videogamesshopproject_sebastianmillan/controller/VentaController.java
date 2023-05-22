package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.LineaVenta;
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
		Venta carrito = ventaService.findByOpen();
		if(carrito!=null) {
			model.addAttribute("ventaCompleta", carrito);
			if(model.addAttribute("venta", carrito.getLineasVenta())==null) {
				return "redirect:/";
			}
			return "venta";
		}
		return "redirect:/"; 
	}
	
	@GetMapping("/venta/{id}")
	public String detalleVenta(@AuthenticationPrincipal Usuario usuario, @PathVariable("id") long id, Model model) {
		if(ventaService.findById(id)!=null) {
			List<LineaVenta> LineaVentaEncontrada = ventaService.findById(id).get().getLineasVenta();
			model.addAttribute("venta", LineaVentaEncontrada);	
			model.addAttribute("usuario", usuario);
			return "lista_linea_venta";
		}else {
			return "redirect:/user/ventas";
		}
		
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
	
	@PostMapping("/actualizarCantidad/{lineaVenta_id}")
	public String actualizarCantidadLV(@PathVariable("lineaVenta_id") Long lineaVenta_id, @RequestParam("cantidad") int cantidad) {
		
        LineaVenta lvEncontrada = ventaService.findByIDLineaVenta(lineaVenta_id).orElse(null);
        if(lvEncontrada!=null) {
        	lvEncontrada.setCantidad(cantidad);
            ventaService.save(ventaService.findByOpen());
            return "redirect:/venta";
        }else {
        	return "redirect:/venta";
        }
	}
	
	@GetMapping("/processVenta")
	public String processVenta(@AuthenticationPrincipal Usuario u) {
		Venta ventaOpen= ventaService.findByOpen();
		if(ventaOpen.getLineasVenta().isEmpty()) {
			return "redirect:/venta";
		}else{
			ventaOpen.setImporteTotal(calcularImporteTotal());
			ventaOpen.setOpen(false);
			ventaOpen.setUsuario(u);
			ventaService.save(ventaOpen);
	        return "redirect:/";
		}
	}
	
	@ModelAttribute("importe_total")
	public double calcularImporteTotal() {
		return ventaService.calcularImporteTotal(ventaService.findByOpen());
	}
}
