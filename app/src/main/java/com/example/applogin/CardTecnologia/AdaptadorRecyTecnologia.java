package com.example.applogin.CardTecnologia;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.applogin.CardHerramientas.AdaptadorRecyHerramientas;
import com.example.applogin.CardHerramientas.HerramientasModelo;
import com.example.applogin.CardMuebles.MueblesModelo;
import com.example.applogin.R;

import java.util.List;

public class AdaptadorRecyTecnologia extends RecyclerView.Adapter<AdaptadorRecyTecnologia.ViewHolder> {


    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nombreT;
        private TextView precioT;
        ImageView imgtecnologia;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombreT = (TextView) itemView.findViewById(R.id.tvNombreProductotecnologia);
            precioT = (TextView)itemView.findViewById(R.id.tvPreioProductotecnologia);
            imgtecnologia = (ImageView) itemView.findViewById(R.id.imgproductosTecnologia);
        }
    }
    public List<TecnologiaModelo> listaproductosTecnologia;

    public AdaptadorRecyTecnologia(List<TecnologiaModelo> listaproductosTecnologia) {
        this.listaproductosTecnologia = listaproductosTecnologia;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itentecnologiaproductos, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nombreT.setText(listaproductosTecnologia.get(position).getNombre());
        holder.precioT.setText(listaproductosTecnologia.get(position).getPrecio());
        holder.imgtecnologia.setImageResource(listaproductosTecnologia.get(position).getImagentecnologia());
    }

    @Override
    public int getItemCount() {
        return listaproductosTecnologia.size();
    }
}
