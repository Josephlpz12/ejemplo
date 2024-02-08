package com.ejemplo.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo.usuario.entity.Reservación;

@Repository("reservaciónRepository")
public interface ReservaciónRepository extends JpaRepository<Reservación, Integer>{

}
