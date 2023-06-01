package com.example.applogin.ContrololesFrag;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ControladorFrag extends FragmentPagerAdapter {

//Varaible para contador de items
    int numerostabiten;

    public ControladorFrag(@NonNull FragmentManager fm, int behavior ) {
        super(fm, behavior);
        this.numerostabiten = behavior;
    }

    //Metodos para el control
    @NonNull
    @Override
    public Fragment getItem(int position) {
        //Aquí se dan todas las Iteraciones de Cada Item
        switch (position){
            case 0:
                return new Bienvenido();
            case 1:
                return new Productos();
            case 2:
                return new Otros();
            case 3:
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return numerostabiten;
    }
}
