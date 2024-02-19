package com.company.blogService.controller.usuario;

import com.company.blogService.model.Usuario;
import com.company.blogService.repository.usuario.UsuarioRepository;
import com.company.blogService.service.usuario.UsuarioService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;
    @Autowired
    UsuarioRepository usuarioRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Usuario> getAll(){
        return usuarioService.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Usuario create(@RequestBody Usuario newUsu){
        return usuarioService.save(newUsu);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Usuario getOne(@PathVariable Long id){
        return usuarioService.findById(id).get();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Usuario update(@PathVariable Long id, @RequestBody Usuario usuario){
        usuario.setId(id);
        return usuarioService.save(usuario);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
         usuarioService.delete(id);
    }




}
