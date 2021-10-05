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

import com.ejbd.usuarioMS.entities.UsuarioInterno;
import com.ejbd.usuarioMS.repository.IUsuarioInternoDAO;


@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/UsuariosInterno")

public class UserInterno {
	
	@Autowired
	private IUsuarioInternoDAO repository;
	
	@PostMapping("/usuario")
	public UsuarioInterno create(@Validated @RequestBody UsuarioInterno p) {
		return repository.insert(p);
	}
	
	@GetMapping("/")
	public List<UsuarioInterno> readAll() {
		return repository.findAll();
	}

	@PutMapping("/usuario/{id}")
	public UsuarioInterno update(@PathVariable String id, @Validated @RequestBody UsuarioInterno p) {
		return repository.save(p);
	}

	@DeleteMapping("/usuario/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}
	

}
