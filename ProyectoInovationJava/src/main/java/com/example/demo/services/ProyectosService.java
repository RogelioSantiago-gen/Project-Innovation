package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ProyectosModel;
import com.example.demo.repositories.ProyectosRepository;

@Service
public class ProyectosService {

	@Autowired
	ProyectosRepository proyectosRepository;
	
	
	//PARA GUARDAR UN PROYECTO
	public ProyectosModel saveProyect(ProyectosModel proyecto) {
		return proyectosRepository.save(proyecto);
	}
	
	//RECUPERAR TODOS LOS PROYECTOS
	public ArrayList<ProyectosModel> getProyects(){
		return (ArrayList<ProyectosModel>) proyectosRepository.findAll();
	}
	
	//UPDATE PROYECTO
	/*public String updateProyecto(ProyectosModel proyectoNew) {
		Long num = proyectoNew.getId();
		if(proyectosRepository.findById(num).isPresent()) {
		
			ProyectosModel proyectoToUpdate= new ProyectosModel();
		
			proyectoToUpdate.setId(proyectoNew.getId());
			proyectoToUpdate.setTitulo(proyectoNew.getTitulo());
			proyectoToUpdate.setDescripcion(proyectoNew.getDescripcion());
			proyectoToUpdate.setFecha(proyectoNew.getFecha());
			proyectoToUpdate.setUrl_foto(proyectoNew.getUrl_foto());
			
			proyectosRepository.save(proyectoToUpdate);
			return "Proyecto Modificado";
		}else {
			return "Error al modificar proyecto";
		}	
	}*/
	
	
}
