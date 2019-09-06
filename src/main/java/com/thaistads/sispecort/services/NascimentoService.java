package com.thaistads.sispecort.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import com.thaistads.sispecort.domain.Nascimento;
import com.thaistads.sispecort.repositories.NascimentoRepository;

@Service
public class NascimentoService {
	
	@Autowired
	private NascimentoRepository nascimentoRepository;
	
	public Nascimento buscar(Integer id){
		Optional<Nascimento> objNasc = nascimentoRepository.findById(id);
		return objNasc.orElse(null);
	}
	
	public Nascimento cadastrar(Nascimento nasc) {
		return nascimentoRepository.save(nasc);
	}
	
}
