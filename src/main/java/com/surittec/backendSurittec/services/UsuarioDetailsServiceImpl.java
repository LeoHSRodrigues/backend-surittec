package com.surittec.backendSurittec.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.surittec.backendSurittec.domain.Usuario;
import com.surittec.backendSurittec.repositories.UsuarioRepository;
import com.surittec.backendSurittec.security.UsuarioSS;

@Service
public class UsuarioDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private UsuarioRepository repo;

	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		
		Usuario usuario = repo.findByLogin(login);
		if (usuario == null) {
			throw new UsernameNotFoundException(login);
		}
		
		return new UsuarioSS(usuario.getId(), usuario.getLogin(), usuario.getSenha(), usuario.getTipousuario());
	}

}
