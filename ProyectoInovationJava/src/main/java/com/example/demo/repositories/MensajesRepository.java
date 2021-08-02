package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.MensajesModel;

public interface MensajesRepository extends CrudRepository<MensajesModel, Long> {

}
