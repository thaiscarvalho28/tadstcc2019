package com.thaistads.sispecort.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Proprietario extends Pessoa{

	private double prolabore;
	
	@OneToMany(targetEntity = Fazenda.class, mappedBy = "proprietario", fetch = FetchType.EAGER)
	private List<Fazenda> fazenda;
	
	@Column
	public double getProlabore() {
		return prolabore;
	}
	
	public void setProlabore(double prolabore) {
		this.prolabore = prolabore;
	}

	public List<Fazenda> getFazenda() {
		return fazenda;
	}

	public void setFazenda(List<Fazenda> fazenda) {
		this.fazenda = fazenda;
	}
	
	

}
