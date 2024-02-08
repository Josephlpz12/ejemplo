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


import com.ejemplo.usuario.entity.Usuario;
import com.ejemplo.usuario.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class UsuarioServicio {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping(path="/buscar")
	public List<Usuario> buscar(){
		return usuarioRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Usuario guardar(@RequestBody Usuario correo) {
		return usuarioRepository.save(correo);
	}
	
	@DeleteMapping(path="/eliminar/{correo}")
	public void eliminar(@PathVariable("correo") Usuario correo){
		usuarioRepository.delete(correo);
		
	}
	
	@GetMapping(path="/buscar/nombre/{nombre}/apellido/{apellido}")
	public List<Usuario> buscarPorNombreYApellido(
			@PathVariable String nombre,
			@PathVariable String apellido){
		return usuarioRepository.findByNombreAndApellido(nombre,apellido);
	}
	
	@PostMapping(path="/login")
	public Usuario login(@RequestBody Usuario usuario){
		
		List<Usuario> listaUsuarios =
		usuarioRepository.findByCorreoAndPassword(usuario.getCorreo(),usuario.getPassword());
		
		Usuario usuarioRetorno = null;
		
		if(!listaUsuarios.isEmpty()) {
			usuarioRetorno = listaUsuarios.get(0);
			
		}
		
		return usuarioRetorno;
	}
	
	
}
