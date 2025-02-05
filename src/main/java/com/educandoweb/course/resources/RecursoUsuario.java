package com.educandoweb.course.resources;

import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entitys.Usuario;

@RestController
@RequestMapping(value = "/users")
public class RecursoUsuario {

	@GetMapping
	public ResponseEntity<Usuario> procurarUsuario(){
		Usuario usuario = new Usuario(1L, "Iury" , "iury211@gmail.com" , "99999999" , "12345");
		return ResponseEntity.ok().body(usuario);
	}
	
}
