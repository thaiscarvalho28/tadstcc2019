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

import com.thaistads.sispecort.domain.Fazenda;
import com.thaistads.sispecort.services.FazendaService;

@RestController
public class FazendaController {
	
	private final String URL = "/fazenda";
	
	@Autowired
	private FazendaService fazendaService;
	
	//############### Cadastrar ###############
	@RequestMapping(value = URL + "/cadastfazenda", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> cadastrarFazenda (@RequestBody Fazenda fazenda) {
		
		Fazenda fazendaCadastrada = fazendaService.cadastrarFazenda(fazenda);
		
		if(fazendaCadastrada == null) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	//############### Buscar ###############
	@RequestMapping(value= URL + "/buscarfazenda/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscarFazenda(@PathVariable Integer id) {
		
		Fazenda objFazenda = fazendaService.buscar(id);
		return ResponseEntity.ok().body(objFazenda);
				
	}
}
