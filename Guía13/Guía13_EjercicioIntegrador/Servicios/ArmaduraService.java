package Servicios;

import java.util.Scanner;

import Entidad_Principal.Armadura;

public class ArmaduraService extends Armadura{

    Scanner leer = new Scanner(System.in);

    public void menu(){

        boolean salir = false;

        crearArmadura();

        System.out.println("Armadura creada exitosamente, a continuación, seleccione las acciones a realizar");

        while (salir == false) {

            System.out.println("1. Caminar");
            System.out.println("2. Correr");
            System.out.println("3. Propulsarse");
            System.out.println("4. Volar");
            System.out.println("5. Disparar Guantes");
            System.out.println("6. Utilizar Consola");
            System.out.println("7. Utilizar Sintetizador");
            System.out.println("8. Consultar Estado de la Batería");
            System.out.println("9. Consultar Estado General de los Dispositivos");
            System.out.println("10. Intentar Reparar Dispositivo");
            System.out.println("11. Ejecutar Sistema de Reparaciones Automáticas");
            System.out.println("12. Salir");
            
            int opcion = leer.nextInt();

            leer.nextLine();

            switch (opcion) {
                case 1:

                    System.out.println("Ingrese el tiempo (en segundos) desea caminar");

                    int tiempoCaminar = leer.nextInt();

                    leer.nextLine();

                    caminar(tiempoCaminar);
                    
                    break;

                case 2:

                    System.out.println("Ingrese el tiempo (en segundos) desea correr");

                    int tiempoCorrer = leer.nextInt();

                    leer.nextLine();

                    correr(tiempoCorrer);
                    
                    break;

                case 3:

                    System.out.println("Ingrese el tiempo (en segundos) que desea propulsarse");

                    int tiempoPropulsarse = leer.nextInt();

                    leer.nextLine();

                    propulsarse(tiempoPropulsarse);
                    
                    break;

                case 4:

                    System.out.println("Ingrese el tiempo (en segundos) que desea volar");

                    int tiempoVolar = leer.nextInt();

                    leer.nextLine();

                    volar(tiempoVolar);
                    
                    break;

                case 5:

                    System.out.println("Ingrese el tiempo (en segundos) que desea disparar los guantes");

                    int tiempoDisparo = leer.nextInt();

                    leer.nextLine();

                    dispararGuantes(tiempoDisparo);
                    
                    break;

                case 6:

                    System.out.println("Ingrese el tiempo (en segundos) que desea utilizar la consola");

                    int tiempoConsola = leer.nextInt();

                    leer.nextLine();

                    utilizarConsola(tiempoConsola);
                    
                    break;

                case 7:

                    System.out.println("Ingrese el tiempo (en segundos) que desea utilizar el sintetizador");

                    int tiempoSintetizador = leer.nextInt();

                    leer.nextLine();

                    utilizarSintetizador(tiempoSintetizador);
                    
                    break;

                case 8:

                    estadoBateria();
                    
                    break;

                case 9:

                    mostrarEstadoGeneral();
                    
                    break;

                case 10:

                    intentarRepararDispositivo(botas);
                    
                    break;

                case 11:

                    reparacionAutomatica();
                    
                    break;

                case 12:

                    salir = true;
                    
                    break;
            
                default:
                    break;
                    
            }

        }

    }
    
}