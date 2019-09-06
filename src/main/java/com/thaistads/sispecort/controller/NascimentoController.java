//package com.thaistads.sispecort.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.thaistads.sispecort.domain.Lote;
//import com.thaistads.sispecort.domain.Nascimento;
//import com.thaistads.sispecort.services.LoteService;
//import com.thaistads.sispecort.services.NascimentoService;
//
//@RestController
//public class NascimentoController {
//	
//	private final String URL = "/nasc";
//	
//	@Autowired
//	NascimentoService nascService;
//	
//	//############### Cadastrar ###############
//	@RequestMapping(value = URL + "/cadastnasc", method = RequestMethod.POST,
//			consumes = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<?> cadastrarNascimento(@RequestBody Nascimento nasc){
//		
//		Nascimento nascCadastrado = nascService.cadastrar(nasc);
//		
//		if(nascCadastrado == null) {
//			return new ResponseEntity(HttpStatus.BAD_REQUEST);
//		}
//		return new ResponseEntity(HttpStatus.CREATED);
//	}
//	
//	//############### Buscar ###############
//	@RequestMapping(value = URL + "/buscarnasc/{id}", method = RequestMethod.GET)
//	public ResponseEntity<Nascimento> buscarNascimento(@PathVariable int id) {
//		Nascimento objNasc = nascService.buscar(id);
//		return ResponseEntity.ok().body(objNasc);
//		
//	}
//	
//	//############### Desativar ###############
//	
//}