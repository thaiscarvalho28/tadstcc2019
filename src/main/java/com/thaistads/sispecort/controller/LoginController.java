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

import com.thaistads.sispecort.domain.Login;
import com.thaistads.sispecort.domain.Lote;
import com.thaistads.sispecort.services.LoginService;
import com.thaistads.sispecort.services.LoteService;

@RestController
public class LoginController {
	
	private final String URL = "/loginadmin";
	
	@Autowired
	LoginService loginService;
	
	//############### Cadastrar ###############
	@RequestMapping(value = URL + "/cadastlogadmin", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> cadastrarLoginAdmin(@RequestBody Login login){
		
		Login loginAdminCadastrado = loginService.cadastrar(login);
		
		if(loginAdminCadastrado == null) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	//############### Buscar ###############
	@RequestMapping(value = URL + "/buscarlogadmin/{id}", method = RequestMethod.GET)
	public ResponseEntity<Login> buscarLoginAdmin(@PathVariable int id) {
		Login objLoginAdmin = loginService.buscar(id);
		return ResponseEntity.ok().body(objLoginAdmin);
		
	}
	
	//############### Desativar ###############
	
}
