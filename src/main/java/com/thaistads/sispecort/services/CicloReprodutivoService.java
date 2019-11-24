package com.thaistads.sispecort.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.thaistads.sispecort.domain.CicloReprodutivo;
import com.thaistads.sispecort.repositories.CicloReprodutivoRepository;

@Service
public class CicloReprodutivoService {
	
	@Autowired
	private CicloReprodutivoRepository cicloRepository;
	
	public CicloReprodutivo buscar(Integer id){
		Optional<CicloReprodutivo> objCiclo = cicloRepository.findById(id);
		return objCiclo.orElse(null);
	}
	
	public List<CicloReprodutivo> buscarTodos(){
		return cicloRepository.findAll();
	}
	
	public CicloReprodutivo cadastrar(CicloReprodutivo ciclo) {
		return cicloRepository.save(ciclo);
	}
	
	public List<CicloReprodutivo> filtraConcluidos(){
		return cicloRepository.getAllCicloConcluidos();
	}
	
	public List<CicloReprodutivo> filtraAtivos(){
		return cicloRepository.getAllCicloAtivos();
	}
}
