package com.example.demo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="chats")
public class ChatsModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@OneToMany(targetEntity=MensajesModel.class, mappedBy= "chats")
	@JsonManagedReference
	private List<MensajesModel> chats;
	
	@ManyToOne
	@JsonBackReference
	private UsuarioModel emisor;
	
	@ManyToOne
	@JsonBackReference
	private UsuarioModel receptor;

}
