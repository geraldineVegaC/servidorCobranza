package com.init.pea.iservice;

import java.util.List;

import com.init.pea.modelo.Pago;



public interface IPago {
	public List<Pago> listarPago();
	public int guardarPago(Pago pag);
	
}
