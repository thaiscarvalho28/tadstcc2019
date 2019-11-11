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

import com.thaistads.sispecort.domain.GadoBovino;
import com.thaistads.sispecort.domain.PerdaMorte;
import com.thaistads.sispecort.services.PerdaMorteService;

@RestController
public class PerdaMorteController {
	
	private final String URL = "/perda";
	
	@Autowired
	PerdaMorteService perdaService;
	GadoBovino gadoPerda;
	
	//############### Cadastrar ###############
	@RequestMapping(value = URL + "/cadastperda", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> cadastrarPerda(@RequestBody PerdaMorte perda){
		
		PerdaMorte perdaCadastrada = perdaService.cadastrar(perda);
		
		if(perdaCadastrada == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
	
	//############### Buscar ###############
	@RequestMapping(value = URL + "/buscarperda/{id}", method = RequestMethod.GET)
	public ResponseEntity<PerdaMorte> buscarPerda(@PathVariable int id) {
		PerdaMorte objPerda = perdaService.buscar(id);
		return ResponseEntity.ok().body(objPerda);
	}
	
	@RequestMapping(value = URL + "/todasperdas", method = RequestMethod.GET)
	public ResponseEntity<List<PerdaMorte>> buscarTodasPerda() {
		List<PerdaMorte> listaPerdas = perdaService.buscarTodos();
		return ResponseEntity.ok().body(listaPerdas);
	}
	
}
