package com.thaistads.sispecort.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thaistads.sispecort.domain.Fazenda;
import com.thaistads.sispecort.repositories.FazendaRepository;

@Service
public class FazendaService {

	/*
	 * Quando se declara uma dependencia dentro de uma classe e usa a anotacao @Autowired, a dependencia
	 * sera automaticamento instanciada pelo Spring. Atraves do mecanismo de inecao de dependencia,
	 * ou inversao de controle.
	 */
	@Autowired
	private FazendaRepository repository;
	
	public Fazenda buscar(Integer id) {
		Optional<Fazenda> objFazenda = repository.findById(id);
		return objFazenda.orElse(null);
	}
}
