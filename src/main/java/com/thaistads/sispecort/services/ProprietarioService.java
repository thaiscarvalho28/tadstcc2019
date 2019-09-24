package com.thaistads.sispecort.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thaistads.sispecort.domain.Proprietario;
import com.thaistads.sispecort.repositories.ProprietarioRepository;;

@Service
public class ProprietarioService {
	
	@Autowired
	private ProprietarioRepository proprietarioRepository;
	
	public Proprietario buscar(Integer id) {
		Optional<Proprietario> objProprietario = proprietarioRepository.findById(id);
		return objProprietario.orElse(null);
	}
	
	public Proprietario cadastrar(Proprietario proprietario) {
		return proprietarioRepository.save(proprietario);
	}
}
