package com.pulsar.applistacompras.applistacompras.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pulsar.applistacompras.applistacompras.R;

public class Derecha extends Fragment {
    View rootView;
    TextView txt;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.derecha,container,false);
        txt = (TextView) rootView.findViewById(R.id.txt);
        return rootView;
        //return super.onCreateView(inflater, container, savedInstanceState);
    }
    public void ObtenerDatos(String mensaje){
        txt.setText(mensaje);
    }
}
