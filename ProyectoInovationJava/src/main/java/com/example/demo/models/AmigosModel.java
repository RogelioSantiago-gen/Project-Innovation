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
	private UsuarioModel user;
	
	@ManyToOne
	private UsuarioModel friends;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UsuarioModel getUser() {
		return user;
	}

	public void setUser(UsuarioModel user) {
		this.user = user;
	}

	public UsuarioModel getFriends() {
		return friends;
	}

	public void setFriends(UsuarioModel friends) {
		this.friends = friends;
	}
	
	
	
}
