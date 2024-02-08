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
@Table(name = "comentario")
public class Comentario implements Serializable{


	private static final long serialVersionUID = 4540068614444751766L;
	
	@Id
	@Column(name="idcomentario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private int idcomentario;
	
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="texto")
	private String texto;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="idviaje")
	private int idviaje;

	public int getIdcomentario() {
		return idcomentario;
	}

	public void setIdcomentario(int idcomentario) {
		this.idcomentario = idcomentario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getIdviaje() {
		return idviaje;
	}

	public void setIdviaje(int idviaje) {
		this.idviaje = idviaje;
	}

	
}
