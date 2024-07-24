package com.example.demo.models;

public class UsuarioModelDTO {

    private Long id;
    private String nombre;
    private String email;
    private Boolean isAdmin;
    private Boolean isPremium;

    // Constructor, getters y setters

    public UsuarioModelDTO() {
    }

    public UsuarioModelDTO(Long id, String nombre, String email, Boolean isAdmin, Boolean isPremium) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.isAdmin = isAdmin;
        this.isPremium = isPremium;
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

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Boolean getIsPremium() {
        return isPremium;
    }

    public void setIsPremium(Boolean isPremium) {
        this.isPremium = isPremium;
    }
}
