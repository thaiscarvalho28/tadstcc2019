package com.thaistads.sispecort.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thaistads.sispecort.domain.Funcionario;
import com.thaistads.sispecort.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	public Funcionario buscar(Integer id) {
		Optional<Funcionario> objFuncionario = funcionarioRepository.findById(id);
		return objFuncionario.orElse(null);
	}
	
	public Funcionario cadastrarFuncionario(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}
}
