package com.thaistads.sispecort.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.thaistads.sispecort.domain.Inseminacao;
import com.thaistads.sispecort.repositories.InseminacaoRepository;

@Service
public class InseminacaoService {
	
	@Autowired
	private InseminacaoRepository insemiRepository;
	
	public Inseminacao buscar(Integer id){
		Optional<Inseminacao> objInsemi = insemiRepository.findById(id);
		return objInsemi.orElse(null);
	}
	
	public List<Inseminacao> buscarTodos(){
		return insemiRepository.findAll();
	}
	
	public Inseminacao cadastrar(Inseminacao insemi) {
		return insemiRepository.save(insemi);
	}
	
}
