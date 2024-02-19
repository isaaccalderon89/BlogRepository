package com.company.blogService.service.post;

import com.company.blogService.model.Post;
import com.company.blogService.model.Usuario;
import com.company.blogService.repository.post.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private IPostRepository iPostRepository;

    public List<Post> getAllPosts() {
        return iPostRepository.findAll();
    }

    public Optional<Post> getPostByUsuario(Usuario usuario) {
        return iPostRepository.findByUsuario(usuario);
    }

    public Post createPost(Post post) {
        if (post.getContenido() == null || post.getContenido().trim().isEmpty()) {
            throw new IllegalArgumentException("El contenido del post no puede estar vacío");
        }
        return iPostRepository.create(post);
    }

    public Post updatePost(Post post) {
        Long postId = post.getId();
        if (postId == null || !iPostRepository.existsById(postId)) {
        throw new IllegalArgumentException("El post que intentas actualizar no existe");
         }
        if (post.getContenido() == null || post.getContenido().trim().isEmpty()) {
        throw new IllegalArgumentException("El contenido del post no puede estar vacío");
        }

        return iPostRepository.save(post);
    }

    public void deletePost(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("El ID no puede ser nulo");
        }

        if (!iPostRepository.existsById(id)) {
            throw new EntityNotFoundException("No se encontró un post con el ID proporcionado: " + id);
         }

        iPostRepository.delete(id);
    }


}
