package com.thaistads.sispecort.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Proprietario extends Pessoa{

	private double prolabore;
	
	@Column
	public double getProlabore() {
		return prolabore;
	}
	
	public void setProlabore(double prolabore) {
		this.prolabore = prolabore;
	}	

}
