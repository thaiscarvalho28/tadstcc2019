package com.thaistads.sispecort.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PesoGado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPeso;
	
	@ManyToOne()
	private GadoBovino idGado;
	
//	@ManyToOne()
//	private Pesagem idPesagem;
	private float peso;
	
	
	//Metodos//
	
	
	public Integer getIdPeso() {
		return idPeso;
	}
	
	public void setIdPeso(Integer idPeso) {
		this.idPeso = idPeso;
	}
	
	public GadoBovino getIdGado() {
		return idGado;
	}
	
	public void setIdGado(GadoBovino idGado) {
		this.idGado = idGado;
	}
	
//	public Pesagem getIdPesagem() {
//		return idPesagem;
//	}
//	
//	public void setIdPesagem(Pesagem idPesagem) {
//		this.idPesagem = idPesagem;
//	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
}
