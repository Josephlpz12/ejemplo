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
@Table(name = "reservación")
public class Reservación implements Serializable{

	private static final long serialVersionUID = 8929036361044892230L;

	@Id
	@Column(name="idreservación")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private int idreservación;
	
	@Column(name="cantidadPasajeros")
	private int cantidadPasajeros;
	
	@Column(name="observaciones")
	private String observaciones;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="idestado")
	private int idestado;
	
	@Column(name="idviaje")
	private int idviaje;

	public int getIdreservación() {
		return idreservación;
	}

	public void setIdreservación(int idreservación) {
		this.idreservación = idreservación;
	}

	public int getCantidadPasajeros() {
		return cantidadPasajeros;
	}

	public void setCantidadPasajeros(int cantidadPasajeros) {
		this.cantidadPasajeros = cantidadPasajeros;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getIdestado() {
		return idestado;
	}

	public void setIdestado(int idestado) {
		this.idestado = idestado;
	}

	public int getIdviaje() {
		return idviaje;
	}

	public void setIdviaje(int idviaje) {
		this.idviaje = idviaje;
	}
	
	
}
