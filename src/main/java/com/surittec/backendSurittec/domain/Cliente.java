package com.surittec.backendSurittec.domain;

import java.io.Serializable;

public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nomeCliente;
	private String CPF;
	
	
	public Cliente() {
		
	}


	public Cliente(Integer id, String nome, String cpf) {
		super();
		this.id = id;
		nomeCliente = nome;
		CPF = cpf;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nomeCliente;
	}


	public void setNome(String nome) {
		nomeCliente = nome;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cpf) {
		CPF = cpf;
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
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
