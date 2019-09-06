package com.thaistads.sispecort.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Nascimento{

	private Integer idNascimento;
	private GadoBovino idMae;
	private GadoBovino idPai;
	
	private GadoBovino idBezerro;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdNascimento() {
		return idNascimento;
	}

	public void setIdNascimento(Integer idNascimento) {
		this.idNascimento = idNascimento;
	}

	@OneToOne()
	@JoinColumn(name = "id_mae", unique = true)
	public GadoBovino getIdMae() {
		return idMae;
	}

	public void setIdMae(GadoBovino idMae) {
		this.idMae = idMae;
	}

	@OneToOne()
	@JoinColumn(name = "id_pai", unique = true)
	public GadoBovino getIdPai() {
		return idPai;
	}

	public void setIdPai(GadoBovino idPai) {
		this.idPai = idPai;
	}

	@OneToOne()
	@JoinColumn(name = "id_bezerro", unique = true)
	public GadoBovino getIdBezerro() {
		return idBezerro;
	}

	public void setIdBezerro(GadoBovino idBezerro) {
		this.idBezerro = idBezerro;
	}
		
}
