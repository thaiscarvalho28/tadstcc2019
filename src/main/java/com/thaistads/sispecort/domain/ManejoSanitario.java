package com.thaistads.sispecort.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ManejoSanitario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idManejo;
	
	private Date dataManejo;
	private Date dataProximo;
	
	@ManyToOne()
	private Lote lote;
	
	@OneToMany()
	private List<GadoBovino> rebanhoManejado;
	
	private String tipoDeManejo;
	private String anotacoes;
	private String viaDeAplicacao;
	private String tratamento;
	private String insumoUtilizado;
	private float custoUnitarioInsumo;
	private int quantInsumo;
	private float custosAdicionais;
	
	
	public Integer getIdManejo() {
		return idManejo;
	}
	
	public void setIdManejo(Integer idManejo) {
		this.idManejo = idManejo;
	}
	
	public Date getDataManejo() {
		return dataManejo;
	}
	
	public void setDataManejo(Date dataManejo) {
		this.dataManejo = dataManejo;
	}
	
	public Lote getLote() {
		return lote;
	}
	
	public void setLote(Lote lote) {
		this.lote = lote;
	}
	
	public List<GadoBovino> getRebanhoManejado() {
		return rebanhoManejado;
	}

	public void setRebanhoManejado(List<GadoBovino> rebanhoManejado) {
		this.rebanhoManejado = rebanhoManejado;
	}

	public String getTipoDeManejo() {
		return tipoDeManejo;
	}
	
	public void setTipoDeManejo(String tipoDeManejo) {
		this.tipoDeManejo = tipoDeManejo;
	}
	
	public String getAnotacoes() {
		return anotacoes;
	}
	
	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}
	
	public String getViaDeAplicacao() {
		return viaDeAplicacao;
	}
	
	public void setViaDeAplicacao(String viaDeAplicacao) {
		this.viaDeAplicacao = viaDeAplicacao;
	}
	
	public String getTratamento() {
		return tratamento;
	}
	
	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}
	
	public String getInsumoUtilizado() {
		return insumoUtilizado;
	}
	
	public void setInsumoUtilizado(String insumoUtilizado) {
		this.insumoUtilizado = insumoUtilizado;
	}

	public Date getDataProximo() {
		return dataProximo;
	}

	public void setDataProximo(Date dataProximo) {
		this.dataProximo = dataProximo;
	}

	public float getCustoUnitarioInsumo() {
		return custoUnitarioInsumo;
	}

	public void setCustoUnitarioInsumo(float custoUnitarioInsumo) {
		this.custoUnitarioInsumo = custoUnitarioInsumo;
	}

	public int getQuantInsumo() {
		return quantInsumo;
	}

	public void setQuantInsumo(int quantInsumo) {
		this.quantInsumo = quantInsumo;
	}

	public float getCustosAdicionais() {
		return custosAdicionais;
	}

	public void setCustosAdicionais(float custosAdicionais) {
		this.custosAdicionais = custosAdicionais;
	}
	
	
	
}
