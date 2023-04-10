/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
 * cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */


package Java.Guía5;

import java.util.Scanner;

public class Guía5_Ejercicio3 {

    public static void main(String[] args) {
        
        int [] arreglo = inicializarArreglo();

        llenarAleatorio(arreglo);

        //mostrarArreglo(arreglo);

        contarDigitos(arreglo);

    }

    public static int[] inicializarArreglo() {

        System.out.println("Seleccione el tamaño del arreglo");

        Scanner leer = new Scanner(System.in);

        int n = leer.nextInt();

        int[] arreglo = new int[n];

        leer.close();

        return arreglo;
        
    }

    public static int[] llenarAleatorio(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {

            arreglo[i] = (int) (Math.random() * 100000);
            
        }

        return arreglo;
        
    }

    public static void contarDigitos(int[] arreglo) {

        int contador = 0;

        int num;

        int contador1 = 0;

        int contador2 = 0;

        int contador3 = 0;

        int contador4 = 0;

        int contador5 = 0;

        for (int i = 0; i < arreglo.length; i++) {

            num = arreglo[i];

            contador = 0;

            while (num >= 1) {

                num = num / 10;

                contador++;
                
            }

            if (contador == 1){

                contador1++;
            }else if (contador == 2) {

                contador2++;
            }else if (contador == 3){

                contador3++;
            }else if (contador == 4){

                contador4++;
            }else if (contador == 5){

                contador5++;
            }
            
        }

        System.out.println("Total de números de 1 dígitos: " + contador1);
        System.out.println("Total de números de 2 dígitos: " + contador2);
        System.out.println("Total de números de 3 dígitos: " + contador3);
        System.out.println("Total de números de 4 dígitos: " + contador4);
        System.out.println("Total de números de 5 dígitos: " + contador5);
        
    }

    public static void mostrarArreglo(int [] B) {

        for (int i = 0; i <B.length; i++) {

            System.out.print("[" + B[i] + "]");
    
        }
        System.out.println("");
    }
    
}
