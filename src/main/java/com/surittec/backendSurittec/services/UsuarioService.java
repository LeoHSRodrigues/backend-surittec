package com.surittec.backendSurittec.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.surittec.backendSurittec.domain.Usuario;
import com.surittec.backendSurittec.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	

	@Autowired
	private UsuarioRepository repo;
	
	public Usuario cadastrarUsuario(Usuario obj) {
		obj.setId(null);
		repo.save(obj);
		return obj;
	}

}
