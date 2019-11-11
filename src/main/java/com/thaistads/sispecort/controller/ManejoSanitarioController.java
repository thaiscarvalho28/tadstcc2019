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

import com.thaistads.sispecort.domain.ManejoSanitario;
import com.thaistads.sispecort.services.ManejoSanitarioService;

@RestController
public class ManejoSanitarioController {
	
	private final String URL = "/manejosanidade";
	
	@Autowired
	ManejoSanitarioService sanidadeService;
	
	//############### Cadastrar ###############
	@RequestMapping(value = URL + "/cadastmanejo", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> cadastrarManejoSanitario(@RequestBody ManejoSanitario manejo){
		
		ManejoSanitario manejoCadastrado = sanidadeService.cadastrar(manejo);
		
		if(manejoCadastrado == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	//############### Buscar ###############
	@RequestMapping(value = URL + "/buscarmanejo/{id}", method = RequestMethod.GET)
	public ResponseEntity<ManejoSanitario> buscarManejo(@PathVariable int id) {
		ManejoSanitario objManejo = sanidadeService.buscar(id);
		return ResponseEntity.ok().body(objManejo);
	}
	
	@RequestMapping(value = URL + "/todosmanejos", method = RequestMethod.GET)
	public ResponseEntity<List<ManejoSanitario>> buscarTodosManejo() {
		List<ManejoSanitario> listaManejo = sanidadeService.buscarTodos();
		return ResponseEntity.ok().body(listaManejo);
	}
	
}
