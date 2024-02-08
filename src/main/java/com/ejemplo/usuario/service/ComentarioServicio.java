package com.ejemplo.usuario.service;


import java.util.Date;
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

import com.ejemplo.usuario.entity.Comentario;

import com.ejemplo.usuario.repository.ComentarioRepository;


@RestController
@RequestMapping("/comentario")
@CrossOrigin
public class ComentarioServicio {

	@Autowired
	ComentarioRepository comentarioRepository;
	
	@GetMapping(path="/buscar")
	public List<Comentario> buscar(){
		return comentarioRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Comentario guardar(@RequestBody Comentario comentario) {
		return comentarioRepository.save(comentario);
	}
	
	@DeleteMapping(path="/eliminar/{idcomentario}")
	public void eliminar(@PathVariable("idcomentario") int idcomentario){
		comentarioRepository.deleteById(idcomentario);
		
	}
	@GetMapping(path="/buscar/fecha/{fecha}")
	public List<Comentario> buscarPorFecha(
			@PathVariable Date fecha){
		return comentarioRepository.findByFechaAfter(fecha);
	}
	
}
