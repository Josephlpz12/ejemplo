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


import com.ejemplo.usuario.entity.Lugar;
import com.ejemplo.usuario.repository.LugarRepository;

@RestController
@RequestMapping("/lugar")
@CrossOrigin
public class LugarServicio {

	@Autowired
	LugarRepository lugarRepository;
	
	@GetMapping(path="/buscar")
	public List<Lugar> buscar(){
		return lugarRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Lugar guardar(@RequestBody Lugar lugar) {
		return lugarRepository.save(lugar);
	}
	
	@DeleteMapping(path="/eliminar/{idlugar}")
	public void eliminar(@PathVariable("idlugar") int idlugar){
		lugarRepository.deleteById(idlugar);
		
	}
	
	@GetMapping(path="/buscar/nombre/{nombre}/descripcion/{descripcion}")
	public List<Lugar> buscarPorTextoYImagen(
			@PathVariable String nombre,
			@PathVariable String descripcion){
		return lugarRepository.findByNombreAndDescripcion(nombre,descripcion);
	}
	
	@GetMapping(path="/buscar/nombre/{nombre}")
	public List<Lugar> buscarPorNombre(
			@PathVariable String nombre){
		return lugarRepository.findByNombreLike(nombre);
	}
	@GetMapping(path="/buscarlugar")
	public List<Lugar> buscarlugar(){
		return lugarRepository.findAll();
	}
	
	@PostMapping(path="/guardarlugar")
	public Lugar guardarlugar(@RequestBody Lugar lugar) {
		return lugarRepository.save(lugar);
	}
}
