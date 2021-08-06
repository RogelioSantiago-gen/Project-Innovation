package com.example.demo.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	
	@Column(length=100, nullable=true)
	private String foto_perfil;
	
	@Column(length=100, nullable=true)
	private String foto_portada;

	@Column(length=100, nullable=true)
	private String ubicacion;
	
	@Column(length=100, nullable=true)
	private String trabajo;
	
	@Column(length=100, nullable=true)
	private String habilidades;
	
	@Column(length=100, nullable=true)
	private String idiomas;
	
	@Column(length=100, nullable=true)
	private String intereses;
	
	@Column(length=100,nullable=true)

	private String enlace_github;
	
	@Column(length = 100, nullable=false)
		private String username;
	
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@OneToMany(targetEntity=ProyectosModel.class, mappedBy= "usuario")
	private List<ProyectosModel> proyectos;
	
	@OneToMany(targetEntity = AmigosModel.class, mappedBy = "user")
	private List<AmigosModel> user;
	
	@OneToMany(targetEntity = AmigosModel.class, mappedBy = "friends")
	private List<AmigosModel> friends;
	
	@OneToMany(targetEntity = MensajesModel.class, mappedBy = "user")
	private List<MensajesModel> user_mensajes;
	
	@OneToMany(targetEntity = ChatsModel.class, mappedBy = "receptor")
	private List<ChatsModel> receptor;
	
	@OneToMany(targetEntity = ChatsModel.class, mappedBy = "emisor")
	private List<ChatsModel> emisor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getFoto_portada() {
		return foto_portada;
	}

	public void setFoto_portada(String foto_portada) {
		this.foto_portada = foto_portada;
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


	public List<ProyectosModel> getProyectos() {
		return proyectos;
	}

	public void setProyectos(List<ProyectosModel> proyectos) {
		this.proyectos = proyectos;
	}
		
}
