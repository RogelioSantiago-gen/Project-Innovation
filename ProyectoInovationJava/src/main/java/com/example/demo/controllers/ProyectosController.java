package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.ProyectosModel;
import com.example.demo.services.ProyectosService;

@RestController
@RequestMapping("/proyectos")
public class ProyectosController {

	@Autowired
	ProyectosService proyectosService;
	
	
	//GUARDAR PROYECTO
	@PostMapping
	public ProyectosModel saveProyecto(@RequestBody ProyectosModel proyecto) {
		return proyectosService.saveProyect(proyecto);
	}
	
	//RECUPERAR TODOS LOS PROYECTOS
	//Tenemos que hacer que recupere de 3 en 3
	//Hacer funcion en javascript que mande llamar al back cada que se actualizce el scrool infinito
	@GetMapping
	public ArrayList<ProyectosModel>getPosts(){
		return proyectosService.getProyects();
	}

	
	/*Hacer uncion que recupere proyectos solo del ID DEL USUARIO logeado son para pagina perfil*/
	

	//FUNCION PARA BORRAR PROYECTO POR SU ID DEL PROYECTO 
	
}
