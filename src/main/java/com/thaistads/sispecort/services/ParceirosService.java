package com.thaistads.sispecort.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.thaistads.sispecort.domain.Parceiros;
import com.thaistads.sispecort.repositories.ParceirosRepository;

@Service
public class ParceirosService {
	
	@Autowired
	private ParceirosRepository parceirosRepository;
	
	public Parceiros buscar(Integer id){
		Optional<Parceiros> objParceiros = parceirosRepository.findById(id);
		return objParceiros.orElse(null);
	}
	
	public List<Parceiros> buscarTodos(){
		return parceirosRepository.findAll();
	}
	
	public Parceiros cadastrar(Parceiros parceiro) {
		return parceirosRepository.save(parceiro);
	}
	
	public Parceiros alterar(Parceiros parceiro) {
		return parceirosRepository.save(parceiro);
	}
	
}
