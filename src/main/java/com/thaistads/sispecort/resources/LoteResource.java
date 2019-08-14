package com.thaistads.sispecort.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thaistads.sispecort.domain.Lote;
import com.thaistads.sispecort.services.LoteService;

@RestController
@RequestMapping(value="/lotes")
public class LoteResource {
	
	@Autowired
	LoteService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<Lote> find(@PathVariable int id) {
		Lote objLote = service.buscar(id);
		return ResponseEntity.ok().body(objLote);
		
	}
	
}
