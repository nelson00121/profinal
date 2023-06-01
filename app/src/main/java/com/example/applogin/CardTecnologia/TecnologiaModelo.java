package com.example.applogin.CardTecnologia;

public class TecnologiaModelo {
    public String nombre,precio;
    private int imagentecnologia;

    public TecnologiaModelo() {
    }

    public TecnologiaModelo( String nombre,String precio, int imagentecnologia) {

        this.nombre = nombre;
        this.precio = precio;
        this.imagentecnologia = imagentecnologia;
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


    public int getImagentecnologia() {
        return imagentecnologia;
    }

    public void setImagentecnologia(int imagentecnologia) {
        this.imagentecnologia = imagentecnologia;
    }
}
