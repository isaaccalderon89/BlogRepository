package com.company.blogService.repository.comentario;

import com.company.blogService.model.Comentario;
import com.company.blogService.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario,Long> {

        List<Comentario> findByPublicacion(Post post);
}
