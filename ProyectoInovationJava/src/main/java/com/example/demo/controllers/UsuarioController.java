package com.example.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.UsuarioModel;
import com.example.demo.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	//CREAR USUARIO
	@PostMapping
	public UsuarioModel saveUser(@RequestBody UsuarioModel user) {
		return usuarioService.saveUser(user);
	}
	
	//BORRAR USUARIO
	@DeleteMapping(path="/{id}")
	public String deleteUser(@PathVariable("id")Long id) {
		boolean ok= usuarioService.deleteUser(id);
		if(ok==true) {
			return "Se elimino el usuario";
		}else {
			return "No se elimino el usuario";
		}
	}
	
	//EDITAR USUARIO
	@GetMapping("/editar/{id}")
	public Optional<UsuarioModel>getUserById(@PathVariable("id") Long id) {
		return usuarioService.getUserById(id);
		
	}
	
}
