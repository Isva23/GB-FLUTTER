package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false)
    private Long id;

    @Column(length = 50, nullable = false)
    private String nombre;
    
    @Column(length = 50, nullable = false)
    private String email;
    
    @Column(length = 255, nullable = false)
    private String password;
    
    private Boolean IsAdmin;
    private Boolean IsPremium;

    public UsuarioModel(){}
    public UsuarioModel(Long id, String nombre, String email, String password, Boolean isAdmin, Boolean isPremium) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        IsAdmin = isAdmin;
        IsPremium = isPremium;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Boolean getIsAdmin() {
        return IsAdmin;
    }
    public void setIsAdmin(Boolean isAdmin) {
        IsAdmin = isAdmin;
    }
    public Boolean getIsPremium() {
        return IsPremium;
    }
    public void setIsPremium(Boolean isPremium) {
        IsPremium = isPremium;
    }

}

