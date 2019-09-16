package com.thaistads.sispecort.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class CompraGado{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCompraGado;
	private float precoCompra;
	private float valorFrete;
	private Date dataCompra;
	
	@OneToMany()
	@JoinColumn(name = "id_gado_comprado", unique = true)
	private List<GadoBovino> idGadoComprado;
	
	private String anotacoes;
	
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

	public List<GadoBovino> getIdGadoComprado() {
		return idGadoComprado;
	}

	public void setIdGadoComprado(List<GadoBovino> idGadoComprado) {
		this.idGadoComprado = idGadoComprado;
	}

	public String getAnotacoes() {
		return anotacoes;
	}

	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}
	
	
}
