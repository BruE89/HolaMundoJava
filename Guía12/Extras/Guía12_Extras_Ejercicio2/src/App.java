package src;

import java.util.ArrayList;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;

public class App {
    public static void main(String[] args) throws Exception {

        int aux = 0;

        int techados = 0;
        int abiertos = 0;

        ArrayList<Edificio> listaEdificios = new ArrayList<>();

        Polideportivo polideportivo1 = new Polideportivo(100, 10, 200, "San Martín", "Techado");
        Polideportivo polideportivo2 = new Polideportivo(30, 5, 20, "Poli", "Abierto");

        EdificioDeOficinas oficinas1 = new EdificioDeOficinas(50, 300, 50, 30, 10, 30);
        EdificioDeOficinas oficinas2 = new EdificioDeOficinas(30, 150, 30, 20, 2, 10);

        listaEdificios.add(polideportivo1);
        listaEdificios.add(polideportivo2);
        listaEdificios.add(oficinas1);
        listaEdificios.add(oficinas2);

        

        for (Edificio edificio : listaEdificios) {

            aux++;

            System.out.println("Edificio " + aux);

            System.out.println("Superficie total:");

            System.out.println(edificio.calcularSuperficie());

            System.out.println("Volumen total:");

            System.out.println(edificio.calcularVolumen());

            System.out.println("");

            if (edificio.getClass() == Polideportivo.class) {

                Polideportivo polideportivo = (Polideportivo) edificio;

                if (polideportivo.techadoYabierto()) {

                    techados++;
                    
                }else {

                    abiertos++;

                }
                
            }else if (edificio.getClass() == EdificioDeOficinas.class) {

                EdificioDeOficinas oficinas = (EdificioDeOficinas) edificio;

                oficinas.cantPersonas();
                
            }

            System.out.println("");
            
        }

        System.out.println("En total, " + techados + " polideportivos son techados");
        System.out.println("En total, " + abiertos + " polideportivos son abiertos");

    }

}