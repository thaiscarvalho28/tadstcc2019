package com.thaistads.sispecort.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import com.thaistads.sispecort.domain.Login;
import com.thaistads.sispecort.repositories.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepository;
	
	public Login buscar(Integer id){
		Optional<Login> objLogin = loginRepository.findById(id);
		return objLogin.orElse(null);
	}
	
	public Login cadastrar(Login login) {
		return loginRepository.save(login);
	}
	
}
