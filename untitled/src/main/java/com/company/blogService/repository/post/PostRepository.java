package com.company.blogService.repository.post;

import com.company.blogService.model.Post;
import com.company.blogService.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Optional<Post> findByUsuario(Usuario usuario);
    boolean existsById(Long id);
}
