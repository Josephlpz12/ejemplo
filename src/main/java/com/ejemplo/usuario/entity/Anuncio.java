package com.ejemplo.usuario.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "anuncio")
public class Anuncio implements Serializable {


	private static final long serialVersionUID = 8787646625886828425L;
	
	@Id
	@Column(name="idanuncio")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private int idanuncio;
	
	@Column(name="texto")
	private String texto;
	
	@Column(name="imagen")
	private String imagen;
	
	@Column(name="FechaInicio")
	private Date FechaInicio;
	
	@Column(name="FechaFin")
	private Date FechaFin;
	

	@Column(name="idtipoAnuncio")
	private int idtipoAnuncio;

	public int getIdtipoAnuncio() {
		return idtipoAnuncio;
	}

	public void setIdtipoAnuncio(int idtipoAnuncio) {
		this.idtipoAnuncio = idtipoAnuncio;
	}

	public int getIdanuncio() {
		return idanuncio;
	}

	public void setIdanuncio(int idanuncio) {
		this.idanuncio = idanuncio;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Date getFechaInicio() {
		return FechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		FechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return FechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		FechaFin = fechaFin;
	}

}
