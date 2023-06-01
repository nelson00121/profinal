package com.example.applogin.CardView;

public class ModeladoProductos {
    public String nombre,precio;
    private int fotoproducto;

    public ModeladoProductos() {
    }

    public ModeladoProductos(String nombre, String precio, int fotoproducto) {
        this.nombre = nombre;
        this.precio = precio;
        this.fotoproducto = fotoproducto;
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

    public int getFotoproducto() {
        return fotoproducto;
    }

    public void setFotoproducto(int fotoproducto) {
        this.fotoproducto = fotoproducto;
    }
}
