package Entidades;

import java.util.ArrayList;

public class ClaseArray {

    public ArrayList<Integer> crearLista(){

        ArrayList<Integer> lista = new ArrayList<>(5);

        for (int i = 0; i < lista.size(); i++) {

            lista.add(1);
            
        }

        return lista;

    }
    
}