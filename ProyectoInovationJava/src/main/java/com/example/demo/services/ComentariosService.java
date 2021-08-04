package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ComentariosModel;
import com.example.demo.models.ProyectosModel;
import com.example.demo.repositories.ComentariosRepository;

@Service
public class ComentariosService {

	@Autowired
	ComentariosRepository comentariosRepository;
	
	//PARA GUARDAR UN PROYECTO
	public ComentariosModel saveProyect(ComentariosModel comentario) {
		return comentariosRepository.save(comentario);
	}
	
	//PARA BORRAR UN COMENTARIO
	public boolean deleteComentario(Long id){
		try {
			comentariosRepository.deleteById(id);
			return true;
		}catch(Exception error) {
			return false;
		}
	}
}
