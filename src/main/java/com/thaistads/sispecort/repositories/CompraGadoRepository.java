package com.thaistads.sispecort.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.thaistads.sispecort.domain.CompraGado;

public interface CompraGadoRepository extends JpaRepository<CompraGado, Integer>{
	
	@Query("SELECT idCompraGado FROM CompraGado") List<CompraGado> getAllCompraGados();
	
}
