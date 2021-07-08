package com.init.pea.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pago")
public class Pago {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idpago;
	
	@ManyToOne
	@JoinColumn(name="empleadoid")
	private Empleado empleado;
	
	@OneToOne
	@JoinColumn(name="iddeuda")
	private Deuda deuda;
	
	private double monto;
	public int getIdpago() {
		return idpago;
	}
	public void setIdpago(int idpago) {
		this.idpago = idpago;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public Deuda getDeuda() {
		return deuda;
	}
	public void setDeuda(Deuda deuda) {
		this.deuda = deuda;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	

	
	
}
