package com.example.demo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="comentarios")
public class ComentariosModel {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(nullable=false)
	private long id;
	
	@Column(nullable=false, length=250)
	private String texto;
	
	@Column(nullable=false, length=100)
	private Date fecha;
	
	@ManyToOne
	@JsonBackReference
	private ProyectosModel proyectos;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public ProyectosModel getProyectos() {
		return proyectos;
	}

	public void setProyectos(ProyectosModel proyectos) {
		this.proyectos = proyectos;
	}
	
	
	
	
}
