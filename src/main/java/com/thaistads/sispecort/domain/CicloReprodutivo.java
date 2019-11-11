package com.thaistads.sispecort.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CicloReprodutivo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCiclo;
	
	private boolean situacao;
	private Date dataPrevistaParto;
	
	@OneToOne()
	private Inseminacao idInseminacao;
	
	@OneToOne()
	private Parto idParto;
	
	
	public Integer getIdCiclo() {
		return idCiclo;
	}
	
	public void setIdCiclo(Integer idCiclo) {
		this.idCiclo = idCiclo;
	}
	
	public boolean isSituacao() {
		return situacao;
	}
	
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	
	public Date getDataPrevistaParto() {
		return dataPrevistaParto;
	}
	
	public void setDataPrevistaParto(Date dataPrevistaParto) {
		this.dataPrevistaParto = dataPrevistaParto;
	}

	public Inseminacao getIdInseminacao() {
		return idInseminacao;
	}

	public void setIdInseminacao(Inseminacao idInseminacao) {
		this.idInseminacao = idInseminacao;
	}

	public Parto getIdParto() {
		return idParto;
	}

	public void setIdParto(Parto idParto) {
		this.idParto = idParto;
	}
	
}
