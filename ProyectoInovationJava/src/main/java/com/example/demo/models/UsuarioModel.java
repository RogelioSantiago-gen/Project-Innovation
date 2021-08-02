package com.example.demo.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="usuario")
public class UsuarioModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable=false)
	private long id;
	
	@Column(nullable=false, length=100)
	private String nombre;
	
	@Column(nullable=false, length=100, unique=true)
	private String correo;
	
	@Column(nullable=false, length=100)
	private String password;
	
	@Column(nullable=true, length=100)
	private String foto_perfil;
	
	@Column(nullable=true, length=100)
	private String ubicacion;
	
	@Column(nullable=true, length=100)
	private String trabajo;
	
	@Column(nullable=true, length=100)
	private String habilidades;
	
	@Column(nullable=true, length=100)
	private String idiomas;
	
	@Column(nullable=true, length=100)
	private String intereses;
	
	@Column(nullable=true, length=100)
	private String enlace_github;
	
	@Column(nullable=false, length=100)
	private int tipo_usuario;
	
	@OneToMany(targetEntity=ProyectosModel.class, mappedBy= "usuario")
	@JsonManagedReference
	private List<ProyectosModel> proyectos;
	
	@OneToMany(targetEntity = AmigosModel.class, mappedBy = "user")
	@JsonManagedReference
	private List<AmigosModel> user;
	
	@OneToMany(targetEntity = AmigosModel.class, mappedBy = "friends")
	@JsonManagedReference
	private List<AmigosModel> friends;
	
	@OneToMany(targetEntity = MensajesModel.class, mappedBy = "user")
	@JsonManagedReference
	private List<MensajesModel> user_mensajes;
	
	@OneToMany(targetEntity = ChatsModel.class, mappedBy = "receptor")
	@JsonManagedReference
	private List<ChatsModel> receptor;
	
	@OneToMany(targetEntity = ChatsModel.class, mappedBy = "emisor")
	@JsonManagedReference
	private List<ChatsModel> emisor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFoto_perfil() {
		return foto_perfil;
	}

	public void setFoto_perfil(String foto_perfil) {
		this.foto_perfil = foto_perfil;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public String getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}

	public String getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}

	public String getIntereses() {
		return intereses;
	}

	public void setIntereses(String intereses) {
		this.intereses = intereses;
	}

	public String getEnlace_github() {
		return enlace_github;
	}

	public void setEnlace_github(String enlace_github) {
		this.enlace_github = enlace_github;
	}

	public int getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(int tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	public List<ProyectosModel> getProyectos() {
		return proyectos;
	}

	public void setProyectos(List<ProyectosModel> proyectos) {
		this.proyectos = proyectos;
	}
	
	
	
}
