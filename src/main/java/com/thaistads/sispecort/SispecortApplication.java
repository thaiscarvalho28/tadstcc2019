package com.thaistads.sispecort;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thaistads.sispecort.domain.Fazenda;
import com.thaistads.sispecort.domain.Lote;
import com.thaistads.sispecort.repositories.FazendaRepository;
import com.thaistads.sispecort.repositories.LoteRepository;

/*
 * A interface "CommandLineRunner" permite implementar um metodo auxiliar para executar 
 * alguma acao quando a aplicacao iniciar
 */
@SpringBootApplication
public class SispecortApplication implements CommandLineRunner{

	@Autowired
	private LoteRepository repositoryLote;
	@Autowired
	private FazendaRepository repositoryFazenda;
	
	public static void main(String[] args) {
		SpringApplication.run(SispecortApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Fazenda fazenda = new Fazenda(null, "Esperança", 14279943, "Eudes Jose de Carvalho", "Proximo ao Principe, TO");
		Lote lote1 = new Lote(null, "Lote01", 24.8, "ha", "Engorda", 37, "Brachiaria Humidicola");
		Lote lote2 = new Lote(null, "Lote02", 24.8, "ha", "Cria", 37, "Brachiaria Humidicola");
		
		repositoryFazenda.save(fazenda);
		repositoryLote.saveAll(Arrays.asList(lote1, lote2));
	}

}
