package com.ejemplo.usuario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ejemplo.usuario.entity.Estado;

@Repository("estadoRepository")
public interface EstadoRepository extends JpaRepository<Estado, Integer>{
	
	public List<Estado> findByTablaAndCampo
	(String tabla,String campo);

}
