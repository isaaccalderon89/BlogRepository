package com.company.blogService.repository.usuario;

import com.company.blogService.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioRepository {

    List<Usuario> findAll();
    Optional<Usuario> findById(Long id);
    Usuario findByNombre(String nombre);
    Usuario save(Usuario usuario);
    void delete (Long id);
    boolean existsById(Long id);

}
