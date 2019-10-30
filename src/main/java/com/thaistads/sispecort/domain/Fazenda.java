package com.thaistads.sispecort.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Fazenda{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idFazenda;
	
	private String nomeFazenda;
	private int numDeRegistro;
	
	private String endereco;
	
	@ManyToOne(targetEntity = Proprietario.class)
	private Proprietario proprietario;
		
//	@OneToMany(targetEntity = Lote.class)
//	private List<Lote> lotes;
	
	@OneToMany(targetEntity = Funcionario.class)
	private List<Funcionario> funcionarios;
	
//	@OneToMany(targetEntity = Parceiros.class)
//	private List<Parceiros> parceiros;
	
	
	//-----Metodos-----//

	
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

//	public List<Parceiros> getParceiros() {
//		return parceiros;
//	}
//
//	public void setParceiros(List<Parceiros> parceiros) {
//		this.parceiros = parceiros;
//	}

//	public List<Lote> getLotes() {
//		return lotes;
//	}
//
//	public void setLotes(List<Lote> lotes) {
//		this.lotes = lotes;
//	}
	
}
