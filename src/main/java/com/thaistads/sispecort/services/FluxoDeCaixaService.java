package com.thaistads.sispecort.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.thaistads.sispecort.domain.FluxoDeCaixa;
import com.thaistads.sispecort.repositories.FluxoDeCaixaRepository;

@Service
public class FluxoDeCaixaService {
	
	@Autowired
	private FluxoDeCaixaRepository caixaRepository;
	
	public FluxoDeCaixa buscar(Integer id){
		Optional<FluxoDeCaixa> objCaixa = caixaRepository.findById(id);
		return objCaixa.orElse(null);
	}
	
	public List<FluxoDeCaixa> buscarTodos(){
		return caixaRepository.findAll();
	}
	
	public FluxoDeCaixa cadastrar(FluxoDeCaixa caixa) {
		return caixaRepository.save(caixa);
	}
	
}
