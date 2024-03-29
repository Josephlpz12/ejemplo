package com.ejemplo.usuario.repository;





import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo.usuario.entity.Administrador;



@Repository("administradorRepository")
public interface AdministradorRepository extends JpaRepository<Administrador, String>{

	List<Administrador> findByUsuarioAndPassword(String usuario, String passwrod);
	
	
}
