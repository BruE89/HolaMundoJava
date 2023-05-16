package src.Servicios;

import java.util.Scanner;

import src.Entidades.Persona;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

    public boolean esMayorDeEdad(Persona p){

        int edad = p.getEdad();

        boolean aux;

        if (edad >= 18){

            System.out.println("La persona es MAYOR de edad");

            aux = true;

            return aux;

        }else {

            System.out.println("La persona es MENOR de edad");

            aux = false;

            return aux;

        }

    }

    public void crearPersona(Persona p){

        System.out.println("Ingrese el nombre de la persona");

        p.setNombre(leer.nextLine());

        System.out.println("Ingrese la edad de la persona");

        p.setEdad(leer.nextInt());

        leer.nextLine();

        System.out.println("ingrese el sexo de la persona ('H' para hombre, 'M' para mujer, 'O' para otro)");

        char sexo = leer.nextLine().toUpperCase().charAt(0);

        while (sexo != 'H' && sexo != 'M' && sexo != 'O'){

            System.out.println("Se ingresó un dato incorrecto, intente nuevamente");

            System.out.println("'H' para hombre, 'M' para mujer, 'O' para otro");

            sexo = leer.nextLine().charAt(0);

        }

        System.out.println("Ingrese el peso de la persona");

        p.setPeso(leer.nextInt());

        System.out.println("Ingrese la altura de la persona");

        p.setAltura(leer.nextDouble());

        leer.nextLine();

    }

    public int calcularIMC(Persona p){

        int peso = p.getPeso();

        double altura = p.getAltura();

        double indice = (peso / (Math.pow(altura, 2)) );

        if (indice < 20){

            return -1;

        }else if (indice >= 20 && indice <= 25){

            return 0;

        }else {

            return 1;

        }

    }
    
}
