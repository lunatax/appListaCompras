package com.pulsar.applistacompras.applistacompras.Fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.pulsar.applistacompras.applistacompras.EnviarMensaje;
import com.pulsar.applistacompras.applistacompras.R;

public class Izquierda extends Fragment {
    View rootView;
    EditText campo;
    Button boton;
    EnviarMensaje EM;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.izquierda,container,false);

        campo = (EditText) rootView.findViewById(R.id.campotxt);
        boton = (Button) rootView.findViewById(R.id.boton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje = campo.getText().toString();
                //EM = (EnviarMensaje) getActivity();
                EM.enviarDatos(mensaje);
            }
        });
        return rootView;
        //return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            EM = (EnviarMensaje) context;
            //EM = (EnviarMensaje) getActivity();
        }catch (ClassCastException e){
            throw new ClassCastException("Necesitas Implementar");
        }

    }
}
