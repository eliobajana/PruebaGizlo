package com.ejbd.usuarioMS.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ejbd.usuarioMS.entities.UsuarioExterno;

@Repository
public interface IUsuarioExternoDAO extends MongoRepository<UsuarioExterno, String> {

}
