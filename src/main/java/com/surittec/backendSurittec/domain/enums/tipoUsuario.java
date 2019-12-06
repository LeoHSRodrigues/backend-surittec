package com.surittec.backendSurittec.domain.enums;

public enum tipoUsuario {
	
	ADMIN(0, "Administrador"),
	NORMAL(1, "Normal");
	
	private int cod;
	private String descricao;
	
	private tipoUsuario (int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static tipoUsuario toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		
		for (tipoUsuario x : tipoUsuario.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("id invalido: " + cod);
	}

}
