package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="amigos")
public class AmigosModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable=false)
	private long id;
	
	@ManyToOne
	@JsonBackReference
	private UsuarioModel user;
	
	@ManyToOne
	@JsonBackReference
	private UsuarioModel friends;
	
}
