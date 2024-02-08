package com.ejemplo.usuario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ejemplo.usuario.entity.Lugar;


@Repository("lugarRepository")
public interface LugarRepository extends JpaRepository<Lugar, Integer>{
	
	public List<Lugar> findByNombreAndDescripcion
	(String nombre,String descripcion);
	
	public List<Lugar> findByNombreLike
	(String nombre);

}
