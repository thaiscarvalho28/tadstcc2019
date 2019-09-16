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
public class Fazenda{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idFazenda;
	
	private String nomeFazenda;
	private int numDeRegistro;
	
	@ManyToOne()
	private Proprietario proprietario;
	
	private String endereco;
		
	@ManyToOne(targetEntity = Lote.class)
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Lote> lotes;

	public Integer getIdFazenda() {
		return idFazenda;
	}

	public void setIdFazenda(Integer idFazenda) {
		this.idFazenda = idFazenda;
	}

	public String getNomeFazenda() {
		return nomeFazenda;
	}

	public void setNomeFazenda(String nomeFazenda) {
		this.nomeFazenda = nomeFazenda;
	}

	public int getNumDeRegistro() {
		return numDeRegistro;
	}

	public void setNumDeRegistro(int numDeRegistro) {
		this.numDeRegistro = numDeRegistro;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@OneToMany(cascade = CascadeType.REMOVE, mappedBy = "fazenda")
	public List<Lote> getLotes() {
		return lotes;
	}


	public void setLotes(List<Lote> lotes) {
		this.lotes = lotes;
	}
	
}
