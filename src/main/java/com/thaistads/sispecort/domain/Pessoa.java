package com.thaistads.sispecort.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Pessoa {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPessoa;
    private String nomeCompleto;
    private String email;
    private String telefone;
    private String dataNascimento;
    private String endereco;
    
	public Integer getIdPessoa() {
		return idPessoa;
	}
    
	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}	
    
}
