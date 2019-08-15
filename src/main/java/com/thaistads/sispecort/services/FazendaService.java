package com.thaistads.sispecort.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thaistads.sispecort.domain.Fazenda;
import com.thaistads.sispecort.repositories.FazendaRepository;

@Service
public class FazendaService {
	
	@Autowired
	private FazendaRepository fazendaRepository;
	
	public Fazenda buscar(Integer id) {
		Optional<Fazenda> objFazenda = fazendaRepository.findById(id);
		return objFazenda.orElse(null);
	}
	
	public Fazenda cadastrarFazenda(Fazenda fazenda) {
		return fazendaRepository.save(fazenda);
	}
}
