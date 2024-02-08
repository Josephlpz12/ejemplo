package com.ejemplo.usuario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ejemplo.usuario.entity.Examen;

@Repository("examenRepository")
public interface ExamenRepository extends JpaRepository<Examen, Integer> {

	public List<Examen> findByNotaAndNoParcial
	(int nota,int noParcial);
	
}
