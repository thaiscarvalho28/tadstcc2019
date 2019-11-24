package com.thaistads.sispecort.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Parto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idParto;
	
	private String dificuldades;
	private String observacoes;
	private Date dataParto;
	
	@OneToOne()
	@JoinColumn(name = "id_bezerro", unique = true)
	private GadoBovino idBezerro;
	
	/* <--- Metodos getter e setters ---> */
	
	public Integer getIdParto() {
		return idParto;
	}
	
	public void setIdParto(Integer idParto) {
		this.idParto = idParto;
	}
	
	public String getDificuldades() {
		return dificuldades;
	}
	
	public void setDificuldades(String dificuldades) {
		this.dificuldades = dificuldades;
	}
	
	public String getObservacoes() {
		return observacoes;
	}
	
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Date getDataParto() {
		return dataParto;
	}

	public void setDataParto(Date dataParto) {
		this.dataParto = dataParto;
	}

	public GadoBovino getIdBezerro() {
		return idBezerro;
	}

	public void setIdBezerro(GadoBovino idBezerro) {
		this.idBezerro = idBezerro;
	}
	
	
}
