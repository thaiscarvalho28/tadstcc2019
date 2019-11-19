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

import com.thaistads.sispecort.domain.FluxoDeCaixa;
import com.thaistads.sispecort.services.FluxoDeCaixaService;

@RestController
public class FluxoDeCaixaController {
	
	private final String URL = "/caixa";
	
	@Autowired
	FluxoDeCaixaService caixaService;
	
	//############### Cadastrar ###############
	@RequestMapping(value = URL + "/cadastcaixa", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> cadastrarCaixa(@RequestBody FluxoDeCaixa caixa){
		
		FluxoDeCaixa caixaCadastrado = caixaService.cadastrar(caixa);
		
		if(caixaCadastrado == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	//############### Buscar ###############
	@RequestMapping(value = URL + "/buscarcaixa/{id}", method = RequestMethod.GET)
	public ResponseEntity<FluxoDeCaixa> buscarCaixa(@PathVariable int id) {
		FluxoDeCaixa objCaixa = caixaService.buscar(id);
		return ResponseEntity.ok().body(objCaixa);
		
	}
	
	@RequestMapping(value = URL + "/todoscaixas", method = RequestMethod.GET)
	public ResponseEntity<List<FluxoDeCaixa>> buscarTodosCaixas() {
		List<FluxoDeCaixa> listaCaixa = caixaService.buscarTodos();
		return ResponseEntity.ok().body(listaCaixa);
		
	}
	
	//############### Filtrar data ###############
	@RequestMapping(value = URL + "/filtrardate/{mes}/{ano}", method = RequestMethod.GET)
	public ResponseEntity<List<FluxoDeCaixa>> filtrarData(@PathVariable int mes, @PathVariable int ano) {
		List<FluxoDeCaixa> objData = caixaService.filtrarData(mes, ano);
		return ResponseEntity.ok().body(objData);
		
	}
	
	@RequestMapping(value = URL + "/filtrardate/{ano}", method = RequestMethod.GET)
	public ResponseEntity<List<FluxoDeCaixa>> filtrarPorAno(@PathVariable int ano) {
		List<FluxoDeCaixa> objData = caixaService.filtrarDataAno(ano);
		return ResponseEntity.ok().body(objData);
		
	}
}
