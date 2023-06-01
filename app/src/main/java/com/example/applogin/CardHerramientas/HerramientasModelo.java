package com.example.applogin.CardHerramientas;

public class HerramientasModelo {
    public String nombre,precio;
    public int imagenProducto;

    public HerramientasModelo() {
    }

    public HerramientasModelo(String nombre, String precio, int imagenProducto) {
        this.nombre = nombre;
        this.precio = precio;
        this.imagenProducto = imagenProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(int imagenProducto) {
        this.imagenProducto = imagenProducto;
    }
}
