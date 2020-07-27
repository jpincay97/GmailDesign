package com.example.gmaildesign;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gmaildesign.Adapter.AdaptadorCorreo;
import com.example.gmaildesign.Model.Correo;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link ItemPrincipal#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ItemPrincipal extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    ArrayList<Correo> listaCorreos;
    RecyclerView rvCorreos;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ItemPrincipal() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ItemPrincipal.
     */
    // TODO: Rename and change types and number of parameters
    public static ItemPrincipal newInstance(String param1, String param2) {
        ItemPrincipal fragment = new ItemPrincipal();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        listaCorreos = new ArrayList<>();
        View view = inflater.inflate(R.layout.fragment_item_principal,container,false);
        rvCorreos = (RecyclerView) view.findViewById(R.id.rvCorreos);
        rvCorreos.setLayoutManager(new LinearLayoutManager(getActivity()));
        llenarCorreos();

        AdaptadorCorreo adapter = new AdaptadorCorreo(listaCorreos);
        rvCorreos.setAdapter(adapter);

        return view;
    }

    public void llenarCorreos(){
        listaCorreos.add(new Correo("PAOLA SOFIA MORALES VELOZ","Herramientas CRM - Invitación para editar",
                "paola.morales2016@uteq.edu.ec te ha...","24 jul.",R.drawable.p));
        listaCorreos.add(new Correo("Documentos de Google","Actividades semana 8 - Creo que cada...",
                "VALLE MENA ANGEL ESTALIN Y PAOLA...","24 jul.",R.drawable.d));
        listaCorreos.add(new Correo("yzamorah","Parcial Sistemas CAD/CAM",
                "Te ha invitado a que rellenes un formular...","23 jul.",R.drawable.y));
        listaCorreos.add(new Correo("MindMesiter","Time travel is possible. Here's how",
                "Go Back in TimeWith History Mode Mind...","23 jul.",R.drawable.m));
        listaCorreos.add(new Correo("Timify.me","ECOMM #2 Evaluación Parcial",
                "Evaluación Parcial Here is you pe...","22 jul.",R.drawable.t));
        listaCorreos.add(new Correo("JANETH INES MORA SECAIRA","Invitación: CLASES DE FUNDAMENTOS...",
                "Tienes una invitación para el siguiente...","21 jul.",R.drawable.j));
        listaCorreos.add(new Correo("jsaa","Puntuación publicada: Lección parcial 1...",
                "Se ha publicado tu puntuación de Lección...","21 jul.",R.drawable.ingsaa));
        listaCorreos.add(new Correo("WASHINGTON AUGUSTO...","Actividades semana 7 Ecommerce",
                "washington.pareja2013@uteq...","17 jul.",R.drawable.w));
        listaCorreos.add(new Correo("Atlassian","JOSIMAR EMILIO GALARZA...",
                "Atlassian Nitbucket JOSIMAR EMILIO...","17 jul.",R.drawable.j));
    }
}
