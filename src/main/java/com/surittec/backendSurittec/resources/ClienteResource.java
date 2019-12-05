package com.surittec.backendSurittec.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.surittec.backendSurittec.domain.Cliente;

@RestController
@RequestMapping(value="/api/clientes")
public class ClienteResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Cliente> listarTodos() {
		
		Cliente cliente = new Cliente(1,"Leonardo","04397105103");
		
		List<Cliente> listaTodos = new ArrayList<>();
		listaTodos.add(cliente);
		
		return listaTodos;
	}

}
