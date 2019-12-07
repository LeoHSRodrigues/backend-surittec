package com.surittec.backendSurittec.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nomeCliente;
	private String CPF;
	private String CEP;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String UF;
	private String complemento;

	@OneToMany(mappedBy = "clienteEmail")
	private List<Email> email = new ArrayList<>();

	@OneToMany(mappedBy = "clienteTelefone")
	private List<Telefone> telefone = new ArrayList<>();
	
	public Cliente() {
		
	}
	
	public Cliente(Integer id, String nomeCliente, String cpf, String cep, String logradouro, String bairro,
			String cidade, String uf, String complemento) {
		super();
		this.id = id;
		this.nomeCliente = nomeCliente;
		CPF = cpf;
		CEP = cep;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		UF = uf;
		this.complemento = complemento;
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

	public List<Email> getEmail() {
		return email;
	}

	public void setEmail(List<Email> email) {
		this.email = email;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
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
