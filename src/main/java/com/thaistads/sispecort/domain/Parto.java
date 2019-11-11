package com.thaistads.sispecort.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idParto;
	
	private String dificuldades;
	private String observacoes;
	private int diasAposUltimoParto;
	
	
	public Integer getIdParto() {
		return idParto;
	}
	
	public void setIdParto(Integer idParto) {
		this.idParto = idParto;
	}
	
	public String getDificuldades() {
		return dificuldades;
	}
	
	public void setDificuldades(String dificuldades) {
		this.dificuldades = dificuldades;
	}
	
	public String getObservacoes() {
		return observacoes;
	}
	
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	public int getDiasAposUltimoParto() {
		return diasAposUltimoParto;
	}
	
	public void setDiasAposUltimoParto(int diasAposUltimoParto) {
		this.diasAposUltimoParto = diasAposUltimoParto;
	}
	
	
}
