package com.example.applogin.CardView;

import static com.example.applogin.R.layout.itencocinaproductos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.applogin.R;

import java.util.List;

public class AdaptadorRecyclerView extends RecyclerView.Adapter<AdaptadorRecyclerView.ViewHolder> {

    public static class ViewHolder extends  RecyclerView.ViewHolder{
        private TextView nombre,precio;
        ImageView fotoProducto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.tvNombreProducto);
            precio = (TextView) itemView.findViewById(R.id.tvPreioProducto);
            fotoProducto = (ImageView) itemView.findViewById(R.id.imgcocina);
        }
    }
    public List<ModeladoProductos> productoslista;
    public AdaptadorRecyclerView(List<ModeladoProductos>productoslista) {
        this.productoslista = productoslista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itencocinaproductos,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nombre.setText(productoslista.get(position).getNombre());
        holder.precio.setText(productoslista.get(position).getPrecio());
        holder.fotoProducto.setImageResource(productoslista.get(position).getFotoproducto());
    }
    @Override
    public int getItemCount() { return productoslista.size();}
}
