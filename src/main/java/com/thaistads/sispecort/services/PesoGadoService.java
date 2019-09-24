package com.thaistads.sispecort.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thaistads.sispecort.domain.PesoGado;
import com.thaistads.sispecort.repositories.PesoGadoRepository;

@Service
public class PesoGadoService {
	
	@Autowired
	private PesoGadoRepository pesoRepository;
	
	public PesoGado buscar(Integer id) {
		Optional<PesoGado> objPesoGado = pesoRepository.findById(id);
		return objPesoGado.orElse(null);
	}
	
	public PesoGado cadastrar(PesoGado pesoGado) {
		return pesoRepository.save(pesoGado);
	}
}
