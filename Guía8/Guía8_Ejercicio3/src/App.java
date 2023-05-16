package src;

import src.Entidades.Persona;
import src.Servicios.PersonaServicio;

public class App {
    public static void main(String[] args) throws Exception {
        
        PersonaServicio ps = new PersonaServicio();

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();

        int[] arregloIMC = new int[4];
        boolean[] arregloEdades = new boolean[4];

        ps.crearPersona(persona1);
        arregloEdades[0] = ps.esMayorDeEdad(persona1);
        arregloIMC[0] = ps.calcularIMC(persona1);

        ps.crearPersona(persona2);
        arregloEdades[1] = ps.esMayorDeEdad(persona2);
        arregloIMC[1] = ps.calcularIMC(persona2);

        ps.crearPersona(persona3);
        arregloEdades[2] = ps.esMayorDeEdad(persona3);
        arregloIMC[2] = ps.calcularIMC(persona3);

        ps.crearPersona(persona4);
        arregloEdades[3] = ps.esMayorDeEdad(persona4);
        arregloIMC[3] = ps.calcularIMC(persona4);

        porcentajeIMC(arregloIMC);
        porcentajeMenoresMayores(arregloEdades);

    }

    
    public static void porcentajeIMC(int[] a){

        int personas = 4;
        int personasSobrepeso = 0;
        int personasIdeal = 0;
        int personasDebajo = 0;

        double porcentajeSobrepeso = 0;
        double porcentajeIdeal = 0;
        double porcentajeDebajo = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 1){

                personasSobrepeso++;

            }else if (a[i] == 0){

                personasIdeal++;

            }else {

                personasDebajo++;

            }
            
        }

        porcentajeSobrepeso = (personasSobrepeso * 100) / personas;
        porcentajeIdeal = (personasIdeal * 100) / personas;
        porcentajeDebajo = (personasDebajo * 100) / personas;

        System.out.println("Porcentaje de personas con Sobrepeso: " + porcentajeSobrepeso);
        System.out.println("Porcentaje de personas en su Peso Ideal: " + porcentajeIdeal);
        System.out.println("Porcentaje de personas por Debajo de su peso: " + porcentajeDebajo);

    }

    public static void porcentajeMenoresMayores(boolean[] b){

        int personas = 4;

        int mayores = 0;
        int menores = 0;

        double porcentajeMayores = 0;
        double porcentajeMenores = 0;

        for (int i = 0; i < b.length; i++) {

            if (b[i] == true){

                mayores++;

            }else {

                menores++;

            }
            
        }

        porcentajeMayores = (mayores * 100) / personas;
        porcentajeMenores = (menores * 100) / personas;

        System.out.println("El porcentaje de peronas mayores de edad es: " + porcentajeMayores);
        System.out.println("El porcentaje de personas menores de edad es: " + porcentajeMenores);

    }
}
