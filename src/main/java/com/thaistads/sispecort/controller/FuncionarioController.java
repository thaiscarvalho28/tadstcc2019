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

import com.thaistads.sispecort.domain.Funcionario;
import com.thaistads.sispecort.services.FuncionarioService;

@RestController
public class FuncionarioController {
	
	private final String URL = "/funcionario";
	
	@Autowired
	FuncionarioService funcionarioService;
	
	//############### Cadastrar ###############
	@RequestMapping(value = URL + "/cadastfuncio", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> cadastrarFuncionario(@RequestBody Funcionario funcionario){
		
		Funcionario funcionarioCadastrado = funcionarioService.cadastrarFuncionario(funcionario);
		
		if(funcionarioCadastrado == null) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	//############### Buscar ###############
	@RequestMapping(value = URL + "/buscarfuncio/{id}", method = RequestMethod.GET)
	public ResponseEntity<Funcionario> buscarFuncionario(@PathVariable int id) {
		Funcionario objFuncionario = funcionarioService.buscar(id);
		return ResponseEntity.ok().body(objFuncionario);
		
	}
	
}
