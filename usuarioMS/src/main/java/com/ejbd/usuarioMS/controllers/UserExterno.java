package com.ejbd.usuarioMS.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ejbd.usuarioMS.entities.UsuarioExterno;
import com.ejbd.usuarioMS.repository.IUsuarioExternoDAO;


@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/UsuariosExterno")

public class UserExterno {
	
	@Autowired
	private IUsuarioExternoDAO repository;
	
	@PostMapping("/usuario")
	public UsuarioExterno create(@Validated @RequestBody UsuarioExterno p) {
		return repository.insert(p);
	}
	
	@GetMapping("/")
	public List<UsuarioExterno> readAll() {
		return repository.findAll();
	}

	@PutMapping("/usuario/{id}")
	public UsuarioExterno update(@PathVariable String id, @Validated @RequestBody UsuarioExterno p) {
		return repository.save(p);
	}

	@DeleteMapping("/usuario/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}
	

}
