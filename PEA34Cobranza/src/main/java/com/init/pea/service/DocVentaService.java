package com.init.pea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.init.pea.dao.DocVentaDAO;
import com.init.pea.iservice.IDocVenta;
import com.init.pea.modelo.Docventa;

@Service
public class DocVentaService implements IDocVenta {

	@Autowired
	private DocVentaDAO repoDocv;
	
	
	
	@Override
	public List<Docventa> listarDocventa() {
		return (List<Docventa>) repoDocv.findAll();
	}
	

}
