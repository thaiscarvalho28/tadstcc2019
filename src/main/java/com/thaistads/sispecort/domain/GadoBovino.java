package com.thaistads.sispecort.domain;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class GadoBovino {
	
	private Integer idGado;
	private int numeroBrinco;
	private String corBrinco;
	private String categoriaAnimal;
	private String sexo;
	private float pesoinicial;
	private String raca;
	private String pelagem;
	private Date dataNascimento;
	private Lote loteResidente;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdGado() {
		return idGado;
	}
	
	public void setIdGado(Integer idGado) {
		this.idGado = idGado;
	}
	
	public int getNumeroBrinco() {
		return numeroBrinco;
	}
	
	public void setNumeroBrinco(int numeroBrinco) {
		this.numeroBrinco = numeroBrinco;
	}
	
	public String getCorBrinco() {
		return corBrinco;
	}
	
	public void setCorBrinco(String corBrinco) {
		this.corBrinco = corBrinco;
	}
	
	public String getCategoriaAnimal() {
		return categoriaAnimal;
	}
	
	public void setCategoriaAnimal(String categoriaAnimal) {
		this.categoriaAnimal = categoriaAnimal;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public float getPesoinicial() {
		return pesoinicial;
	}
	
	public void setPesoinicial(float pesoinicial) {
		this.pesoinicial = pesoinicial;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String getPelagem() {
		return pelagem;
	}
	
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Lote getLoteResidente() {
		return loteResidente;
	}
	
	public void setLoteResidente(Lote loteResidente) {
		this.loteResidente = loteResidente;
	}
	
}
