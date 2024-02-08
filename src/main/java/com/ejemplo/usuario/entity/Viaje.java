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
@Table(name = "viaje")
public class Viaje implements Serializable{


	private static final long serialVersionUID = 3229377373547885219L;

	@Id
	@Column(name="idviaje")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private int idviaje;
	
	@Column(name="FechaPartida")
	private Date FechaPartida;
	
	@Column(name="FechaRegreso")
	private Date FechaRegreso;
	
	@Column(name="cupo")
	private int cupo;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="idestado")
	private int idestado;
	
	@Column(name="origen")
	private int origen;
	
	@Column(name="destino")
	private int destino;

	public int getIdviaje() {
		return idviaje;
	}

	public void setIdviaje(int idviaje) {
		this.idviaje = idviaje;
	}

	public Date getFechaPartida() {
		return FechaPartida;
	}

	public void setFechaPartida(Date fechaPartida) {
		FechaPartida = fechaPartida;
	}

	public Date getFechaRegreso() {
		return FechaRegreso;
	}

	public void setFechaRegreso(Date fechaRegreso) {
		FechaRegreso = fechaRegreso;
	}

	public int getCupo() {
		return cupo;
	}

	public void setCupo(int cupo) {
		this.cupo = cupo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdestado() {
		return idestado;
	}

	public void setIdestado(int idestado) {
		this.idestado = idestado;
	}

	public int getOrigen() {
		return origen;
	}

	public void setOrigen(int origen) {
		this.origen = origen;
	}

	public int getDestino() {
		return destino;
	}

	public void setDestino(int destino) {
		this.destino = destino;
	}
	
	
	
	
}
