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


import com.ejemplo.usuario.entity.Examen;

import com.ejemplo.usuario.repository.ExamenRepository;

@RestController
@RequestMapping("/examen")
@CrossOrigin
public class ExamenServicio {


	@Autowired
	ExamenRepository examenRepository;
	
	@GetMapping(path="/buscar")
	public List<Examen> buscar(){
		return examenRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Examen guardar(@RequestBody Examen examen) {
		return examenRepository.save(examen);
	}
	
	@DeleteMapping(path="/eliminar/{idexamen}")
	public void eliminar(@PathVariable("idexamen") int idexamen){
		examenRepository.deleteById(idexamen);
		
	}
	
	@GetMapping(path="/buscar/nota/{nota}/noparcial/{noParcial}")
	public List<Examen> buscarPorNotaYNoParcial(
			@PathVariable int nota,
			@PathVariable int noParcial){
		return examenRepository.findByNotaAndNoParcial(nota,noParcial);
	}
	

	@GetMapping(path="/buscarexamen")
	public List<Examen> buscarexamen(){
		return examenRepository.findAll();
	}
	@PostMapping(path="/guardarexamen")
	public Examen guardarexamen(@RequestBody Examen examen) {
		return examenRepository.save(examen);
	}
	
}
