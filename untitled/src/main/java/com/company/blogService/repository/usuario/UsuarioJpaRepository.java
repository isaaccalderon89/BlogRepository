package com.company.blogService.repository.usuario;

import com.company.blogService.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class UsuarioJpaRepository implements IUsuarioRepository{

    @Autowired
    UsuarioRepository usuarioRepo;

    @Override
    public List<Usuario> findAll() {
         return usuarioRepo.findAll();
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return usuarioRepo.findById(id);
    }

    @Override
    public Usuario findByNombre(String nombre) {
        return usuarioRepo.findByNombre(nombre);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }

    @Override
    public void delete(Long id) {
        usuarioRepo.deleteById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return usuarioRepo.existsById(id);
    }
}
