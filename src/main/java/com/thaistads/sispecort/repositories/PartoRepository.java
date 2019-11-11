
package com.thaistads.sispecort.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.thaistads.sispecort.domain.Parto;

@Repository
public interface PartoRepository extends JpaRepository<Parto, Integer>{

	@Query("SELECT idParto FROM Parto") List<Parto> getAllPartos();
	
}
