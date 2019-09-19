package com.thaistads.sispecort.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class CompraGado{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCompraGado;
	
	private float valorDaCompra;
	private float valorDoFrete;
	private Date dataDaCompra;
	private int quantGadoComprado;
	private String fornecedor;
	
	@OneToMany(targetEntity = GadoBovino.class)
	private List<GadoBovino> idGadoComprado;
	
	private String anotacoes;
	
	
	//-----Metodos-----//
	

	public Integer getIdCompraGado() {
		return idCompraGado;
	}

	public void setIdCompraGado(Integer idCompraGado) {
		this.idCompraGado = idCompraGado;
	}

	public float getValorDaCompra() {
		return valorDaCompra;
	}

	public void setValorDaCompra(float valorDaCompra) {
		this.valorDaCompra = valorDaCompra;
	}

	public float getValorDoFrete() {
		return valorDoFrete;
	}

	public void setValorDoFrete(float valorDoFrete) {
		this.valorDoFrete = valorDoFrete;
	}

	public Date getDataDaCompra() {
		return dataDaCompra;
	}

	public void setDataDaCompra(Date dataDaCompra) {
		this.dataDaCompra = dataDaCompra;
	}

	public int getQuantGadoComprado() {
		return quantGadoComprado;
	}

	public void setQuantGadoComprado(int quantGadoComprado) {
		this.quantGadoComprado = quantGadoComprado;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
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
