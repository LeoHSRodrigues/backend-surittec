package com.surittec.backendSurittec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.surittec.backendSurittec.domain.Usuario;
import com.surittec.backendSurittec.domain.enums.tipoUsuario;
import com.surittec.backendSurittec.services.UsuarioService;

@SpringBootApplication
public class BackendSurittecApplication implements CommandLineRunner{
	
	@Autowired
	private UsuarioService service;
			
	public static void main(String[] args) {
		SpringApplication.run(BackendSurittecApplication.class, args);
	}


			@Override
			public void run(String... args) throws Exception {
				Usuario user1 = new Usuario(null, "admin", "$2a$04$18jTCfGOoOiuGES/MDZFWevu13qe.BeaUERxzBpsvVdkUX0fYLKT6", tipoUsuario.ADMIN);
				Usuario user2 = new Usuario(null, "comum", "$2a$04$18jTCfGOoOiuGES/MDZFWevu13qe.BeaUERxzBpsvVdkUX0fYLKT6", tipoUsuario.NORMAL);
				service.cadastrarUsuario(user1);
				service.cadastrarUsuario(user2);
				
			}
}
