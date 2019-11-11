package com.thaistads.sispecort.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Nascimento{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idNascimento;
	
	@OneToOne()
	@JoinColumn(name = "id_ciclo_repro", unique = true)
	private CicloReprodutivo idCicloReprodutivo;
	
	@OneToOne()
	@JoinColumn(name = "id_bezerro", unique = true)
	private GadoBovino idBezerro;
	
	
	//-----Metodos-----//
	
	
	public Integer getIdNascimento() {
		return idNascimento;
	}

	public void setIdNascimento(Integer idNascimento) {
		this.idNascimento = idNascimento;
	}

	public CicloReprodutivo getIdCicloReprodutivo() {
		return idCicloReprodutivo;
	}

	public void setIdCicloReprodutivo(CicloReprodutivo idCicloReprodutivo) {
		this.idCicloReprodutivo = idCicloReprodutivo;
	}

	public GadoBovino getIdBezerro() {
		return idBezerro;
	}

	public void setIdBezerro(GadoBovino idBezerro) {
		this.idBezerro = idBezerro;
	}
	
}
