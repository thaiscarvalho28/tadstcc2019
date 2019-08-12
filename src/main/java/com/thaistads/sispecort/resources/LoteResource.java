package com.thaistads.sispecort.resources;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thaistads.sispecort.domain.Lote;

@RestController
@RequestMapping(value="/lotes")
public class LoteResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Lote> listar() {
		
		Lote lote1 = new Lote(1, 24.2, "ha", "Para engorda", 28, "Brachiara Decumbens");
		Lote lote2 = new Lote(2, 48.4, "ha", "Para cria", 55, "Brachiara Decumbens");
		
		List<Lote> listaLote = new ArrayList<>();
		listaLote.add(lote1);
		listaLote.add(lote2);
		
		return listaLote;
	}
	
}
