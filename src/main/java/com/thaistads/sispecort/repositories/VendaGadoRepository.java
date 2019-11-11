package com.thaistads.sispecort.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.thaistads.sispecort.domain.VendaGado;

public interface VendaGadoRepository extends JpaRepository<VendaGado, Integer>{

	@Query("SELECT idVendaGado FROM VendaGado") List<VendaGado> getAllVendaGados();
	
}
