package com.company.blogService.repository.post;

import com.company.blogService.model.Post;
import com.company.blogService.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class PostJpaRepository implements IPostRepository {

    @Autowired
    PostRepository postRepo;
    @Override
    public List<Post> findAll() {
        return findAll();
    }

    @Override
    public Optional<Post> findByUsuario(Usuario usuario) {
        return postRepo.findByUsuario(usuario);
    }

    @Override
    public Post create(Post post) {
        return postRepo.save(post);
    }

    @Override
    public Post save(Post post) {
        return postRepo.save(post);
    }

    @Override
    public void delete(Long id) {
        postRepo.deleteById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return postRepo.existsById(id);
    }
}
