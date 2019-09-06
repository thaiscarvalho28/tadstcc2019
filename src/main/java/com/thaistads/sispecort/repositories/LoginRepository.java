package com.thaistads.sispecort.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.thaistads.sispecort.domain.Login;

public interface LoginRepository extends JpaRepository<Login, Integer>{
	
	public Login findByEmailAndSenha(
			@Param("email") String email,
			@Param("senha") String senha
	);
	
}
