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

import com.thaistads.sispecort.domain.VendaGado;
import com.thaistads.sispecort.services.VendaGadoService;

@RestController
public class VendaGadoController {
	
	private final String URL = "/venda";
	
	@Autowired
	VendaGadoService vendaService;
	
	//############### Cadastrar ###############
	@RequestMapping(value = URL + "/cadastvenda", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> cadastrarVenda(@RequestBody VendaGado venda){
		
		VendaGado vendaCadastrada = vendaService.cadastrar(venda);
		
		if(vendaCadastrada == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	//############### Buscar ###############
	@RequestMapping(value = URL + "/buscarvenda/{id}", method = RequestMethod.GET)
	public ResponseEntity<VendaGado> buscarVenda(@PathVariable int id) {
		VendaGado objVenda = vendaService.buscar(id);
		return ResponseEntity.ok().body(objVenda);
	}
	
	@RequestMapping(value = URL + "/todasvendas", method = RequestMethod.GET)
	public ResponseEntity<List<VendaGado>> buscarTodasVendas() {
		List<VendaGado> listaVendas = vendaService.buscarTodos();
		return ResponseEntity.ok().body(listaVendas);
	}
	
}
