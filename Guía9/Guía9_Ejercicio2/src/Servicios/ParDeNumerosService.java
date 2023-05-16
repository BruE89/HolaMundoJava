package src.Servicios;

import src.Entidades.ParDeNumeros;

public class ParDeNumerosService {

    ParDeNumeros pdn = new ParDeNumeros();

    public void mostrarValores(){

        System.out.println(pdn.getNum1());
        System.out.println(pdn.getNum2());

    }

    public int devolverMayor(){

        int max = Math.max(pdn.getNum1(), pdn.getNum2());

        return max;

    }

    public void calcularPotencia(){

        int min = Math.min(pdn.getNum1(), pdn.getNum2());

        System.out.println("El mayor numero, elevado al menor: " + Math.pow(devolverMayor(), min)); 

    }

    public void calculaRaiz(){

        int min = Math.min(pdn.getNum1(), pdn.getNum2());

        min = Math.abs(min);

        System.out.println("La raíz del mínimo es: " + Math.sqrt(min));

    }
    
}
