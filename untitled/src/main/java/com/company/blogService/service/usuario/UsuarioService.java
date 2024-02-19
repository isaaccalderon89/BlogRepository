package com.company.blogService.service.usuario;

import com.company.blogService.model.Usuario;
import com.company.blogService.repository.usuario.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> findById(Long id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("ID de usuario no válido");
        }
        return usuarioRepository.findById(id);
    }

    public Usuario findByNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre de usuario no válido");
        }
        return usuarioRepository.findByNombre(nombre);
    }

    public Usuario save(Usuario usuario) {
        if (usuario == null) {
            throw new IllegalArgumentException("Usuario no puede ser nulo");
        }
        return usuarioRepository.save(usuario);
    }

    public void delete(Long id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("ID de usuario no válido");
        }
        if (!usuarioRepository.existsById(id)) {
            throw new EntityNotFoundException("No se encontró un usuario con el ID proporcionado: " + id);
        }
        usuarioRepository.delete(id);
    }
}

