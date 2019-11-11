
package com.thaistads.sispecort.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.thaistads.sispecort.domain.FluxoDeCaixa;

@Repository
public interface FluxoDeCaixaRepository extends JpaRepository<FluxoDeCaixa, Integer>{
	
	@Query("SELECT idCaixa FROM FluxoDeCaixa") List<FluxoDeCaixa> getAllFluxoDeCaixas();
	
}
