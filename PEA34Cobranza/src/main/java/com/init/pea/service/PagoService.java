package com.init.pea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.init.pea.dao.PagoDAO;
import com.init.pea.iservice.IPago;
import com.init.pea.modelo.Pago;

@Service
public class PagoService implements IPago{

	@Autowired
	private PagoDAO repoPago;
	
	@Override
	public List<Pago> listarPago() {	
		return (List<Pago>)repoPago.findAll();
	}

	@Override
	public int guardarPago(Pago pag) {
		if (pag == null) {
			return 0;
		}
		repoPago.save(pag);
		return 1;
	}

	

}
