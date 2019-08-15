package com.thaistads.sispecort.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Fazenda{
	
	private Integer idFazenda;
	private String nomeFazenda;
	private int numDeRegistro;
	private String proprietario;
	private String endereco;
	private List<Lote> lotes;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
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
