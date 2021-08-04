package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	//GUARDAR UN NUEVO USUARIO
	public UsuarioModel saveUser(UsuarioModel user) {
		
		String nombre=user.getNombre();
		String correo=user.getCorreo();
		String password=user.getPassword();
		
		if(nombre!= null && correo!= null && password!=null) {
			return usuarioRepository.save(user);
		}
		return user;
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
		Long num = user.getId();
		if(usuarioRepository.findById(num).isPresent()) {
			
			UsuarioModel userToUpdate= new UsuarioModel();
			
			userToUpdate.setId(user.getId());
			userToUpdate.setEnlace_github(user.getEnlace_github());
			userToUpdate.setFoto_perfil(user.getFoto_perfil());
			userToUpdate.setCorreo(user.getCorreo());
			userToUpdate.setHabilidades(user.getHabilidades());
			userToUpdate.setIdiomas(user.getIdiomas());
			userToUpdate.setIntereses(user.getIntereses());
			userToUpdate.setUbicacion(user.getUbicacion());
			userToUpdate.setPassword(user.getPassword());
			userToUpdate.setFoto_portada(user.getFoto_portada());
			
			usuarioRepository.save(userToUpdate);
			return "Usuario modificado";	
		}else {
			return "Error al modificar el proyecto";
		}
		
	}
	
	
	
	
}
