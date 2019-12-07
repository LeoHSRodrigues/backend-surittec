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
import com.surittec.backendSurittec.repositories.EmailRepository;
import com.surittec.backendSurittec.repositories.TelefoneRepository;

@Service
public class ClienteService {
	

	@Autowired
	private ClienteRepository repo;

	@Autowired
	private EmailRepository repoEmail;

	@Autowired
	private TelefoneRepository repoTelefone;

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
		repoEmail.saveAll(obj.getEmail());
		repoTelefone.saveAll(obj.getTelefone());
		return obj;
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
		Cliente cli = new Cliente(null, objDto.getNome(), objDto.getCPF(), objDto.getCEP(), objDto.getLogradouro(),
				objDto.getBairro(), objDto.getCidade(), objDto.getUF(), objDto.getComplemento());
		
		for(Email emp : objDto.getEmail()){
			Email email = new Email(null, emp.getEmail(), cli);
			cli.getEmail().add(email);
		}
		
		for(Telefone tele: objDto.getTelefone()){
			Telefone telefone = new Telefone(null, tele.getTelefone(), tele.getTipotelefone(), cli);
			cli.getTelefone().add(telefone);
		}
		return cli;
	}

}
