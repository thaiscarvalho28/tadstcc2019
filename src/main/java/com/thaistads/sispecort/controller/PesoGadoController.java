package com.thaistads.sispecort.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thaistads.sispecort.domain.PesoGado;
import com.thaistads.sispecort.services.PesoGadoService;

@RestController
public class PesoGadoController {
	
	private final String URL = "/pesogado";
	
	@Autowired
	PesoGadoService pesoService;
	
	//############### Cadastrar ###############
	@RequestMapping(value = URL + "/cadastpeso", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PesoGado> cadastrarPeso(@RequestBody PesoGado peso){
		
		PesoGado pesoCadastrado = pesoService.cadastrar(peso);
		
		if(pesoCadastrado == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(pesoCadastrado, HttpStatus.CREATED);
	}
	
	//############### Buscar ###############
	@RequestMapping(value = URL + "/buscarpeso/{id}", method = RequestMethod.GET)
	public ResponseEntity<PesoGado> buscarPeso(@PathVariable int id) {
		PesoGado objPeso = pesoService.buscar(id);
		return ResponseEntity.ok().body(objPeso);
		
	}
	
}
