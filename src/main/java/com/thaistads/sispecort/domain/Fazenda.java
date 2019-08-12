package com.thaistads.sispecort.domain;

public class Fazenda {
	
	private Integer idFazenda;
	private String nomeFazenda;
	private int numDeRegistro;
	private String proprietario;
	private String endereco;
	private double quantAlqueires;
	
	public Fazenda() {	}

	public Fazenda(Integer idFazenda, String nomeFazenda, int numDeRegistro, String proprietario, String endereco,
			double quantAlqueires) {
		super();
		this.idFazenda = idFazenda;
		this.nomeFazenda = nomeFazenda;
		this.numDeRegistro = numDeRegistro;
		this.proprietario = proprietario;
		this.endereco = endereco;
		this.quantAlqueires = quantAlqueires;
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

	public double getQuantAlqueires() {
		return quantAlqueires;
	}

	public void setQuantAlqueires(double quantAlqueires) {
		this.quantAlqueires = quantAlqueires;
	}
	
	
}
