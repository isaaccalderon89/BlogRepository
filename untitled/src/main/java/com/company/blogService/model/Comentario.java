package com.company.blogService.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "Comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contenido;

    @Column(name = "fecha_comentario")
    private LocalDateTime fechaComentario;

    @ManyToOne //Una publicación puede tener muchos comentarios
    private Post publicacion;
}
