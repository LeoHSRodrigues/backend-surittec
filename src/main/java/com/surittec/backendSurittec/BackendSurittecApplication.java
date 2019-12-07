package com.surittec.backendSurittec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.surittec.backendSurittec.domain.Usuario;
import com.surittec.backendSurittec.domain.enums.tipoUsuario;

@SpringBootApplication
public class BackendSurittecApplication {
			
	public static void main(String[] args) {
		SpringApplication.run(BackendSurittecApplication.class, args);
	}

			Usuario user1 = new Usuario(null, "admin", "$2a$04$18jTCfGOoOiuGES/MDZFWevu13qe.BeaUERxzBpsvVdkUX0fYLKT6", tipoUsuario.ADMIN);
			Usuario user2 = new Usuario(null, "comum", "$2a$04$18jTCfGOoOiuGES/MDZFWevu13qe.BeaUERxzBpsvVdkUX0fYLKT6", tipoUsuario.NORMAL);
				
}
