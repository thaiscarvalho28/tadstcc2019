package com.thaistads.sispecort.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class VendaGado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVendaGado;
	
	private float valorTotalVenda;
	private Date dataVenda;
	private String anotacoes;
	
	@OneToOne()
	private Parceiros comprador;
	
	@OneToMany(targetEntity = GadoBovino.class)
	private List<GadoBovino> idGadoVendido;
	
	
	//-----Metodos-----//
	

	public Integer getIdVendaGado() {
		return idVendaGado;
	}

	public void setIdVendaGado(Integer idVendaGado) {
		this.idVendaGado = idVendaGado;
	}

	public float getValorTotalVenda() {
		return valorTotalVenda;
	}

	public void setValorTotalVenda(float valorTotalVenda) {
		this.valorTotalVenda = valorTotalVenda;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public String getAnotacoes() {
		return anotacoes;
	}

	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}

	public Parceiros getComprador() {
		return comprador;
	}

	public void setComprador(Parceiros comprador) {
		this.comprador = comprador;
	}

	public List<GadoBovino> getIdGadoVendido() {
		return idGadoVendido;
	}

	public void setIdGadoVendido(List<GadoBovino> idGadoVendido) {
		this.idGadoVendido = idGadoVendido;
	}
	
}
