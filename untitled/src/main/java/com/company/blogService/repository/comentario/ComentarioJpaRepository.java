package com.company.blogService.repository.comentario;

import com.company.blogService.model.Comentario;
import com.company.blogService.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ComentarioJpaRepository implements IComentarioRepository {

    @Autowired
    ComentarioRepository comentarioRepo;

    @Override
    public List<Comentario> findAll() {
        return comentarioRepo.findAll();
    }

    @Override
    public List<Comentario> findByPublicacion(Post post) {
        return comentarioRepo.findByPublicacion(post);
    }
}
