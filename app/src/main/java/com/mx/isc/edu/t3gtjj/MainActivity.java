package com.mx.isc.edu.t3gtjj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Spinner s1;
ArrayAdapter<String>estados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ayuda.agregar("cdmx");
        ayuda.agregar( "estado de mexico");
        ayuda.agregar( "sonora");
        ayuda.agregar( "yucatan");
        ayuda.agregar( "puebla");
        s1=findViewById(R.id.spinner);
        estados=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ayuda.mostrar());
        s1.setAdapter(estados);
    }
}
