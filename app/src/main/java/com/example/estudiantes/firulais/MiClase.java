package com.example.estudiantes.firulais;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MiClase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_clase);
    }
    public void agregarfragmento(View v){
        FragmentManager miManejador= getFragmentManager();
        FragmentTransaction miTransaccion = miManejador.beginTransaction();
        fragmento1 miFragmento = new fragmento1();

        miTransaccion.add(R.id.mifragmento,miFragmento);
        miTransaccion.commit();

    }
}
