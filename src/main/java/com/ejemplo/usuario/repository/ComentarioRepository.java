package com.ejemplo.usuario.repository;



import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ejemplo.usuario.entity.Comentario;


@Repository("comentarioRepository")
public interface ComentarioRepository extends JpaRepository<Comentario, Integer>{

	public List<Comentario> findByFechaAfter
	(Date fecha);
	
}
