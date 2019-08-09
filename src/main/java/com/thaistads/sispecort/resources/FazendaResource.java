package com.thaistads.sispecort.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/fazenda")
public class FazendaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "O REST esta funcionando!";
	}
}
