package com.example.applogin.CardMuebles;

public class MueblesModelo {
    private String nombre,precio;
    private int imgmueble;

    public MueblesModelo() {
    }

    public MueblesModelo(String nombre, String precio, int imgmueble) {
        this.nombre = nombre;
        this.precio = precio;
        this.imgmueble = imgmueble;
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

    public int getImgmueble() {
        return imgmueble;
    }

    public void setImgmueble(int imgmueble) {
        this.imgmueble = imgmueble;
    }
}
