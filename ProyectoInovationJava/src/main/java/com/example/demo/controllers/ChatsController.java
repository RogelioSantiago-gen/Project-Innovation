package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.ChatsService;

@RestController
@RequestMapping("/chats")
public class ChatsController {

	@Autowired
	ChatsService chatsservice;
}
