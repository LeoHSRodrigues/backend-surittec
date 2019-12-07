package com.surittec.backendSurittec.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import com.surittec.backendSurittec.domain.Email;
import com.surittec.backendSurittec.domain.Telefone;


public class ClienteNewDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	@NotEmpty(message="Nome obrigatório")
	@Length(min=3, max=100,message="Tamanho entre 3 e 100 caracteres")
	@Pattern(regexp = "^[A-Za-z0-9- ]+$")
	private String nome;
	
	@NotEmpty(message="CPF obrigatório")
	private String CPF;
	
	@NotEmpty(message="CEP obrigatório")
	private String CEP;
	
	@NotEmpty(message="Logradouro obrigatório")
	private String logradouro;
	
	@NotEmpty(message="Bairro obrigatório")
	private String bairro;
	
	@NotEmpty(message="Cidade obrigatório")
	private String cidade;
	
	@NotEmpty(message="UF obrigatório")
	private String UF;
	
	private String complemento;
	
	@NotEmpty(message="Email obrigatório")
	private List<Email> email  = new ArrayList<>();
	
	private List<Telefone> telefone  = new ArrayList<>();
	
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
