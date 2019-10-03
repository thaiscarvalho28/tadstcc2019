package com.thaistads.sispecort.domain;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;


@Entity 
public class Lote{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String codigoLote;
	private double tamanhoLote;
	private String unidadeMedida;
	private String finalidadeLote;
	private int capacidadeDeGado;
	private String tipoPastagem;
	private double pesoTotalDoLote;
	private boolean status = true;
	
	@OneToMany(cascade = CascadeType.REMOVE, mappedBy = "lote")
	//@JsonProperty(access = Access.WRITE_ONLY)
	private List<GadoBovino> gado_bovino;
	
	
	//-----Metodos-----//

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoLote() {
		return codigoLote;
	}
    
	public void setCodigoLotee(String codigoLote) {
		this.codigoLote = codigoLote;
	}

	public double getTamanhoLote() {
		return tamanhoLote;
	}

	public void setTamanhoLote(double tamanhoLote) {
		this.tamanhoLote = tamanhoLote;
	}
	
	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public String getFinalidadeLote() {
		return finalidadeLote;
	}

	public void setFinalidadeLote(String finalidadeLote) {
		this.finalidadeLote = finalidadeLote;
	}

	public int getCapacidadeDeGado() {
		return capacidadeDeGado;
	}

	public void setCapacidadeDeGado(int capacidadeDeGado) {
		this.capacidadeDeGado = capacidadeDeGado;
	}

	public String getTipoPastagem() {
		return tipoPastagem;
	}

	public void setTipoPastagem(String tipoPastagem) {
		this.tipoPastagem = tipoPastagem;
	}

	public double getPesoTotalDoLote() {
		return pesoTotalDoLote;
	}

	public void setPesoTotalDoLote(double pesoTotalDoLote) {
		this.pesoTotalDoLote = pesoTotalDoLote;
	}

	public void setCodigoLote(String codigoLote) {
		this.codigoLote = codigoLote;
	}
	
	public List<GadoBovino> getGado_bovino() {
		return gado_bovino;
	}

	public void setGado_bovino(List<GadoBovino> gado_bovino) {
		this.gado_bovino = gado_bovino;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
