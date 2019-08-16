package com.thaistads.sispecort.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thaistads.sispecort.domain.Proprietario;
import com.thaistads.sispecort.services.ProprietarioService;

@RestController
public class ProprietarioResource {
	
	private final String URL = "/proprietario";
	
	@Autowired
	ProprietarioService proprietarioService;
	
	//############### Cadastrar ###############
	@RequestMapping(value = URL + "/cadastpropi", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> cadastrarProprietario(@RequestBody Proprietario proprietario){
		
		Proprietario proprietatioCadastrado = proprietarioService.cadastrarProprietario(proprietario);
		
		if(proprietatioCadastrado == null) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	//############### Buscar ###############
	@RequestMapping(value = URL + "/buscarpropri/{id}", method = RequestMethod.GET)
	public ResponseEntity<Proprietario> buscarProprietario(@PathVariable int id) {
		Proprietario objProprietario = proprietarioService.buscar(id);
		return ResponseEntity.ok().body(objProprietario);
		
	}
	
}
