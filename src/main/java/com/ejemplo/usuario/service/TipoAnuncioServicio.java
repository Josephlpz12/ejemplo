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

import com.ejemplo.usuario.entity.TipoAnuncio;
import com.ejemplo.usuario.repository.TipoAnuncioRepository;

@RestController
@RequestMapping("/tipoanuncio")
@CrossOrigin
public class TipoAnuncioServicio {

	

	@Autowired
	TipoAnuncioRepository tipoanuncioRepository;
	
	@GetMapping(path="/buscar")
	public List<TipoAnuncio> buscar(){
		return tipoanuncioRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public TipoAnuncio guardar(@RequestBody TipoAnuncio tipoanuncio) {
		return tipoanuncioRepository.save(tipoanuncio);
	}
	
	@DeleteMapping(path="/eliminar/{idtipoanuncio}")
	public void eliminar(@PathVariable("idtipoanuncio") int idtipoanuncio){
		tipoanuncioRepository.deleteById(idtipoanuncio);
		
	}
	
}
