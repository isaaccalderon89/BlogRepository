package com.company.blogService.service.comentario;

import com.company.blogService.model.Comentario;
import com.company.blogService.model.Post;
import com.company.blogService.repository.comentario.IComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioService {
    @Autowired
    private IComentarioRepository iComentarioRepository;

    public List<Comentario> findAllComentarios() {
        return iComentarioRepository.findAll();
    }

    public List<Comentario> findComentariosByPost(Post post) {
        return iComentarioRepository.findByPublicacion(post);
    }

}
