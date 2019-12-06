package com.surittec.backendSurittec.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surittec.backendSurittec.domain.Cliente;
import com.surittec.backendSurittec.domain.Email;
import com.surittec.backendSurittec.domain.Telefone;
import com.surittec.backendSurittec.dto.ClienteNewDTO;
import com.surittec.backendSurittec.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscarUm(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public List<Cliente> buscarTodos() {
		return repo.findAll();
	}
	
	public Cliente cadastrarCliente(Cliente obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Cliente atualizarCliente(Cliente obj) {
		buscarUm(obj.getId());
		return repo.save(obj);
	}
	
	public void apagarCliente(Integer id) {
		buscarUm(id);
		repo.deleteById(id);
	}
	
	public Cliente fromDTO(ClienteNewDTO objDto) {
		Cliente cli = new Cliente();

	}
	
}
