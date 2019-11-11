package com.thaistads.sispecort.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.thaistads.sispecort.domain.Pesagem;

public interface PesagemRepository extends JpaRepository<Pesagem, Integer>{
	
	@Query("SELECT idPesagem FROM Pesagem") List<Pesagem> getAllPesagens();
}
