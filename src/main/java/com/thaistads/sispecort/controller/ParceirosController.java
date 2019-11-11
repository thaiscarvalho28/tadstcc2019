package com.thaistads.sispecort.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thaistads.sispecort.domain.Parceiros;
import com.thaistads.sispecort.services.ParceirosService;

@RestController
public class ParceirosController {
	
	private final String URL = "/parceiros";
	
	@Autowired
	ParceirosService parceiroService;
	
	//############### Cadastrar ###############
	@RequestMapping(value = URL + "/cadasparceiro", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> cadastrarParceiro(@RequestBody Parceiros parceiro){
		
		Parceiros parceiroCadastrado = parceiroService.cadastrar(parceiro);
		
		if(parceiroCadastrado == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	//############### Buscar ###############
	@RequestMapping(value = URL + "/buscarparceiro/{id}", method = RequestMethod.GET)
	public ResponseEntity<Parceiros> buscarParceiro(@PathVariable int id) {
		Parceiros objParceiro = parceiroService.buscar(id);
		return ResponseEntity.ok().body(objParceiro);
		
	}
	
	@RequestMapping(value = URL + "/buscartodosparca", method = RequestMethod.GET)
	public ResponseEntity<List<Parceiros>> buscarTodos() {
		List<Parceiros> listaParceiros = parceiroService.buscarTodos();
		return ResponseEntity.ok().body(listaParceiros);
		
	}
	
}
