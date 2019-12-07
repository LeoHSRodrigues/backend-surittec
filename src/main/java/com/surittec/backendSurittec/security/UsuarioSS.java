package com.surittec.backendSurittec.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.surittec.backendSurittec.domain.enums.tipoUsuario;

public class UsuarioSS implements UserDetails{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String login;
	private String senha;
	private tipoUsuario tipoContaUsuario;
	
	public UsuarioSS() {
		
	}
	
	public UsuarioSS(Integer id, String login, String senha, tipoUsuario tipoContaUsuario) {
		super();
		this.id = id;
		this.login = login;
		this.senha = senha;
		this.setTipoContaUsuario(tipoContaUsuario);
	}

	public Integer getId(){
		return id;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
		    authorities.add(new SimpleGrantedAuthority("Admin"));
		    authorities.add(new SimpleGrantedAuthority("Comum"));
			return authorities;
		
	}

	@Override
	public String getPassword() {
		return senha;
	}

	@Override
	public String getUsername() {
		return login;
	}

	public tipoUsuario getTipoContaUsuario() {
		return tipoContaUsuario;
	}

	public void setTipoContaUsuario(tipoUsuario tipoContaUsuario) {
		this.tipoContaUsuario = tipoContaUsuario;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	
	
	
}
