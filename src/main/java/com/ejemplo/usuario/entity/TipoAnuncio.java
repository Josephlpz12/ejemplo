package com.ejemplo.usuario.entity;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_anuncio")
public class TipoAnuncio implements Serializable{

	private static final long serialVersionUID = -606116496198300982L;


	@Id
	@Column(name="idtipoAnuncio")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private int idtipoAnuncio;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="imagen")
	private String imagen;

	public int getIdtipoAnuncio() {
		return idtipoAnuncio;
	}

	public void setIdtipoAnuncio(int idtipoAnuncio) {
		this.idtipoAnuncio = idtipoAnuncio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
	
	
}
