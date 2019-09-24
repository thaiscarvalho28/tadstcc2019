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

import com.thaistads.sispecort.domain.Pesagem;
import com.thaistads.sispecort.services.PesagemService;

@RestController
public class PesagemController {
	
	private final String URL = "/pesagem";
	
	@Autowired
	PesagemService pesagemService;
	
	//############### Cadastrar ###############
	@RequestMapping(value = URL + "/cadastpesagem", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> cadastrarPesagem(@RequestBody Pesagem pesagem){
		
		Pesagem pesagemCadastrada = pesagemService.cadastrar(pesagem);
		
		if(pesagemCadastrada == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	//############### Buscar ###############
	@RequestMapping(value = URL + "/buscarpesagem/{id}", method = RequestMethod.GET)
	public ResponseEntity<Pesagem> buscarPesagem(@PathVariable int id) {
		Pesagem objPesagem = pesagemService.buscar(id);
		return ResponseEntity.ok().body(objPesagem);
		
	}
	
}
