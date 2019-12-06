package com.surittec.backendSurittec.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nomeCliente;
	private String CPF;
	private List<Email> email = new ArrayList<>();
	private List<Endereco> endereco = new ArrayList<>();
	private List<Telefone> telefone = new ArrayList<>();
	
	
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
