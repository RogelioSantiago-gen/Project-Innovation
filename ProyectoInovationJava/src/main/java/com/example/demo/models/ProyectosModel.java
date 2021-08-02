package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.GenerationType;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="proyectos")
public class ProyectosModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable=false)
	private long id;
	
	@Column(nullable=false, length=200)
	private String titulo;
	
	@Column(nullable=false, length=50)
	private Date fecha;
	
	@Column(nullable=false, length=250)
	private String descripcion;
	
	@Column(nullable=false, length=100)
	private String url_foto;
	
	@ManyToOne
	@JsonBackReference
	private UsuarioModel usuario;
	
	@OneToMany(targetEntity=ComentariosModel.class, mappedBy= "proyectos")
	@JsonManagedReference
	private List<ComentariosModel> comentarios;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrl_foto() {
		return url_foto;
	}

	public void setUrl_foto(String url_foto) {
		this.url_foto = url_foto;
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}
	
	
	
}
