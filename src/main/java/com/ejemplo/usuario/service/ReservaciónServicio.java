package com.ejemplo.usuario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ejemplo.usuario.entity.Reservación;

import com.ejemplo.usuario.repository.ReservaciónRepository;

@RestController
@RequestMapping("/reservacion")
@CrossOrigin
public class ReservaciónServicio {

	@Autowired
	ReservaciónRepository reservaciónRepository;
	
	@GetMapping(path="/buscar")
	public List<Reservación> buscar(){
		return reservaciónRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Reservación guardar(@RequestBody Reservación reservacion) {
		return reservaciónRepository.save(reservacion);
	}
	
	@DeleteMapping(path="/eliminar/{idreservación}")
	public void eliminar(@PathVariable("idreservación") int idreservación){
		reservaciónRepository.deleteById(idreservación);
		
	}
}
