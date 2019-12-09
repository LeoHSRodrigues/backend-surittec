package com.surittec.backendSurittec.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.surittec.backendSurittec.domain.Cliente;
import com.surittec.backendSurittec.dto.ClienteDTO;
import com.surittec.backendSurittec.dto.ClienteNewDTO;
import com.surittec.backendSurittec.services.ClienteService;

@RestController
@RequestMapping(value="/api/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Cliente> find(@PathVariable Integer id) {
		Cliente obj = service.buscarUm(id);		
		return ResponseEntity.ok(obj);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<List<ClienteDTO>> findAll() {
		List<Cliente> lista = service.buscarTodos();
		List<ClienteDTO> listaDTO = lista.stream().map(obj -> new ClienteDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok(listaDTO);
	}
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> createCliente (@Valid @RequestBody ClienteNewDTO obj) {
		Integer id = null;
		Cliente objeto = service.fromDTO(obj,id);
		service.cadastrarCliente(objeto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(objeto.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> updateCliente (@Valid @RequestBody ClienteNewDTO obj, @PathVariable Integer id) {
		Cliente objeto = service.fromDTO(obj, id);
		service.atualizarCliente(objeto);
		return ResponseEntity.noContent().build();
	}
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> deleteCliente(@PathVariable Integer id) {
		service.apagarCliente(id);		
		return ResponseEntity.noContent().build();
	}

}
