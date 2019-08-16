package com.thaistads.sispecort.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Proprietario extends PessoaFisica{

	private double prolabore;
	private Fazenda fazenda;
	
	@Column
	public double getProlabore() {
		return prolabore;
	}
	
	public void setProlabore(double prolabore) {
		this.prolabore = prolabore;
	}

	@OneToOne(cascade = CascadeType.REMOVE, mappedBy = "proprietario")
	public Fazenda getFazenda() {
		return fazenda;
	}

	public void setFazenda(Fazenda fazenda) {
		this.fazenda = fazenda;
	}
	
	

}
