package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.ProyectosModel;

public interface ProyectosRepository extends CrudRepository<ProyectosModel, Long> {

}
