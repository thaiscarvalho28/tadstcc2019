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

import com.thaistads.sispecort.domain.Inseminacao;
import com.thaistads.sispecort.services.InseminacaoService;

@RestController
public class InseminacaoController {
	
	private final String URL = "/insemi";
	
	@Autowired
	InseminacaoService insemiService;
	
	//############### Cadastrar ###############
	@RequestMapping(value = URL + "/cadastinsemi", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> cadastrarInsemi(@RequestBody Inseminacao insemi){
		
		Inseminacao insemiCadastrado = insemiService.cadastrar(insemi);
		
		if(insemiCadastrado == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	//############### Buscar ###############
	@RequestMapping(value = URL + "/buscarinsemi/{id}", method = RequestMethod.GET)
	public ResponseEntity<Inseminacao> buscarInsemi(@PathVariable int id) {
		Inseminacao objInsemi = insemiService.buscar(id);
		return ResponseEntity.ok().body(objInsemi);
	}
	
	@RequestMapping(value = URL + "/todasinsem", method = RequestMethod.GET)
	public ResponseEntity<List<Inseminacao>> buscarTodasInsemi() {
		List<Inseminacao> listaInsemi = insemiService.buscarTodos();
		return ResponseEntity.ok().body(listaInsemi);
	}
	
}
