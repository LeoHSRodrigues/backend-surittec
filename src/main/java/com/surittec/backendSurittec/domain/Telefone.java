package com.surittec.backendSurittec.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.surittec.backendSurittec.domain.enums.tipoTelefone;

@Entity
public class Telefone implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String telefone;
	private Integer tipotelefone;
	
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente clienteTelefone;
	
	public Telefone() {
		
	}

	public Telefone(Integer id, String telefone, tipoTelefone tipotelefone, Cliente clienteTelefone) {
		super();
		this.id = id;
		this.telefone = telefone;
		this.tipotelefone = tipotelefone.getCod();
		this.clienteTelefone = clienteTelefone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@JsonIgnore
	public Cliente getCliente() {
		return clienteTelefone;
	}

	public void setCliente(Cliente cliente) {
		this.clienteTelefone = cliente;
	}

	public tipoTelefone getTipotelefone() {
		return tipoTelefone.toEnum(tipotelefone);
	}

	public void setTipotelefone(tipoTelefone tipotelefone) {
		this.tipotelefone = tipotelefone.getCod();
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
		Telefone other = (Telefone) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
	

}
