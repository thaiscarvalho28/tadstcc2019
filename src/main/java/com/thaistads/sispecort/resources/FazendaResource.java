package com.thaistads.sispecort.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thaistads.sispecort.domain.Fazenda;
import com.thaistads.sispecort.services.FazendaService;

@RestController
@RequestMapping(value="/fazenda")
public class FazendaResource {
	
	@Autowired
	private FazendaService service;
	
	/*
	 * Para que o Spting saibe que o ID da URL tem que vir para o ID da variavel, tem-se que
	 * incluir a anotacao @PathVariable 
	 */
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Fazenda objFazenda = service.buscar(id);
		return ResponseEntity.ok().body(objFazenda);
				
	}
}
