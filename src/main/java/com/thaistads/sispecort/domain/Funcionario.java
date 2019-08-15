package com.thaistads.sispecort.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Funcionario extends PessoaFisica {
	
    private String cargo;
    private String dataContratacao;
    private double valorSalario;
    private String loginFuncionario;
    private String senha;
    
    @Column
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDataContratacao() {
		return dataContratacao;
	}
	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	public double getValorSalario() {
		return valorSalario;
	}
	public void setValorSalario(double valorSalario) {
		this.valorSalario = valorSalario;
	}
	public String getLoginFuncionario() {
		return loginFuncionario;
	}
	public void setLoginFuncionario(String loginFuncionario) {
		this.loginFuncionario = loginFuncionario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
    
}
