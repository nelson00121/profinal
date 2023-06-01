package com.example.applogin.ContrololesFrag;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.applogin.CardHerramientas.Herramientasmain;
import com.example.applogin.CardMuebles.MueblesMain;
import com.example.applogin.R;
import com.example.applogin.CardTecnologia.Tecnologiamain;
import com.example.applogin.CardView.productosmain;



public class Productos extends Fragment {

   Activity contCocina;
   Activity contProductos;
   Activity contTecnologia;
   Activity contMuebles;
   Activity Recy;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Boton
        contCocina = getActivity();
        contProductos = getActivity();
        contTecnologia = getActivity();
        contMuebles = getActivity();

        return inflater.inflate(R.layout.fragment_productos, container, false);

    }
    //Boton
    public void onStart(){
        super.onStart();
        //Para entrar al activity cocina

       Button btn = (Button) contCocina.findViewById(R.id.btncambioCocina);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(contCocina, productosmain.class);
                startActivity(intent);
            }
        });
        //Cambiar Herramientas activity
        Button btnHerramientas = (Button) contProductos.findViewById(R.id.btncambioHerramientas);
        btnHerramientas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(contProductos, Herramientasmain.class);
                startActivity(i2);
            }
        });
        //Cabiar a tecnología activity
         Button tecnologia = (Button) contTecnologia.findViewById(R.id.btnCambiarTecnologia);
         tecnologia.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i3 = new Intent(contTecnologia, Tecnologiamain.class);
                 startActivity(i3);
             }
         });
         //Iniciamos para los muebles
        Button muebles = (Button) contMuebles.findViewById(R.id.btncambiarmueble);
        muebles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(contMuebles, MueblesMain.class);
                startActivity(i4);
            }
        });
    }
}

