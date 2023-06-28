package Entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Cine {

    private Pelicula pelicula;

    private int precioEntrada;

    private String[][] sala = new String[8][6];

    Random random = new Random();

    public Cine() {
    }

    public Cine(Pelicula pelicula, int precioEntrada) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 6; j++) {

                if (j == 0){

                    sala[i][j] = (9 - (i + 1)) + "A";

                }else if (j == 1){

                    sala[i][j] = (9 - (i + 1)) + "B";

                }else if (j == 2){

                    sala[i][j] = (9 - (i + 1)) + "C";

                }else if (j == 3){

                    sala[i][j] = (9 - (i + 1)) + "D";

                }else if (j == 4){

                    sala[i][j] = (9 - (i + 1)) + "E";

                }else if (j == 5){

                    sala[i][j] = (9 - (i + 1)) + "F";

                }

            }
            
        }

    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public void mostrarSala(){

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 6; j++) {

                System.out.print(sala[i][j] + " ");
                
            }

            System.out.println("");
            
        }

    }

    public void llenarSala(ArrayList<Espectador> lista){

        for (Espectador espectador : lista) {

            while (true) {

                System.out.println("iteracion while");

                int i = random.nextInt(8);
                int j = random.nextInt(6);

                if (espectador.getEdad() < pelicula.getEdadMinima()) {

                    System.out.println("Esta persona no tiene la edad suficiente para ver la película");

                    break;
                    
                }else {

                    if (espectador.getDinero() < this.getPrecioEntrada()) {

                        System.out.println("Esta persona no tiene dinero suficiente");

                        break;
                        
                    }else {

                        if (sala[i][j].contains("X")) {
    
                            System.out.println("El asiento está ocupado, buscando otro...");
                            
                        }else {
            
                            sala[i][j] = sala[i][j].concat("X");
            
                            System.out.println("Asiento asignado correctamente");
            
                            break;
            
                        }

                    }

                }
                
            }
            
        }

    }

    @Override
    public String toString() {
        return "Cine [pelicula=" + pelicula + ", precioEntrada=" + precioEntrada + ", sala=" + Arrays.toString(sala)
                + "]";
    }
    
}