package com.company.blogService.repository.comentario;

import com.company.blogService.model.Comentario;
import com.company.blogService.model.Post;
import com.company.blogService.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IComentarioRepository {

    List<Comentario> findAll();
    List<Comentario> findByPublicacion(Post post);

}
