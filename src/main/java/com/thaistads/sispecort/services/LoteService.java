package com.thaistads.sispecort.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import com.thaistads.sispecort.domain.Lote;
import com.thaistads.sispecort.repositories.LoteRepository;

@Service
public class LoteService {
	
	@Autowired
	private LoteRepository loteRepository;
	
	public Lote buscar(Integer id){
		Optional<Lote> objLote = loteRepository.findById(id);
		return objLote.orElse(null);
	}
	
	public List<Lote> buscarTodos() {
		return loteRepository.findAll();
	}
	
	public Lote cadastrarLote(Lote lote) {
		return loteRepository.save(lote);
	}
	
}
