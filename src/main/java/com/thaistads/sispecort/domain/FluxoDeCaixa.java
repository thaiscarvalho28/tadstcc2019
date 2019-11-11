package com.thaistads.sispecort.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FluxoDeCaixa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCaixa;
	private Date data;
	private String tipoMovimento;
	private String descricao;
	private float valor;
	
	
	public Integer getIdCaixa() {
		return idCaixa;
	}
	
	public void setIdCaixa(Integer idCaixa) {
		this.idCaixa = idCaixa;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public String getTipoMovimento() {
		return tipoMovimento;
	}
	
	public void setTipoMovimento(String tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
}
