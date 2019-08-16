package com.thaistads.sispecort.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity 
public class Lote{
	
	private Integer id;
	private String codigoLote;
	private double tamanhoLote;
	private String unidadeMedida;
	private String finalidadeLote;
	private int capacidadeDeGado;
	private String tipoPastagem;
	private double pesoTotalDoLote;
	private Fazenda fazenda;
	
	//private List<Gado> gados = new ArrayList<>();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	@ManyToOne()
	@JsonIgnore
	public Fazenda getFazenda() {
		return fazenda;
	}

	public void setFazenda(Fazenda fazenda) {
		this.fazenda = fazenda;
	}

	public void setCodigoLote(String codigoLote) {
		this.codigoLote = codigoLote;
	}
	
	/*public List<Gado> getGados() {
		return gados;
	}

	public void setGados(List<Gado> gados) {
		this.gados = gados;
	}*/
	
}
