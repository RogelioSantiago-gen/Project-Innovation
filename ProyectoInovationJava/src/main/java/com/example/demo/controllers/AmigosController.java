package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.AmigosService;

@RestController
@RequestMapping("/amigos")
public class AmigosController {

	@Autowired
	AmigosService amigosService;
}
