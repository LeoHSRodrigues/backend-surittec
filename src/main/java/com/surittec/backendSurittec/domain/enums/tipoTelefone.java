package com.surittec.backendSurittec.domain.enums;

public enum tipoTelefone {
	
	RESIDENCIAL(0, "Residencial"),
	COMERCIAL(1, "Comercial"),
	CELULAR(2, "Celular");
	
	private int cod;
	private String descricao;
	
	private tipoTelefone (int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static tipoTelefone toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		
		for (tipoTelefone x : tipoTelefone.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("id invalido: " + cod);
	}

}
