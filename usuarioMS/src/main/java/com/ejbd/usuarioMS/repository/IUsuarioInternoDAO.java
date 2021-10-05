package com.ejbd.usuarioMS.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ejbd.usuarioMS.entities.UsuarioInterno;

@Repository
public interface IUsuarioInternoDAO extends MongoRepository<UsuarioInterno, String> {

}
