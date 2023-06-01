package com.example.applogin.CardHerramientas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.applogin.CardView.AdaptadorRecyclerView;
import com.example.applogin.CardView.ModeladoProductos;
import com.example.applogin.DetallesProductos;
import com.example.applogin.Inicio;
import com.example.applogin.R;

import java.util.ArrayList;
import java.util.List;

public class Herramientasmain extends AppCompatActivity {
    private RecyclerView recyclerViewHerramientas;

    private AdaptadorRecyHerramientas adaptadorRecyclerViewHerramientas;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herramientasmain);


        recyclerViewHerramientas = (RecyclerView) findViewById(R.id.recyproductosherramientas);
        recyclerViewHerramientas.setLayoutManager(new LinearLayoutManager(this));

        adaptadorRecyclerViewHerramientas = new AdaptadorRecyHerramientas(obtenerHerramientas());
        recyclerViewHerramientas.setAdapter(adaptadorRecyclerViewHerramientas);
    }
    public List<HerramientasModelo> obtenerHerramientas(){
        List<HerramientasModelo> herramienta = new ArrayList<>();
        herramienta.add(new HerramientasModelo("Martillo","Q40",R.drawable.martillo));
        herramienta.add(new HerramientasModelo("Mazo","Q85.40",R.drawable.mazohule));
        herramienta.add(new HerramientasModelo("Serrucho","Q50.00",R.drawable.serrucho));
        //herramienta.add(new HerramientasModelo("Serruco para tablayeso","Q26.99",R.drawable.rotomartillo));
        herramienta.add(new HerramientasModelo("Machete","Q79.99",R.drawable.machete));
        //herramienta.add(new HerramientasModelo("Taladro","22.00",R.drawable.taladro));
        herramienta.add(new HerramientasModelo("Juego Destonillador","Q194.00",R.drawable.juegodestonilladores));
        return herramienta;
    }
}