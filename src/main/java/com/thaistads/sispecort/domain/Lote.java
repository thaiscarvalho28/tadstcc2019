package com.thaistads.sispecort.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Lote implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numLote;
	private double tamanhoLote;
	private String unidadeMedida;
	private String finalidadeLote;
	private int capacidadeDeGado;
	private String tipoPastagem;
	private double pesoTotalDoLote;
	
	public Lote() { }

	

	public Lote(int numLote, double tamanhoLote, String unidadeMedida, String finalidadeLote, int capacidadeDeGado,
			String tipoPastagem) {
		super();
		this.numLote = numLote;
		this.tamanhoLote = tamanhoLote;
		this.unidadeMedida = unidadeMedida;
		this.finalidadeLote = finalidadeLote;
		this.capacidadeDeGado = capacidadeDeGado;
		this.tipoPastagem = tipoPastagem;
	}


	public int getNumLote() {
		return numLote;
	}

	public void setNumLote(int numLote) {
		this.numLote = numLote;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacidadeDeGado;
		result = prime * result + ((finalidadeLote == null) ? 0 : finalidadeLote.hashCode());
		result = prime * result + numLote;
		long temp;
		temp = Double.doubleToLongBits(pesoTotalDoLote);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(tamanhoLote);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((tipoPastagem == null) ? 0 : tipoPastagem.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lote other = (Lote) obj;
		if (capacidadeDeGado != other.capacidadeDeGado)
			return false;
		if (finalidadeLote == null) {
			if (other.finalidadeLote != null)
				return false;
		} else if (!finalidadeLote.equals(other.finalidadeLote))
			return false;
		if (numLote != other.numLote)
			return false;
		if (Double.doubleToLongBits(pesoTotalDoLote) != Double.doubleToLongBits(other.pesoTotalDoLote))
			return false;
		if (Double.doubleToLongBits(tamanhoLote) != Double.doubleToLongBits(other.tamanhoLote))
			return false;
		if (tipoPastagem == null) {
			if (other.tipoPastagem != null)
				return false;
		} else if (!tipoPastagem.equals(other.tipoPastagem))
			return false;
		return true;
	}
	
	
	
	
}
