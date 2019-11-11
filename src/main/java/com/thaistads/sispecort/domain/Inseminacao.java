package com.thaistads.sispecort.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Inseminacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idInseminacao;
	
	@ManyToOne()
	private GadoBovino idTouroUsado;
	
	@OneToOne()
	private GadoBovino idFemeaUsada;
	private Date dataCobertura;
	private String observacoes;
	
	/*--------- Metodos ----------*/
	
	public Integer getIdInseminacao() {
		return idInseminacao;
	}
	
	public void setIdInseminacao(Integer idInseminacao) {
		this.idInseminacao = idInseminacao;
	}
	
	public GadoBovino getIdTouroUsado() {
		return idTouroUsado;
	}
	
	public void setIdTouroUsado(GadoBovino idTouroUsado) {
		this.idTouroUsado = idTouroUsado;
	}
	
	public GadoBovino getIdFemeaUsada() {
		return idFemeaUsada;
	}
	
	public void setIdFemeaUsada(GadoBovino idFemeaUsada) {
		this.idFemeaUsada = idFemeaUsada;
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
