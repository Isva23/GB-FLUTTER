package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false)
    
    private Long id;
    private String nombre;
    private String email;
    private Boolean IsAdmin;
    private Boolean IsPremium;
    
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

