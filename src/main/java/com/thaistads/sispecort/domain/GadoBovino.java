package com.thaistads.sispecort.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class GadoBovino {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private int numeroBrinco;
	private String corBrinco;
	private String categoriaAnimal;
	private String sexo;
	private float pesoinicial;
	private String raca;
	private String pelagem;
	private Date dataNascimento;
	
	@ManyToOne()
	private Lote lote;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
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
	
	
}
