package com.example.demo.services;

import java.util.Optional;

import static java.util.Collections.emptyList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService{

	@Autowired
	UsuarioRepository usuarioRepository;

	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository=usuarioRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UsuarioModel usuario = usuarioRepository.findByUsername(username);
		if (usuario == null) {
			throw new UsernameNotFoundException(username);
		}
		return new User(usuario.getUsername(), usuario.getPassword(), emptyList());
	}
	
	
	//PARA BORRAR EL USUARIO 
	public boolean deleteUser(Long id){
		try {
			usuarioRepository.deleteById(id);
			return true;
		}catch(Exception error) {
			return false;
		}
	}
	
	//PARA ENCONTRAR UN USUARIO
	public Optional<UsuarioModel> getUserById(Long id) {
		return usuarioRepository.findById(id);
	}
	
	//PARA PODER EDITAR UN USUARIO
	public String usuarioUpdate(UsuarioModel user) {
		
		String userBandera = user.getFoto_perfil();
			user.setFoto_perfil(userBandera);
		
		return "Se edito el user";
	}
	
	
	
	
}
