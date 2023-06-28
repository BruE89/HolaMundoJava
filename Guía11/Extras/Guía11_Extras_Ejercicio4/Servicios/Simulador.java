package Servicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

import Entidades.Alumno;
import Entidades.Voto;

public class Simulador {

    Scanner leer = new Scanner(System.in);

    Random random = new Random();

    ArrayList<String> listaNombres = new ArrayList<>(Arrays.asList("Alejandro", "Bruno", "Carlos", "Dante", "Esteban", "Facundo", "Guido", "Hector", "Ignacio", "Jorge"));

    ArrayList<String> listaApellidos = new ArrayList<>(Arrays.asList("Arce", "Botvinik", "Contempomi", "Delorean", "Estala", "Fernandez", "Garcia", "Hernandez", "Insaurralde", "Juarez"));

    ArrayList<Alumno> listaAlumnos;

    ArrayList<Integer> listaDNI;

    /////////////////////////////////////////////////////////////////////

    public ArrayList<Alumno> crearAlumnos(){

        listaAlumnos = new ArrayList<>();

        System.out.println("Indique el número de alumnos que desea crear: (Mínimo 4, Máximo 10)");

        int num = leer.nextInt();

        leer.nextLine();

        for (int i = 0; i < num; i++) {

            Alumno alumno = new Alumno();

            String nombreRandom = listaNombres.get(random.nextInt(listaNombres.size()));

            String apellidoRandom = listaApellidos.get(random.nextInt(listaApellidos.size()));

            alumno.setNombreCompleto(nombreRandom + " " + apellidoRandom);

            listaAlumnos.add(alumno);
            
        }

        return listaAlumnos;

    }

    public ArrayList<Integer> crearDNI(){

        listaDNI = new ArrayList<>();

        for (int i = 0; i < listaAlumnos.size(); i++) {

            while (true) {

                int DNI = random.nextInt(5000001) + 40000000;
    
                if (listaDNI.contains(DNI)) {
    
                    continue;
                    
                }else {
    
                    listaDNI.add(DNI);

                    break;
    
                }
                
            }

            listaAlumnos.get(i).setDNI(listaDNI.get(i));
            
        }

        return listaDNI;

    }

    public void mostrarAlumnos(){

        for (Alumno alumno : listaAlumnos) {

            System.out.println(alumno.toString());
            
        }

    }

    public void votacion(){

        int voto;

        for (Alumno alumno : listaAlumnos) {

            HashSet<Alumno> listaVotados = new HashSet<>();
            
            while (listaVotados.size() < 3) {

                voto = random.nextInt(listaAlumnos.size());

                if ( listaAlumnos.get(voto).getDNI() != alumno.getDNI() ) {

                    listaVotados.add(listaAlumnos.get(voto));
                    
                }
                
            }

            alumno.setVotos(listaVotados);

            for (Alumno alumno2 : listaVotados) {

                alumno2.setCantidadVotos(alumno2.getCantidadVotos() + 1);
                
            }

        }

    }

    public void recuento(){

        int cuenta = 0;

        for (Alumno alumno : listaAlumnos) {

            cuenta += alumno.getCantidadVotos();
            
        }

        System.out.println("Votos totales: " + cuenta);

    }

    public void revelarVotos(){

        for (Alumno alumno : listaAlumnos) {

            System.out.println("El alumno " + alumno.getNombreCompleto() + " votó a: ");

            for (Alumno alumno2 : alumno.getVotos()) {

                System.out.println(alumno2.getNombreCompleto());
                
            }

            System.out.println("");
            
        }

    }

    public void facilitadores(){

        Comparator<Alumno> comparator = Comparator.comparing(Alumno::getCantidadVotos).reversed();

        listaAlumnos.sort(comparator);

        int i = 0;

        System.out.println("Facilitadores:");

        for (Alumno alumno : listaAlumnos) {

            if (i < 4) {

                System.out.println(alumno.getNombreCompleto());
                
            }

            if (i == 4) {

                System.out.println(alumno.getNombreCompleto());

                System.out.println("");

                System.out.println("Facilitadores suplentes:");
                
            }

            if (i > 4) {

                System.out.println(alumno.getNombreCompleto());
                
            }

            i++;
            
        }

    }

}