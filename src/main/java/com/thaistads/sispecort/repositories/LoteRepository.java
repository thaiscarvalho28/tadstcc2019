package com.thaistads.sispecort.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.thaistads.sispecort.domain.Lote;

public interface LoteRepository extends JpaRepository<Lote, Integer>{
	
	@Query("SELECT codigoLote FROM Lote") List<Lote> getAllLotes();
	
}
