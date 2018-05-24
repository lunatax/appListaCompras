package com.pulsar.applistacompras.applistacompras.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pulsar.applistacompras.applistacompras.EnviarMensaje;
import com.pulsar.applistacompras.applistacompras.Fragments.Derecha;
import com.pulsar.applistacompras.applistacompras.R;

public class MainActivity extends AppCompatActivity implements EnviarMensaje{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void enviarDatos(String mensaje) {
        Derecha derecha = (Derecha) getFragmentManager().findFragmentById(R.id.derecha);
        derecha.ObtenerDatos(mensaje);
    }
}
