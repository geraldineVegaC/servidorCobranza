package com.init.pea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.init.pea.dao.DeudaDAO;
import com.init.pea.iservice.IDeuda;
import com.init.pea.modelo.Deuda;

@Service
public class DeudaService implements IDeuda{

	@Autowired
	private DeudaDAO repoDeuda;
	
	@Override
	public List<Deuda> listarTodo() {
		return (List<Deuda>) repoDeuda.findAll();
	}

	@Override
	public int guardarDeuda(Deuda deu) {
		if(deu == null) {
			return 0;
		}
		repoDeuda.save(deu);
		return 1;
	}

	@Override
	public int actualizarDeuda(Deuda deu) {
		if(deu == null) {
			return 0;
		}
		repoDeuda.save(deu);
		return 1;
	}

}
