package com.tenantix.api.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Empleados")
public class Empleados {
    @Id
    @GeneratedValue
    private long id;
    private String nombre;
    private String email;
    private String password;
    private boolean rol;

    public Empleados() {
    }

    public Empleados(long id, String nombre, String email, String password, boolean rol) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.rol = rol;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public boolean isRol() {
        return rol;
    }

    public void setRol(boolean rol) {
        this.rol = rol;
    }
}
