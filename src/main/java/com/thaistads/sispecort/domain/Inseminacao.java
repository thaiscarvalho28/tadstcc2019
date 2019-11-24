package com.thaistads.sispecort.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inseminacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idInseminacao;
	
	private Date dataCobertura;
	private String observacoes;
	
	/* <--- Metodos getter e setters ---> */
	
	public Integer getIdInseminacao() {
		return idInseminacao;
	}
	
	public void setIdInseminacao(Integer idInseminacao) {
		this.idInseminacao = idInseminacao;
	}
	
	public Date getDataCobertura() {
		return dataCobertura;
	}
	
	public void setDataCobertura(Date dataCobertura) {
		this.dataCobertura = dataCobertura;
	}
	
	public String getObservacoes() {
		return observacoes;
	}
	
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	
}
