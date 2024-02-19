package com.company.blogService.controller.usuario;

import com.company.blogService.model.Usuario;
import com.company.blogService.repository.usuario.UsuarioRepository;
import com.company.blogService.service.usuario.UsuarioService;
import org.slf4j.LoggerFactory;
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
    public ResponseEntity<List<Usuario>> getAll(){
        List<Usuario> usuarios = usuarioService.findAll();
        return ResponseEntity.ok(usuarios);
    }

    @PostMapping(value = "")
    public Usuario create(@RequestBody Usuario newUsu){
        return usuarioService.save(newUsu);
    }


    @GetMapping(value = "/{id}")
    public Usuario getOne(@PathVariable Long id){
        return usuarioService.findById(id).get();
    }

    @PutMapping(value = "/{id}")
    public Usuario update(@PathVariable Long id, @RequestBody Usuario usuario){
        usuario.setId(id);
        return usuarioService.save(usuario);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
         usuarioService.delete(id);
    }




}
