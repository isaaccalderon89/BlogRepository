package com.company.blogService.repository.post;

import com.company.blogService.model.Post;
import com.company.blogService.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface IPostRepository {

    List<Post> findAll();
    Optional<Post> findByUsuario(Usuario usuario);
    Post create(Post post);
    Post save(Post post);
    void delete(Long id);
    boolean existsById(Long id);
}
