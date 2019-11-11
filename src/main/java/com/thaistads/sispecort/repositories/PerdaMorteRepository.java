package com.thaistads.sispecort.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.thaistads.sispecort.domain.PerdaMorte;

public interface PerdaMorteRepository extends JpaRepository<PerdaMorte, Integer>{
	
	@Query("SELECT id FROM PerdaMorte") List<PerdaMorte> getAllPerdaMortes();
	
}
