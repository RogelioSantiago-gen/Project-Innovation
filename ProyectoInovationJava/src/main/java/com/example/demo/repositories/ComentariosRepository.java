package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.ComentariosModel;

public interface ComentariosRepository extends CrudRepository<ComentariosModel, Long> {

}
