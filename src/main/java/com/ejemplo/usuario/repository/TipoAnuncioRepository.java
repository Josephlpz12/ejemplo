package com.ejemplo.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo.usuario.entity.TipoAnuncio;

@Repository("tipoanuncioRepository")
public interface TipoAnuncioRepository extends JpaRepository<TipoAnuncio, Integer>{

}
