package com.spring.first_project.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompte;

    private String login;
    private String password;
    private Date dateCreation;


    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name="idclient")
    private Client client;
}
