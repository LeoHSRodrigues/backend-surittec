package com.surittec.backendSurittec.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<ClienteDTO>> findAll() {
		List<Cliente> lista = service.buscarTodos();
		List<ClienteDTO> listaDTO = lista.stream().map(obj -> new ClienteDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok(listaDTO);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> createCliente (@Valid @RequestBody ClienteNewDTO obj) {
		Cliente objeto = service.fromDTO(obj);
		service.cadastrarCliente(objeto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(objeto.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value="/{id]", method=RequestMethod.PUT)
	public ResponseEntity<Void> updateCliente (@RequestBody Cliente obj, @PathVariable Integer id) {
		obj.setId(id);
		obj = service.atualizarCliente(obj);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> deleteCliente(@PathVariable Integer id) {
		service.apagarCliente(id);		
		return ResponseEntity.noContent().build();
	}

}
