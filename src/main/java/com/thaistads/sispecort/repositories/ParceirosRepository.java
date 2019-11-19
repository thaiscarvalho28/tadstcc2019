package com.thaistads.sispecort.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.thaistads.sispecort.domain.Parceiros;

public interface ParceirosRepository extends JpaRepository<Parceiros, Integer>{
	
	@Query(value = "SELECT p from Parceiros p order by p.nomeCompleto asc") 
		List<Parceiros> getAllParceiros();
}
