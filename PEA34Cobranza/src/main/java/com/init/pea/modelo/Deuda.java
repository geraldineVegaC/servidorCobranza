package com.init.pea.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "deuda")
public class Deuda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iddeuda;
	private double monto;
	
	@OneToOne
	@JoinColumn(name="documentoventaid")
	private Docventa docventa;
	
	private int estado;
	
	public int getIddeuda() {
		return iddeuda;
	}
	public void setIddeuda(int iddeuda) {
		this.iddeuda = iddeuda;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public Docventa getDocventa() {
		return docventa;
	}
	public void setDocventa(Docventa docventa) {
		this.docventa = docventa;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
}
