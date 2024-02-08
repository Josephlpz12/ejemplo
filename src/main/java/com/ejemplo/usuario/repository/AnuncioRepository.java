package com.ejemplo.usuario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo.usuario.entity.Anuncio;



@Repository("anuncioRepository")
public interface AnuncioRepository extends JpaRepository<Anuncio, Integer>{

	public List<Anuncio> findByTextoAndImagen
	(String texto,String imagen);
	
	
	
	
}
