package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.ChatsModel;

public interface ChatsRepository extends CrudRepository<ChatsModel, Long> {

}
