package com.example.applogin.CardMuebles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.applogin.R;

import java.util.ArrayList;
import java.util.List;

public class MueblesMain extends AppCompatActivity {
    private RecyclerView recyclerViewMueble;
    private AdaptadorRecyMuebles adaptadorRecyclerViewMueble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muebles_main);

        recyclerViewMueble = (RecyclerView) findViewById(R.id.recyproductosMuebles);
        recyclerViewMueble.setLayoutManager(new LinearLayoutManager(this));

        adaptadorRecyclerViewMueble = new AdaptadorRecyMuebles(obtenermueble());
        recyclerViewMueble.setAdapter(adaptadorRecyclerViewMueble);



    }
    public List<MueblesModelo> obtenermueble(){
        List<MueblesModelo> mueble = new ArrayList<>();
        mueble.add(new MueblesModelo("sala","Q1500",R.drawable.cama));
        return  mueble;
    }
}