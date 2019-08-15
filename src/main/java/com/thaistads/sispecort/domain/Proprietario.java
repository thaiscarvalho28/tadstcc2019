package com.thaistads.sispecort.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Proprietario extends PessoaFisica{
	
	private double prolabore;
	private String loginAdmin;
	private String senha;
	 
	@Column
	public double getProlabore() {
		return prolabore;
	}
	public void setProlabore(double prolabore) {
		this.prolabore = prolabore;
	}
	public String getLoginAdmin() {
		return loginAdmin;
	}
	public void setLoginAdmin(String loginAdmin) {
		this.loginAdmin = loginAdmin;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	 
}
