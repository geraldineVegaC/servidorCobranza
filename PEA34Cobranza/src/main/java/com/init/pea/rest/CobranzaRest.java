package com.init.pea.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.init.pea.iservice.IDeuda;
import com.init.pea.iservice.IDocVenta;
import com.init.pea.iservice.IPago;
import com.init.pea.modelo.Deuda;
import com.init.pea.modelo.Docventa;
import com.init.pea.modelo.Pago;



@RestController
@RequestMapping("/cobranza")
public class CobranzaRest {

	@Autowired
	private IPago pagosService;
	
	@Autowired
	private IDeuda deudaService;
	
	@Autowired
	private IDocVenta docventaService;
	
	/*--------------------------PAGO--------------------------*/
	
	@GetMapping("/listarPago")
	public List<Pago> listarPago(){
		return pagosService.listarPago();
	}
	
	
	@PostMapping("/guardarPago")
	public void guardarPago(@RequestBody Pago pago) {
		int estado = pagosService.guardarPago(pago);
	}
	
	
	/*--------------------------DEUDA--------------------------*/
	
	@GetMapping("/listarDeuda")
	public List<Deuda> listarDeuda(){
		return deudaService.listarTodo();
	}
	
	@PostMapping("/guardarDeuda")
	public void agregarDeuda(@RequestBody Deuda du) {
		int estado = deudaService.guardarDeuda(du);
	}
	
	@PutMapping("/actualizarDeuda")
	public void actualizarDeuda(@RequestBody Deuda du) {
		int estado = deudaService.actualizarDeuda(du);
	}
	/*--------------------------DOCVENTA--------------------------*/
	
	@GetMapping("/listarDocVenta")
	public List<Docventa> listarDocVenta(){
		return docventaService.listarDocventa();
	}
	
	
}
