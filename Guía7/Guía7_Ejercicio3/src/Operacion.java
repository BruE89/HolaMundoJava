import java.util.Scanner;

public class Operacion {

    private int numero1;

    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNum1(){

        return numero1;

    }

    public int getNum2(){

        return numero2;

    }

    public void setNum1(int numero1){

        this.numero1 = numero1;

    }

    public void setNum2(int numero2){

        this.numero2 = numero2;

    }

    public void crearOperacion(){

        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese el primer número");

        this.numero1 = leer.nextInt();

        System.out.println("Ahora ingrese el segundo número");

        this.numero2 = leer.nextInt();

        leer.close();

    }

    public int sumar(){

        int aux = numero1 + numero2;

        return aux;

    }

    public int restar(){

        int aux = numero1 - numero2;

        return aux;

    }

    public int multiplicar(){

        int cero = 0;

        if (numero1 == 0 || numero2 == 0){

            System.out.println("ERROR. No se puede multiplicar por cero");

            return cero;

        }else {

            int aux = numero1 * numero2;

            return aux;

        }

    }

    public double dividir(){

        int cero = 0;

        if (numero1 == 0 || numero2 == 0){

            System.out.println("ERROR. No se puede dividir por cero");

            return cero;

        }else {

            double aux = ( ((double)numero1) / ((double)numero2) );

            return aux;

        }

    }
    
}
