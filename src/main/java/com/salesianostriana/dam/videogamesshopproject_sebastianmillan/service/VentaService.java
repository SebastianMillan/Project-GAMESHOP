package com.salesianostriana.dam.videogamesshopproject_sebastianmillan.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.LineaVenta;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Usuario;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.model.Venta;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.repository.VentaRepository;
import com.salesianostriana.dam.videogamesshopproject_sebastianmillan.servicebase.BaseServiceImp;

@Service
public class VentaService 
	extends BaseServiceImp<Venta, Long, VentaRepository>{
	
	@Autowired
	private VentaRepository ventaRepository;
	
	public double cargarPrecio(Venta venta) {
		double importeTotal;
		
		List<LineaVenta> lineasVenta = venta.getLineasVenta();
		
		importeTotal= lineasVenta.stream()
				.mapToDouble(x -> x.getImporte())
				.sum();
		
		return importeTotal;
	}
	
	public boolean isVentasOpen() {
		if(findByOpen()!=null) {
			return true;
		}else {
			return false;
		}
	}
	
	public List<Venta> findAllOpen(){
		return ventaRepository.collectByIsOpen();
	}
	
	public Venta findByOpen() {
		return ventaRepository.collectByIsOpen().stream()
				.findFirst()
				.orElse(null);
		
	}
	
	public void addLineaVenta(Venta venta, LineaVenta lineaVenta) {
		if(venta.getLineasVenta().contains(lineaVenta)) {
			lineaVenta.setCantidad(lineaVenta.getCantidad()+1);
			//venta.addLineaVenta(lineaVenta);
		}else {
			venta.addLineaVenta(lineaVenta);
		}
	}
	
	public void removeLineaVenta(Venta venta, LineaVenta lineaVenta) {
		if(venta.getLineasVenta().contains(lineaVenta)) {
			if(lineaVenta.getCantidad()>1) {
				lineaVenta.setCantidad(lineaVenta.getCantidad()-1);
				lineaVenta.setImporte(lineaVenta.getPrecioUnitario()*lineaVenta.getCantidad());
				venta.setImporteTotal(calcularImporteTotal(venta));
			}else if (lineaVenta.getCantidad()==1){
				venta.removeLineaVenta(lineaVenta);
				venta.setImporteTotal(calcularImporteTotal(venta));
			}
		}
	}
	
	public List<LineaVenta> getLineasVentaCarrito(Venta venta){
		if(venta!=null) {
			return Collections.unmodifiableList(venta.getLineasVenta());
		}else {
			return null;
		}
		
	}
	
	
	@ModelAttribute("importe_total")
	public double calcularImporteTotal(Venta venta) {
		if(getLineasVentaCarrito(venta)!=null) {
			return venta.getLineasVenta().stream()
					.mapToDouble(x -> x.getImporte())
					.sum();
		}else {
			return 0.0;
		}
	}
	
	public Optional<LineaVenta> findByIDLineaVenta(long lineaVenta_id){
		return findByOpen().getLineasVenta().stream()
					.filter(x -> x.getLineaVentaPK().getLineaVenta_id()==lineaVenta_id)
					.findAny();
	}
	
	public Optional<LineaVenta> findByIDProducto(Venta venta, long prod_id){
		return venta.getLineasVenta().stream()
    	        .filter(x -> x.getProducto().getId()==prod_id)
    	        .findFirst();
	}
	
	public List<Venta> findByUsuario(Usuario usuario){
		return ventaRepository.findByUsuario(usuario);
	}
}
