package com.thaistads.sispecort.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thaistads.sispecort.domain.PerdaMorte;
import com.thaistads.sispecort.repositories.PerdaMorteRepository;

@Service
public class PerdaMorteService {
	
	@Autowired
	private PerdaMorteRepository perdaRepository;
	
	public PerdaMorte buscar(Integer id) {
		Optional<PerdaMorte> objPerda = perdaRepository.findById(id);
		return objPerda.orElse(null);
	}
	
	public List<PerdaMorte> buscarTodos(){
		return perdaRepository.findAll();
	}
	
	public PerdaMorte cadastrar(PerdaMorte perda) {
		return perdaRepository.save(perda);
	}
}
