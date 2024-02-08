package com.ejemplo.usuario.repository;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ejemplo.usuario.entity.Viaje;

@Repository("viajeRepository")
public interface ViajeRepository extends JpaRepository<Viaje, Integer>{

	
}
