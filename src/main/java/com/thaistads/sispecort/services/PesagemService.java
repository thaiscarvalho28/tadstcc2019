package com.thaistads.sispecort.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thaistads.sispecort.domain.Pesagem;
import com.thaistads.sispecort.repositories.PesagemRepository;

@Service
public class PesagemService {
	
	@Autowired
	private PesagemRepository pesagemRepository;
	
	public Pesagem buscar(Integer id) {
		Optional<Pesagem> objPesagem = pesagemRepository.findById(id);
		return objPesagem.orElse(null);
	}
	
	public Pesagem cadastrar(Pesagem pesagem) {
		return pesagemRepository.save(pesagem);
	}
}
