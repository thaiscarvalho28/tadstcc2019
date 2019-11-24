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

import com.thaistads.sispecort.domain.CicloReprodutivo;
import com.thaistads.sispecort.services.CicloReprodutivoService;

@RestController
public class CicloReprodutivoController {
	
	private final String URL = "/ciclorepro";
	
	@Autowired
	CicloReprodutivoService cicloService;
	
	//############### Cadastrar ###############
	@RequestMapping(value = URL + "/cadastciclo", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> cadastrarCiclo(@RequestBody CicloReprodutivo ciclo){
		
		CicloReprodutivo cicloCadastrado = cicloService.cadastrar(ciclo);
		
		if(cicloCadastrado == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	//############### Buscar ###############
	@RequestMapping(value = URL + "/buscarciclo/{id}", method = RequestMethod.GET)
	public ResponseEntity<CicloReprodutivo> buscarCiclo(@PathVariable int id) {
		CicloReprodutivo objCiclo = cicloService.buscar(id);
		return ResponseEntity.ok().body(objCiclo);
		
	}
	
	@RequestMapping(value = URL + "/todosciclos", method = RequestMethod.GET)
	public ResponseEntity<List<CicloReprodutivo>> buscarTodosCiclos() {
		List<CicloReprodutivo> listaCiclos = cicloService.buscarTodos();
		return ResponseEntity.ok().body(listaCiclos);
		
	}
	
	@RequestMapping(value = URL + "/concluidos", method = RequestMethod.GET)
	public ResponseEntity<List<CicloReprodutivo>> buscarCiclosConcluidos() {
		List<CicloReprodutivo> listaCiclosConcluidos = cicloService.filtraConcluidos();
		return ResponseEntity.ok().body(listaCiclosConcluidos);
		
	}
	
	@RequestMapping(value = URL + "/ativos", method = RequestMethod.GET)
	public ResponseEntity<List<CicloReprodutivo>> buscarCiclosAtivos() {
		List<CicloReprodutivo> listaCiclosAtivos = cicloService.filtraAtivos();
		return ResponseEntity.ok().body(listaCiclosAtivos);
		
	}
	
}
