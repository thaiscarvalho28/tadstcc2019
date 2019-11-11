package com.thaistads.sispecort.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.thaistads.sispecort.domain.CompraGado;
import com.thaistads.sispecort.repositories.CompraGadoRepository;

@Service
public class CompraGadoService {
	
	@Autowired
	private CompraGadoRepository compraGadoRepository;
	
	public CompraGado buscar(Integer id){
		Optional<CompraGado> objCompGado = compraGadoRepository.findById(id);
		return objCompGado.orElse(null);
	}
	
	public List<CompraGado> buscarTodos(){
		return compraGadoRepository.findAll();
	}
	
	public CompraGado cadastrar(CompraGado compGado) {
		return compraGadoRepository.save(compGado);
	}
	
	public CompraGado editar(CompraGado compGado) {
		return compraGadoRepository.save(compGado);
	}
	
	public void excluir(Integer id) {
		compraGadoRepository.deleteById(id);
	}
	
}
