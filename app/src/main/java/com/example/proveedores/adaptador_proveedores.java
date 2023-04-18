package com.example.proveedores;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//import com.bumptech.glide.Glide;
//import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

/*public class adaptador_proveedores extends RecyclerView.Adapter<adaptador_proveedores.ViewHolder> {
    ArrayList<Proveedor> listaproveedores;
    Activity activity;

    public adaptador_proveedores(ArrayList<Proveedor> proveedores_caninos, Activity activity){
        this.listaproveedores = proveedores_caninos;
        this.activity = activity;

    }

    /*@NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_proveedores, parent,false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txt_nombre.setText(listaproveedores.get(position).getNombre());
        if(listaproveedores.get(position).getImagen().toString()!=""){
            Glide.with(activity).load(listaproveedores.get(position).getImagen()).apply(RequestOptions.circleCropTransform()).into(holder.img_perfil);
        }

    }

    @Override
    public int getItemCount() {
        return listaproveedores.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_perfil;
        TextView txt_nombre;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_perfil = itemView.findViewById(R.id.img_perfil);
            txt_nombre = itemView.findViewById(R.id.txt_nombre);
        }
    }
}*/