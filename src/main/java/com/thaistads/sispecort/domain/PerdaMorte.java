package com.thaistads.sispecort.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PerdaMorte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne()
	private GadoBovino idGado;
	private Date dataPerdaMorte;
	private String causa;
	private String observacoes;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public GadoBovino getIdGado() {
		return idGado;
	}
	public void setIdGado(GadoBovino idGado) {
		this.idGado = idGado;
	}
	public Date getDataPerdaMorte() {
		return dataPerdaMorte;
	}
	public void setDataPerdaMorte(Date dataPerdaMorte) {
		this.dataPerdaMorte = dataPerdaMorte;
	}
	public String getCausa() {
		return causa;
	}
	public void setCausa(String causa) {
		this.causa = causa;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
}
