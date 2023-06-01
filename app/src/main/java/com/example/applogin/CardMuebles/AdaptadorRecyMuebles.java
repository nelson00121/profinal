package com.example.applogin.CardMuebles;




import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.applogin.CardHerramientas.AdaptadorRecyHerramientas;
import com.example.applogin.CardHerramientas.HerramientasModelo;
import com.example.applogin.R;

import java.util.List;

public class AdaptadorRecyMuebles  extends RecyclerView.Adapter<AdaptadorRecyMuebles.ViewHolder> {
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nombre,precio;
        ImageView imgMuebles;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.tvNombreProductoMueble);
            precio = (TextView) itemView.findViewById(R.id.tvPreioProductoMueble);
            imgMuebles = (ImageView) itemView.findViewById(R.id.imgproductosMuebles);


        }
    }
    public List<MueblesModelo>muebleLista;

    public AdaptadorRecyMuebles(List<MueblesModelo> muebleLista) {
        this.muebleLista = muebleLista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itenmueblesproducto,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nombre.setText(muebleLista.get(position).getNombre());
        holder.precio.setText(muebleLista.get(position).getPrecio());
        holder.imgMuebles.setImageResource(muebleLista.get(position).getImgmueble());
    }

    @Override
    public int getItemCount() {
        return muebleLista.size();
    }
}
