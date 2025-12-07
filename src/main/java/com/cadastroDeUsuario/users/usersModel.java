package com.cadastroDeUsuario.users;

import jakarta.persistence.*;

@Entity
public class usersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;
}
