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

import com.thaistads.sispecort.domain.Lote;
import com.thaistads.sispecort.services.LoteService;

@RestController
public class LoteController {
	
	private final String URL = "/lotes";
	
	@Autowired
	LoteService loteService;
	
	//############### Cadastrar ###############
	@RequestMapping(value = URL + "/cadastlote", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> cadastrarLote(@RequestBody Lote lote){
		
		Lote loteCadastrado = loteService.cadastrarLote(lote);
		
		if(loteCadastrado == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
		            .body("Não foi possivel realizar o cadastro!");
		}
		return ResponseEntity.status(HttpStatus.CREATED)
		        .body("Lote cadastrado com sucesso.");
	}
	
	//############### Buscar ###############
	@RequestMapping(value = URL + "/buscarlote/{id}", method = RequestMethod.GET)
	public ResponseEntity<Lote> buscarLote(@PathVariable int id) {
		Lote objLote = loteService.buscar(id);
		return ResponseEntity.ok().body(objLote);
		
	}
	
	@RequestMapping(value = URL + "/listalotes", method = RequestMethod.GET)
	public ResponseEntity<List<Lote>> buscarLote() {
		List<Lote> listaLote = loteService.buscarTodos();
		return ResponseEntity.ok().body(listaLote);
		
	}
	
	//############### Desativar ###############
	
}
