package com.example.applogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.applogin.ContrololesFrag.ControladorFrag;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class RegistrarUsuarios extends AppCompatActivity implements View.OnClickListener{
    EditText Usuario, Contraseña,Nombre,Apellido,Edad;
    Button Registrar;
    //Cancelar;
    //Base de datos
    daUsuarios dao;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuarios);

        //Llamamos a los EditText
        Usuario = (EditText) findViewById(R.id.editUsuario);
        Contraseña = (EditText) findViewById(R.id.editContraseñaUsuario);
        Nombre = (EditText) findViewById(R.id.editNombreDeUsuario);
        Apellido =(EditText) findViewById(R.id.editApellidoUsuario);
        Edad = (EditText) findViewById(R.id.editEdadUsuario);
        //Inciarmos los botones
        Registrar = (Button) findViewById(R.id.btnRegistrarDatos);
       // Cancelar = (Button) findViewById(R.id.btnCancelar);
        //Base de datos
        dao = new daUsuarios(this);
        //Los click de los botones
        Registrar.setOnClickListener(this);
     //   Cancelar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnRegistrarDatos:
                Usuario u = new Usuario();
               u.setUsuario(Usuario.getText().toString());
               u.setContraseña(Contraseña.getText().toString());
               u.setNombre(Nombre.getText().toString());
               u.setApellido(Apellido.getText().toString());
               u.setEdad(Edad.getText().toString());
               if(!u.isNull()){
                   Toast.makeText(this, "Campos Vacíos", Toast.LENGTH_SHORT).show();
               }
               else if(dao.InsertarUsuario(u)){
                   Toast.makeText(this, "Se Guardó", Toast.LENGTH_SHORT).show();
                   Intent i2 = new Intent(RegistrarUsuarios.this, MainActivity.class);
                   startActivity(i2);
                   finish();
               }
               else{
                   Toast.makeText(this, "Ya está Registrado", Toast.LENGTH_SHORT).show();
               }
                break;
         /*   case R.id.btnCancelar:
                Intent i = new Intent(RegistrarUsuarios.this, MainActivity.class);
                startActivity(i);
                finish();
                break;*/
        }
       // return false;
    }
}