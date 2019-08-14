package com.thaistads.sispecort.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import com.thaistads.sispecort.domain.Lote;
import com.thaistads.sispecort.repositories.LoteRepository;

@Service
public class LoteService {
	
	@Autowired
	private LoteRepository repository;
	
	public Lote buscar(Integer id){
		Optional<Lote> objLote = repository.findById(id);
		return objLote.orElse(null);
	}
}
