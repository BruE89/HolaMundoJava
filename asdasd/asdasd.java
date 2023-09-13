import java.util.Scanner;

public class asdasd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int mayor;
        int menor;

        System.out.println("Por favor ingrese 2 numeros");

        do {

            System.out.println("Los numeros deben ser enteros y positivos");

            num1 = Integer.parseInt(input.nextLine());
            num2 = Integer.parseInt(input.nextLine());
            
        } while (num1 <= 0 || num2 <= 0);

        if (num1 > num2) {

            mayor = num1;
            menor = num2;
            
        } else {

            mayor = num2;
            menor = num1;

        }

        while (menor != 0) {

            int resultado = mayor / menor;

            int multiplicacion = menor * resultado;

            int resta = mayor - multiplicacion;

            mayor = menor;

            menor = resta;
            
        }

        System.out.println("El M.C.D. es: " + mayor);

    }



}