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
import com.thaistads.sispecort.services.GadoBovinoService;

@RestController
public class GadoBovinoController {
	
	private final String URL = "/gadobov";
	
	@Autowired
	GadoBovinoService gadoBovinoService;
	
	//############### Cadastrar ###############
	@RequestMapping(value = URL + "/cadastgado", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> cadastrarGadoBovino(@RequestBody GadoBovino gadoBov){
		
		GadoBovino gadoBovCadastrada = gadoBovinoService.cadastrar(gadoBov);
		
		if(gadoBovCadastrada == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	//############### Buscar ###############
	@RequestMapping(value = URL + "/buscargado/{id}", method = RequestMethod.GET)
	public ResponseEntity<GadoBovino> buscarGadoBovino(@PathVariable int id) {
		GadoBovino objGadoBov = gadoBovinoService.buscar(id);
		return ResponseEntity.ok().body(objGadoBov);
		
	}
	
	@RequestMapping(value = URL + "/buscatodos", method = RequestMethod.GET)
	public ResponseEntity<List<GadoBovino>> buscarTodos(){
		List<GadoBovino> listaDeGado = gadoBovinoService.buscarTodos();
		return ResponseEntity.ok().body(listaDeGado);
	}
	
	//############### Atualizar ###############
	@RequestMapping(value = URL + "/atualigado", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> atualizarGadoBovino(@RequestBody GadoBovino gadoBov){
		
		GadoBovino gadoBovAtualizado = gadoBovinoService.atualizar(gadoBov);
		
		if(gadoBovAtualizado == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
}