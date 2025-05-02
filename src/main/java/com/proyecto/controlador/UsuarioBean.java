package com.proyecto.controlador;

import com.proyecto.modelo.Usuario;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class UsuarioBean implements Serializable {
    private Usuario usuario = new Usuario();
    private List<Usuario> usuarios = new ArrayList<>();

    public String agregarUsuario() {
        usuarios.add(usuario);
        usuario = new Usuario();
        return "usuarios.xhtml?faces-redirect=true";
    }

    public void eliminarUsuario(Usuario u) {
        usuarios.remove(u);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
