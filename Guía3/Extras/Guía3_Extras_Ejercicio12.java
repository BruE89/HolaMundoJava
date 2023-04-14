/*
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9, 
 * con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
 * 0-0-0
 * 0-0-1
 * 0-0-2
 * 0-0-E
 * 0-0-4
 * 0-1-2
 * 0-1-E
 * Nota: investigar función equals() y como convertir números a String.
 */



package Java.Guía3.Extras;

import java.io.IOException;

public class Guía3_Extras_Ejercicio12 {

    public static void main(String[] args) throws IOException {
        
        System.out.println("A continuación, presione cualquier tecla para inicializar el contador: ");

        System.in.read();

        for (int a = 0; a <= 9; a++) {

            for (int b = 0; b <= 9; b++) {
                
                for (int c = 0; c <= 9; c++) {

                    if (a == 3){

                        System.out.print("E-");

                    }else{

                        System.out.print(a + "-");
                    }

                    if (b == 3){

                        System.out.print("E-");

                    }else{

                        System.out.print(b + "-");
                    }

                    if (c == 3){

                        System.out.print("E");

                    }else{

                        System.out.print(c);
                    }

                    System.out.println("");
                }
            }
        }
    }
}
