package com.example.applogin.CardView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.applogin.R;

import java.util.ArrayList;
import java.util.List;

public class productosmain extends AppCompatActivity {

    private RecyclerView recyclerViewProductos;
    private AdaptadorRecyclerView adaptadorRecyclerView;


    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productosmain);

        recyclerViewProductos = (RecyclerView) findViewById(R.id.recyclerCocina);
        recyclerViewProductos.setLayoutManager(new LinearLayoutManager(this));


        adaptadorRecyclerView = new AdaptadorRecyclerView(obtenerProductos());
        recyclerViewProductos.setAdapter(adaptadorRecyclerView);
    }
    public List<ModeladoProductos> obtenerProductos() {
        List<ModeladoProductos> productos = new ArrayList<>();
        productos.add(new ModeladoProductos("Pocillo Cafés", "Q300", R.drawable.pocillocafez));
        productos.add(new ModeladoProductos("Licuadoras", "Q230", R.drawable.licuadora));
        productos.add(new ModeladoProductos("Licuador", "Q300", R.drawable.licuadoratres));
        productos.add(new ModeladoProductos("Mantequille", "Q300", R.drawable.mantequilleraverde));
        productos.add(new ModeladoProductos("Vajillas", "Q300", R.drawable.vajillasmulticoloruno));
        productos.add(new ModeladoProductos("Vajillas multicolor", "Q300", R.drawable.vajllasmulticolor));
        productos.add(new ModeladoProductos("Cafeteraad", "Q300", R.drawable.cafeterauno));
        productos.add(new ModeladoProductos("Cafetera", "Q300", R.drawable.cafeterados));
        productos.add(new ModeladoProductos(" vasos", "Q300", R.drawable.vasosset));

        return productos;
    }
}
