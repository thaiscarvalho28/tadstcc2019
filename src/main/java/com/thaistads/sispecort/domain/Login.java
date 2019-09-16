package com.thaistads.sispecort.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idLogin;
    private String nomeCompleto;
    private String email;
    private String telefone;
    private String nomeUser;
    private String senha;
   
	public Integer getIdLogin() {
		return idLogin;
	}
	
	public void setIdLogin(Integer idLogin) {
		this.idLogin = idLogin;
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
	
	public String getNomeUser() {
		return nomeUser;
	}
	
	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
    
}
