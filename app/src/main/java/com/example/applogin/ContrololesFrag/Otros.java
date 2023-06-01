package com.example.applogin.ContrololesFrag;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

import com.example.applogin.ActualizarInforUsuario;
import com.example.applogin.CardView.productosmain;
import com.example.applogin.MainActivity;
import com.example.applogin.R;


public class Otros extends Fragment {

   // Activity spid;
   Activity salida;
    Activity ActualizarInfo;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //spid = getActivity();
        // Inflate the layout for this fragment

        salida = getActivity();
        ActualizarInfo = getActivity();
       // salir = (Button) salir.findViewById(R.id.btnSalirUsuario);

        return inflater.inflate(R.layout.fragment_otros, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Button salir = (Button) salida.findViewById(R.id.btnSalirUsuario);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(salida, MainActivity.class);
                startActivity(intent);
            }
        });
        Button actua = (Button) ActualizarInfo.findViewById(R.id.btnActualizaDatosUsuaro);
        actua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActualizarInfo, ActualizarInforUsuario.class);
                startActivity(i);

            }
        });
    }
}