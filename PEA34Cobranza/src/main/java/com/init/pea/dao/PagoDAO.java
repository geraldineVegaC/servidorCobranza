package com.init.pea.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.init.pea.modelo.Pago;

public interface PagoDAO extends JpaRepository<Pago, Integer> {

}
