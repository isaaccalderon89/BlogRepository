package com.company.blogService.controller.usuario;

import com.company.blogService.model.Usuario;
import com.company.blogService.repository.usuario.UsuarioRepository;
import com.company.blogService.service.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;
    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping(value = "")
    public ResponseEntity<List<Usuario>> getAll() {
        List<Usuario> usuarios = usuarioService.findAll();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @PostMapping(value = "create")
    public ResponseEntity<Usuario> create(@RequestBody Usuario newUsu) {
        return new ResponseEntity<>(usuarioService.save(newUsu), HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> getOne(@PathVariable Long id) {
        Usuario usuario = usuarioService.findById(id).orElse(null);
        return usuario != null ? new ResponseEntity<>(usuario, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "update/{id}")
    public ResponseEntity<Usuario> update(@PathVariable Long id, @RequestBody Usuario usuario) {
        return usuarioService.findById(id)
                .map(existingUsuario -> {
                    usuario.setId(id);
                    Usuario updatedUsuario = usuarioService.save(usuario);
                    return new ResponseEntity<>(updatedUsuario, HttpStatus.OK);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping(value = "delete/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        usuarioService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
