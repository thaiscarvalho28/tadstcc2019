package com.thaistads.sispecort.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.thaistads.sispecort.domain.ManejoSanitario;
import com.thaistads.sispecort.repositories.ManejoSanitarioRepository;

@Service
public class ManejoSanitarioService {
	
	@Autowired
	private ManejoSanitarioRepository manejoRepository;
	
	public ManejoSanitario buscar(Integer id){
		Optional<ManejoSanitario> objManejoSani = manejoRepository.findById(id);
		return objManejoSani.orElse(null);
	}
	
	public List<ManejoSanitario> buscarTodos(){
		return manejoRepository.findAll();
	}
	
	public ManejoSanitario cadastrar(ManejoSanitario manejoSani) {
		return manejoRepository.save(manejoSani);
	}
	
}
