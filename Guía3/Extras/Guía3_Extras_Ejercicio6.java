/*
 * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. 
 * y el promedio de estaturas en general.
 */

package Java.Guía3.Extras;

import java.util.Scanner;

public class Guía3_Extras_Ejercicio6 {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor ingrese alturas en metros, para terminar, ingrese (0)");

        float altura;

        float promedio;

        float promedio2;

        float suma = 0;

        float suma2 = 0;

        float cantidad = 0;

        float cantidad2 = 0;

        do {

            altura = leer.nextFloat();

            if (altura < 1.60 && altura != 0){

                suma2 = suma2 + altura;
                cantidad2++;

            }else if (altura >= 1.60) {

                suma = suma + altura;
                cantidad++;

            }

        }
        while (altura != 0);

        promedio = (suma + suma2) / (cantidad + cantidad2);
        promedio2 = suma2 / cantidad2;

        System.out.println("El promedio de alturas por debajo de 1.60 mts es de " + promedio2);
        System.out.println("El promedio general es de " + promedio);


        leer.close();
    }
}
