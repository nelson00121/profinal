package com.example.applogin;

import kotlin.contracts.Returns;

public class Usuario {
    int id;
    String Usuario,Contraseña,Nombre,Apellido,Edad;
    //Contructor

    public Usuario() {
    }
    //Metodo toString

    //Validad Campos
    public boolean isNull(){
        if(Usuario.equals("") && Contraseña.equals("") && Nombre.equals("") && Apellido.equals("") && Edad.equals("")){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", Usuario='" + Usuario + '\'' +
                ", Contraseña='" + Contraseña + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Edad='" + Edad + '\'' +
                '}';
    }


    //Gett and sett

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String edad) {
        Edad = edad;
    }
}
