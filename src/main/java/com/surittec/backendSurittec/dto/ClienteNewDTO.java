package com.surittec.backendSurittec.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.surittec.backendSurittec.domain.Email;
import com.surittec.backendSurittec.domain.Telefone;

public class ClienteNewDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private String nome;
	private String CPF;
	private String CEP;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String UF;
	private String complemento;
	private List<Email> email = new ArrayList<>();
	private List<Telefone> telefone = new ArrayList<>();
	
	public ClienteNewDTO() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cpf) {
		CPF = cpf;
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


	
	
	
}
