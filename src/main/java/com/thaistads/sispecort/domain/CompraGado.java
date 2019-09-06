package com.thaistads.sispecort.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CompraGado{
	
	
	private Integer idCompraGado;
	private float precoCompra;
	private float valorFrete;
	private Date dataCompra;
	private GadoBovino idGadoComprado;
	private String anotacoes;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdCompraGado() {
		return idCompraGado;
	}

	public void setIdCompraGado(Integer idCompraGado) {
		this.idCompraGado = idCompraGado;
	}

	public float getPrecoCompra() {
		return precoCompra;
	}
	
	public void setPrecoCompra(float precoCompra) {
		this.precoCompra = precoCompra;
	}
	
	public float getValorFrete() {
		return valorFrete;
	}
	
	public void setValorFrete(float valorFrete) {
		this.valorFrete = valorFrete;
	}
	
	public Date getDataCompra() {
		return dataCompra;
	}
	
	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	@OneToOne()
	@JoinColumn(name = "id_gado_comprado", unique = true)
	public GadoBovino getIdGadoComprado() {
		return idGadoComprado;
	}

	public void setIdGadoComprado(GadoBovino idGadoComprado) {
		this.idGadoComprado = idGadoComprado;
	}

	public String getAnotacoes() {
		return anotacoes;
	}

	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}
	
	
}
