package com.thaistads.sispecort.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Proprietario extends Pessoa{

	private double prolabore;
	
//	@OneToMany(targetEntity = Fazenda.class, fetch = FetchType.EAGER)
//	private List<Fazenda> fazenda;
	
	@Column
	public double getProlabore() {
		return prolabore;
	}
	
	public void setProlabore(double prolabore) {
		this.prolabore = prolabore;
	}

//	public List<Fazenda> getFazenda() {
//		return fazenda;
//	}
//
//	public void setFazenda(List<Fazenda> fazenda) {
//		this.fazenda = fazenda;
//	}
	
	

}
