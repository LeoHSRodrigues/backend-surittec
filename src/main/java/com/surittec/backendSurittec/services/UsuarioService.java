package com.surittec.backendSurittec.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.surittec.backendSurittec.domain.Cliente;
import com.surittec.backendSurittec.domain.Usuario;
import com.surittec.backendSurittec.repositories.ClienteRepository;
import com.surittec.backendSurittec.repositories.EmailRepository;
import com.surittec.backendSurittec.repositories.TelefoneRepository;
import com.surittec.backendSurittec.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	

	@Autowired
	private UsuarioRepository repo;

}
