package com.company.blogService.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "Publicacion")
public class Post {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String contenido;
    @Column(name = "fecha_publicacion")
    private LocalDateTime fechaPublicacion;

    @ManyToOne // Un usuario puede realizar muchas publicaciones
    private Usuario usuario;

    @OneToMany(mappedBy = "publicacion")// Una publicación puede tener muchos comentarios
    private List<Comentario> comentarios;
}
