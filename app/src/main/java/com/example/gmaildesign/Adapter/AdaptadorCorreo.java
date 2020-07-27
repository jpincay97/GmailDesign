package com.example.gmaildesign.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.gmaildesign.Model.Correo;
import com.example.gmaildesign.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdaptadorCorreo extends RecyclerView.Adapter<AdaptadorCorreo.ViewHolderCorreo> {

    ArrayList<Correo> listaCorreos;

    public AdaptadorCorreo(ArrayList<Correo> listaCorreos) {
        this.listaCorreos = listaCorreos;
    }

    @Override
    public ViewHolderCorreo onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.ly_correos,null,false);
        return new ViewHolderCorreo(view);
    }

    @Override
    public void onBindViewHolder(AdaptadorCorreo.ViewHolderCorreo holder, int position) {
        Correo correo = listaCorreos.get(position);
        holder.lblNombre.setText(listaCorreos.get(position).getNombre());
        holder.lblAsunto.setText(listaCorreos.get(position).getAsunto());
        holder.lblMensaje.setText(listaCorreos.get(position).getMensaje());
        holder.lblFecha.setText(listaCorreos.get(position).getFecha());
        holder.imgImagen.setImageResource(listaCorreos.get(position).getImagen());
    }

    @Override
    public int getItemCount() {
        return listaCorreos.size();
    }

    public class ViewHolderCorreo extends RecyclerView.ViewHolder {

        TextView lblNombre, lblAsunto, lblMensaje, lblFecha;
        CircleImageView imgImagen;

        public ViewHolderCorreo(View itemView) {
            super(itemView);
            lblNombre = (TextView) itemView.findViewById(R.id.lblNombre);
            lblAsunto = (TextView) itemView.findViewById(R.id.lblAsunto);
            lblMensaje = (TextView) itemView.findViewById(R.id.lblMensaje);
            lblFecha= (TextView) itemView.findViewById(R.id.lblFecha);
            imgImagen = (CircleImageView) itemView.findViewById(R.id.cvFoto);
        }
    }

}
