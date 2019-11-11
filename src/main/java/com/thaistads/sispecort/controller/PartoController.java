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

import com.thaistads.sispecort.domain.Parto;
import com.thaistads.sispecort.services.PartoService;

@RestController
public class PartoController {
	
	private final String URL = "/parto";
	
	@Autowired
	PartoService partoService;
	
	//############### Cadastrar ###############
	@RequestMapping(value = URL + "/cadastparto", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> cadastrarParto(@RequestBody Parto parto){
		
		Parto partoCadastrado = partoService.cadastrar(parto);
		
		if(partoCadastrado == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	//############### Buscar ###############
	@RequestMapping(value = URL + "/buscarparto/{id}", method = RequestMethod.GET)
	public ResponseEntity<Parto> buscarParto(@PathVariable int id) {
		Parto objParto = partoService.buscar(id);
		return ResponseEntity.ok().body(objParto);
	}
	
	@RequestMapping(value = URL + "/todospartos", method = RequestMethod.GET)
	public ResponseEntity<List<Parto>> buscarTodosPartos() {
		List<Parto> listaParto = partoService.buscarTodos();
		return ResponseEntity.ok().body(listaParto);
	}
	
}
