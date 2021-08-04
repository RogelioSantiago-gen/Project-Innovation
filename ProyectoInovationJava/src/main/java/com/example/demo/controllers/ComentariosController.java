package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.ComentariosModel;
import com.example.demo.services.ComentariosService;

@RestController
@RequestMapping("/comentarios")
public class ComentariosController {

	@Autowired
	ComentariosService comentariosService;
	
	@PostMapping
	public ComentariosModel saveComentario(@RequestBody ComentariosModel comentario) {
		return comentariosService.saveProyect(comentario);
	}
	
	@DeleteMapping(path= "/{id}")
	public String deleteComentario(@PathVariable("id") Long id) {
		boolean ok = comentariosService.deleteComentario(id);
		if(ok == true) {
			return "Se elimino es usuario";
		}else {
			return "No se pudo eliminar el usuario";
		}
	}
	
}
