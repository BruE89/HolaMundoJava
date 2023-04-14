/*
 * Una obra social tiene tres clases de socios:
 * Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
 * Los socios tipo ‘B’ abonan una cuota moderada y 
 * tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
 * Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
 * Solicite una letra (carácter) que representa la clase de un socio,
 * y luego un valor real que represente el costo del tratamiento (previo al descuento) y 
 * determine el importe en efectivo a pagar por dicho socio.
 */


package Java.Guía3.Extras;

import java.util.Scanner;

public class Guía3_Extras_Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese el tipo de socio (A, B o C): ");

        String opcion = leer.nextLine().toUpperCase();

        System.out.println("A continuación, ingrese el monto total del costo de tratamiento: ");

        int costo = leer.nextInt();

        switch (opcion) {

            case "A":

                Double totalA = costo - (costo * 0.50);
                System.out.println("Para los socios tipo A, el monto total sería de $" + totalA);
                
                break;
        
            case "B":
                
                Double totalB = costo - (costo * 0.35);
                System.out.println("Para los socios tipo B, el monto total sería de $" + totalB);

                break;
        
            case "C":
                
                System.out.println("Para los socios tipo C, el monto total sería de $" + costo);

                break;

            default:

                System.out.println("Error. Tipo de socio no válido");

                break;
        }
        leer.close();
    }
    
}
