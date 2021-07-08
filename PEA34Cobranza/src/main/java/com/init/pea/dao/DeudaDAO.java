package com.init.pea.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.init.pea.modelo.Deuda;

public interface DeudaDAO extends JpaRepository<Deuda, Integer> {

}
