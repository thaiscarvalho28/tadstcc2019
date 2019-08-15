package com.thaistads.sispecort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thaistads.sispecort.repositories.FazendaRepository;
import com.thaistads.sispecort.repositories.LoteRepository;
import com.thaistads.sispecort.services.FazendaService;

@SpringBootApplication
public class SispecortApplication{

	@Autowired
	private LoteRepository repositoryLote;
	@Autowired
	private FazendaRepository repositoryFazenda;
	@Autowired
	private FazendaService serviceFazenda;
	
	public static void main(String[] args) {
		SpringApplication.run(SispecortApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		
//		Fazenda fazenda = new Fazenda(null, "Esperança", 14279943, "Eudes Jose de Carvalho", "Proximo ao Principe, TO");
//		repositoryFazenda.save(fazenda);
//		
//		fazenda = serviceFazenda.buscar(1);
//		System.out.println(fazenda.getIdFazenda());
//		
//		Lote lote1 = new Lote(null, "Lote01", 24.8, "ha", "Engorda", 37, "Brachiaria Humidicola", fazenda);
//		Lote lote2 = new Lote(null, "Lote02", 24.8, "ha", "Cria", 37, "Brachiaria Humidicola", fazenda);
//		Lote lote3 = new Lote(null, "Lote03", 24.8, "ha", "Recria", 37, "Brachiaria Humidicola", fazenda);
//		
//		/*fazenda.getLotes().addAll(Arrays.asList(lote1,lote2, lote3));
//		lote1.getFazenda();
//		lote2.getFazenda();
//		lote3.getFazenda();*/
//		
//		repositoryLote.saveAll(Arrays.asList(lote1, lote2, lote3));
//	}

}
