package com.example.applogin.CardHerramientas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.applogin.R;

import java.util.List;

public class AdaptadorRecyHerramientas extends RecyclerView.Adapter <AdaptadorRecyHerramientas.ViewHolder>{
    public static class ViewHolder extends  RecyclerView.ViewHolder{
        private TextView nombreH,precioH;
        ImageView fotoProductoH;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombreH = (TextView) itemView.findViewById(R.id.tvNombreProductoherramientas);
            precioH= (TextView) itemView.findViewById(R.id.tvPreioProductoherramientas);
            fotoProductoH = (ImageView) itemView.findViewById(R.id.imgproductosHerramietnas);

        }

    }
    public List<HerramientasModelo> listaproductosHerramientas;

    public AdaptadorRecyHerramientas(List<HerramientasModelo> listaproductosHerramientas) {
        this.listaproductosHerramientas = listaproductosHerramientas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemherramientasproductos, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nombreH.setText(listaproductosHerramientas.get(position).getNombre());
        holder.precioH.setText(listaproductosHerramientas.get(position).getPrecio());
        holder.fotoProductoH.setImageResource(listaproductosHerramientas.get(position).getImagenProducto());
    }

    @Override
    public int getItemCount() {
        return listaproductosHerramientas.size();
    }
}
