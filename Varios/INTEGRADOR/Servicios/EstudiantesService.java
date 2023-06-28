package Servicios;

import Entidades.Estudiante;

public class EstudiantesService {

    public double calcularPromedio(Estudiante[] a){          // recibe el array de estudiantes y notas y calcula el promedio

        double suma = 0;

        for (int i = 0; i < a.length ; i++) {

            suma += a[i].getNota();
            
        }

        double promedio = suma / a.length;

        return promedio;

    }

    public String[] sobresalientes(Estudiante[] b, double promedio){   // determina cuantos estudiantes superan el promedio, y luego crea un array con los nombres

        int contadorEstudiantes = 0;

        for (int i = 0; i < b.length; i++) {          // bucle para saber la cantidad de sobresalientes

            if (b[i].getNota() > promedio) {

                contadorEstudiantes++;
                
            }
            
        }

        String[] estudiantesSobresalientes = new String[contadorEstudiantes];

        int x = 0;

        for (int j = 0; j < b.length; j++) {                       // creacion del array de sobresalientes

            if (b[j].getNota() > promedio) {

                estudiantesSobresalientes[x] = b[j].getNombre();

                x++;
                
            }
            
        }

        return estudiantesSobresalientes;

    }

    public void mostrarArray(String[] c){    // imprime el array proporcionado

        for (int i = 0; i < c.length; i++) {

            System.out.println(c[i]);
            
        }

    }
    
}