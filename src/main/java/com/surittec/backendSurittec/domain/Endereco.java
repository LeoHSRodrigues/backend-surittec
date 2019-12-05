package com.surittec.backendSurittec.domain;

import java.io.Serializable;

public class Endereco implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer id_cliente;
	private String CEP;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String UF;
	private String complemento;
	
	public Endereco() {
		
	}

	public Endereco(Integer id, Integer id_cliente, String cep, String logradouro, String bairro, String cidade,
			String uf, String complemento) {
		super();
		this.id = id;
		this.id_cliente = id_cliente;
		CEP = cep;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		UF = uf;
		this.complemento = complemento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cep) {
		CEP = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uf) {
		UF = uf;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}