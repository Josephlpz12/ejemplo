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
@Table(name ="examen")
public class Examen implements Serializable {


	private static final long serialVersionUID = 5832941811441993689L;

	@Id
	@Column(name="idexamen")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private int idexamen;
	
	@Column(name="noParcial")
	private int noParcial;
	
	@Column(name="fechaExamen")
	private Date fechaExamen;
	
	@Column(name="nota")
	private int nota;
	
	@Column(name="carnet")
	private String carnet;

	public int getIdexamen() {
		return idexamen;
	}

	public void setIdexamen(int idexamen) {
		this.idexamen = idexamen;
	}

	public int getNoParcial() {
		return noParcial;
	}

	public void setNoParcial(int noParcial) {
		this.noParcial = noParcial;
	}

	public Date getFechaExamen() {
		return fechaExamen;
	}

	public void setFechaExamen(Date fechaExamen) {
		this.fechaExamen = fechaExamen;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	
}
