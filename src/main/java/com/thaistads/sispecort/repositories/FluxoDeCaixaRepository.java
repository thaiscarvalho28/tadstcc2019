
package com.thaistads.sispecort.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.thaistads.sispecort.domain.FluxoDeCaixa;

@Repository
public interface FluxoDeCaixaRepository extends JpaRepository<FluxoDeCaixa, Integer>{
	
	@Query("SELECT idCaixa FROM FluxoDeCaixa") List<FluxoDeCaixa> getAllFluxoDeCaixas();
	
	@Query("SELECT dt FROM FluxoDeCaixa dt WHERE EXTRACT(MONTH from dt.data) = :mes AND EXTRACT(YEAR from dt.data) = :ano")
	public List<FluxoDeCaixa> getDataMesAno(@Param("mes") int mes, @Param("ano") int ano);
	
	@Query("SELECT dt FROM FluxoDeCaixa dt WHERE EXTRACT(YEAR from dt.data) = :ano")
	public List<FluxoDeCaixa> getAno(@Param("ano") int ano);
	
	
	/* SELECT * FROM `fluxo_de_caixa` WHERE EXTRACT(MONTH from data) = 11 AND EXTRACT(YEAR from data) = 2019
	 * SELECT MIN(data), MAX(data) FROM `fluxo_de_caixa`
	 * SELECT data, id_caixa, EXTRACT(YEAR_MONTH from data) FROM fluxo_de_caixa*/
	
}
