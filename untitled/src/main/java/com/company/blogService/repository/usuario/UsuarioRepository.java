package com.company.blogService.repository.usuario;

import com.company.blogService.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    //No hace falta Query por la convención de nombres
    Usuario findByNombre(String nombre);
    boolean existsById(Long id);
}
