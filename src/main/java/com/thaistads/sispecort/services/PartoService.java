package com.thaistads.sispecort.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.thaistads.sispecort.domain.Parto;
import com.thaistads.sispecort.repositories.PartoRepository;

@Service
public class PartoService {
	
	@Autowired
	private PartoRepository partoRepository;
	
	public Parto buscar(Integer id){
		Optional<Parto> objParto = partoRepository.findById(id);
		return objParto.orElse(null);
	}
	
	public List<Parto> buscarTodos(){
		return partoRepository.findAll();
	}
	
	public Parto cadastrar(Parto parto) {
		return partoRepository.save(parto);
	}
	
}
