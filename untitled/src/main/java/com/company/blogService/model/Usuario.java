package com.company.blogService.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Usuario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String email;


    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL) // Un usuario puede realizar muchas publicaciones
    private List<Post> publicaciones;
}
