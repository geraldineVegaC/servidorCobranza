package com.init.pea.iservice;

import java.util.List;

import com.init.pea.modelo.Deuda;

public interface IDeuda {
	public List<Deuda> listarTodo();
	public int guardarDeuda(Deuda deu);
	public int actualizarDeuda(Deuda deu);
}
