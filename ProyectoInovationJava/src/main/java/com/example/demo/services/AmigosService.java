package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.AmigosRepository;

@Service
public class AmigosService {

	@Autowired
	AmigosRepository amigosRepository;
	
	//TODAS LAS FUNCIONES AQUI
}
