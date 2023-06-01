package com.example.applogin.CardTecnologia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.applogin.R;

import java.util.ArrayList;
import java.util.List;

public class Tecnologiamain extends AppCompatActivity {
    private RecyclerView recyclerViewTecnologia;
    private AdaptadorRecyTecnologia adaptadorRecyclerViewTecnologia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tecnologia);

        recyclerViewTecnologia = (RecyclerView) findViewById(R.id.recyproductosTecnologia);
        recyclerViewTecnologia.setLayoutManager(new LinearLayoutManager(this));

        adaptadorRecyclerViewTecnologia = new AdaptadorRecyTecnologia(obtenerTecnologia());
        recyclerViewTecnologia.setAdapter(adaptadorRecyclerViewTecnologia);
    }
    public List<TecnologiaModelo> obtenerTecnologia(){
        List<TecnologiaModelo> Tecnologia = new ArrayList<>();
        Tecnologia.add(new TecnologiaModelo("Televisor ","Q3,500",R.drawable.televisor));
        Tecnologia.add(new TecnologiaModelo("Televisor ","Q2,300",R.drawable.televisordos));
        Tecnologia.add(new TecnologiaModelo("Router Xiaomi ","Q750",R.drawable.router));
      //  Tecnologia.add(new TecnologiaModelo("monitor ","Q2,500",R.drawable.monitor));
        Tecnologia.add(new TecnologiaModelo("ipad Mini ","Q3,000",R.drawable.ipad));
        Tecnologia.add(new TecnologiaModelo("Computadora Dell ","Q7,500",R.drawable.computadora));
        Tecnologia.add(new TecnologiaModelo("Bombilla Wifi ","Q150",R.drawable.bombolla));
        //Tecnologia.add(new TecnologiaModelo("Audifonos Inalámbricos ","Q350",R.drawable.audifonosinala));
        Tecnologia.add(new TecnologiaModelo("Audifonos Inalámbricos ","Q750",R.drawable.audifonosinalambricos));
        return Tecnologia;

    }
}