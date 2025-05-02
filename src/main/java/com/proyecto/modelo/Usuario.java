package com.proyecto.modelo;

public class Usuario {
    private String nombreCompleto;
    private String correoElectronico;

    public Usuario() {}

    public Usuario(String nombreCompleto, String correoElectronico) {
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
