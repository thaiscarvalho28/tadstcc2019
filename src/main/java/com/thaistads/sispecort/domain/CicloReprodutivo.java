package com.thaistads.sispecort.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CicloReprodutivo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCiclo;
	
	@ManyToOne()
	private GadoBovino idTouroUsado;
	
	@OneToOne()
	private GadoBovino idFemeaUsada;
	
	private String situacaoDaFemea;
	private int diasAposUltimoParto;
	private Date dataPrevistaParto;
	
	@OneToOne()
	private Inseminacao idInseminacao;
	
	@OneToOne()
	private Parto idParto;
	
	private boolean status = true;
	
	/* <--- Metodos getter e setters ---> */
	
	public Integer getIdCiclo() {
		return idCiclo;
	}
	
	public void setIdCiclo(Integer idCiclo) {
		this.idCiclo = idCiclo;
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
	
	public String getSituacaoDaFemea() {
		return situacaoDaFemea;
	}

	public void setSituacaoDaFemea(String situacaoDaFemea) {
		this.situacaoDaFemea = situacaoDaFemea;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getDiasAposUltimoParto() {
		return diasAposUltimoParto;
	}

	public void setDiasAposUltimoParto(int diasAposUltimoParto) {
		this.diasAposUltimoParto = diasAposUltimoParto;
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
