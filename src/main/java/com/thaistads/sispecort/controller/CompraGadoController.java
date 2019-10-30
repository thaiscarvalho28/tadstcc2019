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

import com.thaistads.sispecort.domain.CompraGado;
import com.thaistads.sispecort.services.CompraGadoService;

@RestController
public class CompraGadoController {
	
	private final String URL = "/compgado";
	
	@Autowired
	CompraGadoService compGadoService;
	
	//############### Cadastrar ###############
	@RequestMapping(value = URL + "/cadastcompgado", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> cadastrarCompraGado(@RequestBody CompraGado compGado){
		
		CompraGado compGadoCadastrada = compGadoService.cadastrar(compGado);
		
		if(compGadoCadastrada == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
		//Implementar saida no caixa automatico
	}
	
	//############### Buscar ###############
	@RequestMapping(value = URL + "/buscarcompgado/{id}", method = RequestMethod.GET)
	public ResponseEntity<CompraGado> buscarNascimento(@PathVariable int id) {
		CompraGado objCompGado = compGadoService.buscar(id);
		return ResponseEntity.ok().body(objCompGado);
		
	}
	
	//############### Editar ###############
	@RequestMapping(value = URL + "/editarcomp", method = RequestMethod.PUT)
	public ResponseEntity<?> editarCompra(@RequestBody CompraGado compGado) {
		compGadoService.editar(compGado);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	//############### Excluir ###############
	
}