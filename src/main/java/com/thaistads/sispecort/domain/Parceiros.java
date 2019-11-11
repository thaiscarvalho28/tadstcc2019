package com.thaistads.sispecort.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parceiros {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idParceiro;
	
	private String nomeCompleto;
	private String tipo;
	private String email;
	private String telefoneComercial;
	private String telefonePessoal;
	private String endereco;
	private boolean status = true;
	
	
	//-----Metodos-----//
	
	
	public Integer getIdParceiro() {
		return idParceiro;
	}
	
	public void setIdParceiro(Integer idParceiro) {
		this.idParceiro = idParceiro;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefoneComercial() {
		return telefoneComercial;
	}
	
	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}
	
	public String getTelefonePessoal() {
		return telefonePessoal;
	}
	
	public void setTelefonePessoal(String telefonePessoal) {
		this.telefonePessoal = telefonePessoal;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
