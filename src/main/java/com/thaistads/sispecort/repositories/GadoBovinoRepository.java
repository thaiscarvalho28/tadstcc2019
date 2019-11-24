package com.thaistads.sispecort.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.thaistads.sispecort.domain.GadoBovino;

public interface GadoBovinoRepository extends JpaRepository<GadoBovino, Integer>{
	
	@Query("SELECT numeroBrinco FROM GadoBovino") List<GadoBovino> getAllBovinos();
	
	@Query("SELECT f FROM GadoBovino f WHERE f.sexo = 'FEMEA'") List<GadoBovino> getAllFemeas();
	
	@Query("SELECT m FROM GadoBovino m WHERE m.sexo = 'MACHO'") List<GadoBovino> getAllMachos();
}
