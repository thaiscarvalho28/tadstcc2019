package com.thaistads.sispecort.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thaistads.sispecort.domain.VendaGado;
import com.thaistads.sispecort.repositories.VendaGadoRepository;;

@Service
public class VendaGadoService {
	
	@Autowired
	private VendaGadoRepository vendaRepository;
	
	public VendaGado buscar(Integer id) {
		Optional<VendaGado> objVendaGado = vendaRepository.findById(id);
		return objVendaGado.orElse(null);
	}
	
	public List<VendaGado> buscarTodos(){
		return vendaRepository.findAll();
	}
	
	public VendaGado cadastrar(VendaGado venda) {
		return vendaRepository.save(venda);
	}
}
