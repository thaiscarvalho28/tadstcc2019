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
	private Integer id;
	private String codigoLote;
	private double tamanhoLote;
	private String unidadeMedida;
	private String finalidadeLote;
	private int capacidadeDeGado;
	private String tipoPastagem;
	private double pesoTotalDoLote;
	
	public Lote() { }

	

	public Lote(Integer id, String codigoLote, double tamanhoLote, String unidadeMedida, String finalidadeLote, int capacidadeDeGado,
			String tipoPastagem) {
		super();
		this.id = id;
		this.codigoLote = codigoLote;
		this.tamanhoLote = tamanhoLote;
		this.unidadeMedida = unidadeMedida;
		this.finalidadeLote = finalidadeLote;
		this.capacidadeDeGado = capacidadeDeGado;
		this.tipoPastagem = tipoPastagem;
	}


	
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacidadeDeGado;
		result = prime * result + ((codigoLote == null) ? 0 : codigoLote.hashCode());
		result = prime * result + ((finalidadeLote == null) ? 0 : finalidadeLote.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		long temp;
		temp = Double.doubleToLongBits(pesoTotalDoLote);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(tamanhoLote);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((tipoPastagem == null) ? 0 : tipoPastagem.hashCode());
		result = prime * result + ((unidadeMedida == null) ? 0 : unidadeMedida.hashCode());
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
		if (codigoLote == null) {
			if (other.codigoLote != null)
				return false;
		} else if (!codigoLote.equals(other.codigoLote))
			return false;
		if (finalidadeLote == null) {
			if (other.finalidadeLote != null)
				return false;
		} else if (!finalidadeLote.equals(other.finalidadeLote))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
		if (unidadeMedida == null) {
			if (other.unidadeMedida != null)
				return false;
		} else if (!unidadeMedida.equals(other.unidadeMedida))
			return false;
		return true;
	}

		
}
