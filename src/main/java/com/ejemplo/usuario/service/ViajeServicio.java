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


import com.ejemplo.usuario.entity.Viaje;

import com.ejemplo.usuario.repository.ViajeRepository;

@RestController
@RequestMapping("/viaje")
@CrossOrigin
public class ViajeServicio {

	@Autowired
	ViajeRepository viajeRepository;
	
	@GetMapping(path="/buscar")
	public List<Viaje> buscar(){
		return viajeRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Viaje guardar(@RequestBody Viaje viaje) {
		return viajeRepository.save(viaje);
	}
	
	@DeleteMapping(path="/eliminar/{idviaje}")
	public void eliminar(@PathVariable("idviaje") int idviaje){
		viajeRepository.deleteById(idviaje);
		
	}
	@GetMapping(path="/buscarviaje")
	public List<Viaje> buscarviaje(){
		return viajeRepository.findAll();
	}
	
	@PostMapping(path="/guardarviaje")
	public Viaje guardarviaje(@RequestBody Viaje viaje) {
		return viajeRepository.save(viaje);
	}

}
