package com.thaistads.sispecort.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pesagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPesagem;
	
	@ManyToOne()
	private Lote idLote;
	
	private Date dataPesagem;
	private String observacoes;
	
	@OneToMany()
	private List<PesoGado> rebanhoPesado;
	
	
	//Metodos//
	
	
	public Integer getIdPesagem() {
		return idPesagem;
	}
	
	public void setIdPesagem(Integer idPesagem) {
		this.idPesagem = idPesagem;
	}
	
	public Lote getIdLote() {
		return idLote;
	}
	
	public void setIdLote(Lote idLote) {
		this.idLote = idLote;
	}
	
	public Date getDataPesagem() {
		return dataPesagem;
	}
	public void setDataPesagem(Date dataPesagem) {
		this.dataPesagem = dataPesagem;
	}
	
	public String getObservacoes() {
		return observacoes;
	}
	
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public List<PesoGado> getRebanhoPesado() {
		return rebanhoPesado;
	}

	public void setRebanhoPesado(List<PesoGado> rebanhoPesado) {
		this.rebanhoPesado = rebanhoPesado;
	}
	
}
