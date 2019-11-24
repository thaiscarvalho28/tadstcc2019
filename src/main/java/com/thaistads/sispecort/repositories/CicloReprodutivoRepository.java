
package com.thaistads.sispecort.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.thaistads.sispecort.domain.CicloReprodutivo;

@Repository
public interface CicloReprodutivoRepository extends JpaRepository<CicloReprodutivo, Integer>{
	
	@Query("SELECT idCiclo FROM CicloReprodutivo") 
		List<CicloReprodutivo> getAlCicloReprodutivos();
	
	@Query("SELECT c FROM CicloReprodutivo c WHERE c.status = 'false'") 
		List<CicloReprodutivo> getAllCicloConcluidos();
	
	@Query("SELECT c FROM CicloReprodutivo c WHERE c.status = 'true'") 
	List<CicloReprodutivo> getAllCicloAtivos();
}
