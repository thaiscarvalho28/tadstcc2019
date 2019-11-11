package com.thaistads.sispecort.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.thaistads.sispecort.domain.Funcionario;;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{
	
	@Query("SELECT idPessoa FROM Funcionario") List<Funcionario> getAllFuncionarios();
	
}
