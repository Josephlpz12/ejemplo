package com.ejemplo.usuario.entity;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "administrador")
public class Administrador implements Serializable {


	private static final long serialVersionUID = -964621149558312546L;
	
	@Id
	@Column(name="usuario")
	@Basic(optional=false)
	private String usuario;
	
	@Column(name="password")
	private String password;
	
	@Column(name="universidad")
	private String universidad;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="carnet")
	private String carnet;

	@Column(name="curso")
	private String curso;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
