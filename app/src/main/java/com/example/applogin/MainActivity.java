package com.example.applogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.applogin.ContrololesFrag.ControladorFrag;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button iniciar, registrar, RecuContra;
    EditText usuario, contraseña;

    //Base de Datos
    daUsuarios dao;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Controles Para el login
        usuario = (EditText) findViewById(R.id.editUsuarioSesion);
        contraseña = (EditText) findViewById(R.id.editContraseñaSesion);
        //Los botones
        iniciar = (Button) findViewById(R.id.btnInciarSesion);
        registrar = (Button) findViewById(R.id.btnRegistrarUsuario);
        //validar = (Button) findViewById(R.id.btncomprubausuairo);
        //Recuperar contraseña
        RecuContra = (Button) findViewById(R.id.btnContraseñaRecuUsuario);
        //Objeto de la base de datos
        dao = new daUsuarios(this);

        iniciar.setOnClickListener(this);
        registrar.setOnClickListener(this);
        RecuContra.setOnClickListener(this);
    }
    //Sección para el login
    @Override


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnInciarSesion:
                String u = usuario.getText().toString();
                String p = contraseña.getText().toString();
                if (u.equals("") && p.equals("")) {
                    Toast.makeText(this, "Están vacíos", Toast.LENGTH_SHORT).show();
                } else if (dao.Login(u,p) == 1) {
                    Usuario ax = dao.getUsuario(u,p);
                    Intent i3 = new Intent(MainActivity.this,Inicio.class);
                    i3.putExtra("Id", ax.getId());
                    i3.putExtra("Id", ax.getId());
                    startActivity(i3);
                }
                else{
                    Toast.makeText(this, "Usuario O Contraseña Incorrectos", Toast.LENGTH_SHORT).show();
                    Vibrator vibrator =(Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                    vibrator.vibrate(25);
                }
                break;
               //Inicio para recuperar la contraseña del usuario
            case R.id.btnContraseñaRecuUsuario:

                Intent in = new Intent(MainActivity.this, RecuContra.class);
                startActivity(in);
                break;
            //Para poder ir a la pantalla de Registro
            case R.id.btnRegistrarUsuario:
                Intent i = new Intent(MainActivity.this, RegistrarUsuarios.class);
                startActivity(i);
                break;
        }


       // return false;
    }
}