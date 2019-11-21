package com.mx.isc.edu.t3gtjj;

import java.util.ArrayList;

public class ayuda {
    public static ArrayList<String> listaEstados=new ArrayList<String>();
    public static void agregar(String name){
        listaEstados.add(name);
    }
    public static ArrayList<String>mostrar(){
        return listaEstados;
    }
}
