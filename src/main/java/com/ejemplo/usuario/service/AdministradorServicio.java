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

import com.ejemplo.usuario.entity.Administrador;

import com.ejemplo.usuario.repository.AdministradorRepository;


@RestController
@RequestMapping("/administrador")
@CrossOrigin
public class AdministradorServicio {
	
	@Autowired
	AdministradorRepository administradorRepository;
	
	@GetMapping(path="/buscar")
	public List<Administrador> buscar(){
		return administradorRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Administrador guardar(@RequestBody Administrador usuario) {
		return administradorRepository.save(usuario);
	}
	
	@DeleteMapping(path="/eliminar/{usuario}")
	public void eliminar(@PathVariable("usuario") Administrador usuario){
		administradorRepository.delete(usuario);
		
	}
	
	@PostMapping(path="/login")
	public Administrador login(@RequestBody Administrador administrador){
		
		List<Administrador> listaAdministrador =
		administradorRepository.findByUsuarioAndPassword(administrador.getUsuario(),administrador.getPassword());
		
		Administrador administradorRetorno = null;
		
		if(!listaAdministrador.isEmpty()) {
			administradorRetorno = listaAdministrador.get(0);
			
		}
		
		return administradorRetorno;
	}

}
