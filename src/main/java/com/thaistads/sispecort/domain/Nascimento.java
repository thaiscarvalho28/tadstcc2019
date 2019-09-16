package com.thaistads.sispecort.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Nascimento{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idNascimento;
	
	@OneToOne()
	@JoinColumn(name = "id_mae", unique = true)
	private GadoBovino idMae;
	
	@OneToOne()
	@JoinColumn(name = "id_pai", unique = true)
	private GadoBovino idPai;
	
	private Date dataNascimento;
	
	@OneToOne()
	@JoinColumn(name = "id_bezerro", unique = true)
	private GadoBovino idBezerro;
	
	public Integer getIdNascimento() {
		return idNascimento;
	}

	public void setIdNascimento(Integer idNascimento) {
		this.idNascimento = idNascimento;
	}

	public GadoBovino getIdMae() {
		return idMae;
	}

	public void setIdMae(GadoBovino idMae) {
		this.idMae = idMae;
	}

	public GadoBovino getIdPai() {
		return idPai;
	}

	public void setIdPai(GadoBovino idPai) {
		this.idPai = idPai;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public GadoBovino getIdBezerro() {
		return idBezerro;
	}

	public void setIdBezerro(GadoBovino idBezerro) {
		this.idBezerro = idBezerro;
	}
	
}
