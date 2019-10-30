package com.thaistads.sispecort.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import com.thaistads.sispecort.domain.GadoBovino;
import com.thaistads.sispecort.repositories.GadoBovinoRepository;

@Service
public class GadoBovinoService {
	
	@Autowired
	private GadoBovinoRepository gadoBovinoRepository;
	
	public GadoBovino buscar(Integer id){
		Optional<GadoBovino> objGadoBov = gadoBovinoRepository.findById(id);
		return objGadoBov.orElse(null);
	}
	
	public GadoBovino cadastrar(GadoBovino gadoBov) {
		return gadoBovinoRepository.save(gadoBov);
	}
	
	public GadoBovino atualizar(GadoBovino gadoBov) {
		return gadoBovinoRepository.save(gadoBov);
	}
}
