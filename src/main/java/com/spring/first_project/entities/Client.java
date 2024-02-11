package com.spring.first_project.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Client {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    private String nom;

    private String email;

    @Enumerated(EnumType.STRING)
    private Civility sexe;

    @OneToMany(mappedBy = "client")
    private Collection<Compte> comptes;
}
