package com.thaistads.sispecort.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fazenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idFazenda;
	private String nomeFazenda;
	private int numDeRegistro;
	private String proprietario;
	private String endereco;
	
	public Fazenda() {	}

	public Fazenda(Integer idFazenda, String nomeFazenda, int numDeRegistro, 
			String proprietario, String endereco) {
		super();
		this.idFazenda = idFazenda;
		this.nomeFazenda = nomeFazenda;
		this.numDeRegistro = numDeRegistro;
		this.proprietario = proprietario;
		this.endereco = endereco;
	}

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
	
}
