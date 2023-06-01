package com.example.applogin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class daUsuarios {
    Context c;
    Usuario u;
    ArrayList<Usuario> Lista;
    SQLiteDatabase sql;
    String db = "DBUsuario";
    //Tabla de la base de datos para los Usuarios
    String tabla = "CREATE TABLE IF NOT EXISTS DatosUsuario(id integer primary key, usuario text,contraseña text,nombre text,apellido text, edad text)";

    //Contructor
    public daUsuarios(Context c) {
        this.c = c;
        sql = c.openOrCreateDatabase(db, c.MODE_PRIVATE, null);
        sql.execSQL(tabla);
        u = new Usuario();
    }
    public boolean InsertarUsuario(Usuario u) {
        if (buscar(u.getUsuario()) == 0) {
            ContentValues cv = new ContentValues();
            //Para Poder Registrarlos
            cv.put("Usuario", u.getUsuario());
            cv.put("Contraseña", u.getContraseña());
            cv.put("Nombre", u.getNombre());
            cv.put("Apellido", u.getApellido());
            cv.put("Edad", u.getEdad());
            return (sql.insert("DatosUsuario", null, cv) > 0);
        } else {
            return false;
        }
    }
    public int buscar(String u) {
        int x = 0;
        Lista =selectUsuario();
        for (Usuario us:Lista){
            if(us.getUsuario().equals(u)){
                x++;
            }
        }
        return x;
    }
    public ArrayList<Usuario> selectUsuario() {
        ArrayList<Usuario> Lista = new ArrayList<Usuario>();
        Lista.clear();
        Cursor cr = sql.rawQuery("SELECT * FROM DatosUsuario ", null);
        if (cr != null && cr.moveToFirst()) {
            do {
                Usuario u = new Usuario();
                u.setId(cr.getInt(0));
                u.setUsuario(cr.getString(1));
                u.setContraseña(cr.getString(2));
                u.setNombre(cr.getString(3));
                u.setApellido(cr.getString(4));
                u.setEdad(cr.getString(5));
                Lista.add(u);
            } while (cr.moveToNext());
        }
        return Lista;
    }

    //Login de usuario
    public int Login(String u, String p){

        int a = 0;
        Cursor cr = sql.rawQuery("SELECT * FROM DatosUsuario ", null);
        if (cr != null && cr.moveToFirst()) {
            do {
              if(cr.getString(1).equals(u) && cr.getString(2).equals(p)){
                  a++;
              }
            } while (cr.moveToNext());
        }

        return a;
    }
    //Por Usuario

    //Select usuario
   /* public int Cambio(String c){

        int b = 0;
        Cursor ae = sql.rawQuery("SELECT * FROM DatosUsuario ", null);
        if (ae != null && ae.moveToFirst()) {
            do {
                if(ae.getString(1).equals(c) ){
                    b++;
                }
            } while (ae.moveToNext());
        }

        return b;
    }*/
    //Fin selec usuario
    public Usuario getUsuario(String u, String p){
        Lista= selectUsuario();
        for(Usuario us:Lista){
            if(us.getUsuario().equals(u) && us.getContraseña().equals(p)){
                return us;
            }
        }
        return null;
    }
    //Por id
    public Usuario getUsuario(int id) {
        Lista = selectUsuario();
        for (Usuario us : Lista) {
            if (us.getId() == id) {
                return us;
            }
        }
        return null;
    }
}
