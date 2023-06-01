package com.example.applogin;

import static com.google.android.material.tabs.TabLayout.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.applogin.ContrololesFrag.ControladorFrag;
import com.example.applogin.ContrololesFrag.Otros;
import com.example.applogin.ContrololesFrag.Productos;
import com.example.applogin.intrface.comunifrag;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Inicio extends AppCompatActivity implements comunifrag  {


    //Incializamos los objetos
    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem tab1, tab2, tab3;
    Button envio;

    ControladorFrag Adaptador;


    //pantalla productos
   // CardView cocina,herramientas,tecnologia,muebles;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        mostrar();
       // spi();

        //envioMensaje();
    }

    public void mostrar() {
        // nombre = (TextView) findViewById(R.id.nombrePersonaRegistrada) ;
        tabLayout = findViewById(R.id.tablaLayout);
        viewPager = findViewById(R.id.vistapegar);

        tab1 = findViewById(R.id.Bienvenido);
        tab2 = findViewById(R.id.Producto);
        tab3 = findViewById(R.id.Otros);


        Adaptador = new ControladorFrag(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(Adaptador);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                if (tab.getPosition() == 0) {
                    Adaptador.notifyDataSetChanged();
                }

                if (tab.getPosition() == 1) {
                    Adaptador.notifyDataSetChanged();
                }

                if (tab.getPosition() == 2) {
                    Adaptador.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }

  /*  @Override
   public void iniciarpantalla() {
        Toast.makeText(this, "Pantalla Otra", Toast.LENGTH_SHORT).show();

    }*/

  /*  public void card(){
        cocina =(CardView) findViewById(R.id.cardCocina);
        herramientas = (CardView) findViewById(R.id.cardHerramientas);
        tecnologia = (CardView) findViewById(R.id.cardTecnología);
        muebles = (CardView) findViewById(R.id.cardmuelebria);

        cocina.setOnClickListener((View.OnClickListener)this);
        herramientas.setOnClickListener((View.OnClickListener)this);
        tecnologia.setOnClickListener((View.OnClickListener)this);
        muebles.setOnClickListener((View.OnClickListener)this);
    }
    @Override
    public void onClick(View v){
        Intent i ;
        switch (v.getId()){
            case R.id.cardCocina: i = new Intent(this, productosmain.class); startActivity(i); break;
        }
    }*/

    @Override
    public void iniciarpantalla() {

    }
   /* public void envioMensaje(){
        envio = (Button) findViewById(R.id.btnEnvioMensaje);

        envio.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://wa.me/50233302359");
                Intent i6 = new Intent(Intent.ACTION_SEND, uri);
                startActivity(i6);

            }
        });
    }*/

 /*   public void spi(){
        Spinner spinner = findViewById(R.id.spineruno);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.datos, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }*/
}