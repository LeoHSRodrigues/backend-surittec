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
		repo.save(obj);
		return obj;
	}

	public Cliente atualizarCliente(Cliente obj) {
		repo.save(obj);
		return obj;
	}

	public void apagarCliente(Integer id) {
		buscarUm(id);
		repo.deleteById(id);
	}
	
	public Cliente fromDTO(ClienteNewDTO objDto, Integer id) {
		Cliente cli = new Cliente(id, objDto.getNome(), objDto.getCPF(), objDto.getCEP(), objDto.getLogradouro(),
				objDto.getBairro(), objDto.getCidade(), objDto.getUF(), objDto.getComplemento());
		
		for(Email emp : objDto.getEmail()){
			Email email = new Email(emp.getId(), emp.getEmail(), cli);
			cli.getEmail().add(email);
		}
		
		for(Telefone tele: objDto.getTelefone()){
			Telefone telefone = new Telefone(tele.getId(), tele.getTelefone(), tele.getTipotelefone(), cli);
			cli.getTelefone().add(telefone);
		}
		return cli;
	}

}
