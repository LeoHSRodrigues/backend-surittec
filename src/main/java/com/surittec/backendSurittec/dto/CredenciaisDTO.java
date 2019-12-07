package com.surittec.backendSurittec.dto;

import java.io.Serializable;

public class CredenciaisDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String login;
	private String Senha;
	
	
	public CredenciaisDTO() {
		
	}
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}

}
