package com.example.poo.Models;

import jakarta.persistence.*;
import jdk.jfr.Name;

@Entity
@Table(name = "TBL_Usuarios")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String NomeUsuario;
    private String Email;

    public Long getId() {
        return this.Id;
    }

    public String getEmail() {
        return this.Email;
    }

    public String getNomeUsuario() {
        return this.NomeUsuario;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setNomeUsuario(String nomeUsuario) {
        NomeUsuario = nomeUsuario;
    }
}
