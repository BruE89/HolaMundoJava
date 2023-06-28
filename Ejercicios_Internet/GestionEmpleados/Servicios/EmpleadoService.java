package Servicios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import Entidades.Empleado;

public class EmpleadoService {

    Scanner leer = new Scanner(System.in);

    HashMap<Integer, Empleado> listaEmpleados = new HashMap<>();

    int numeroID = 0;

    public void agregarEmpleado(){

        Empleado empleado = new Empleado();

        System.out.println("Ingrese el nombre completo del empleado");

        empleado.setNombre(leer.nextLine());

        System.out.println("Ingrese el salario mensual");

        empleado.setSalario(leer.nextInt());

        leer.nextLine();

        numeroID += 1;

        listaEmpleados.put(numeroID, empleado);

    }

    public void mostrarEmpleados(){

        System.out.println("Mostrando todos los empleados...");

        for (Map.Entry<Integer, Empleado> elemento : listaEmpleados.entrySet()) {

            System.out.println("ID: " + elemento.getKey());
            System.out.println(elemento.getValue().toString());
        
        }

    }

    public void buscarID(){

        boolean aux = false;

        System.out.println("Ingrese número de identificación a buscar");

        int buscar = leer.nextInt();

        leer.nextLine();

        for (Map.Entry<Integer, Empleado> elemento : listaEmpleados.entrySet()) {

           if (elemento.getKey().equals(buscar)) {

                System.out.println("Registro encontrado, mostrando datos...");

                System.out.println(elemento.getValue().toString());

                aux = true;
            
           }
            
        }

        if (aux == false) {

            System.out.println("Error, el número ingresado no pertenece a ningún registro");
            
        }

    }

    public void calcularSalarioPromedio(){

        int contador = 0;
        int cuenta = 0;

        for (Map.Entry<Integer, Empleado> elemento : listaEmpleados.entrySet()) {

            cuenta += elemento.getValue().getSalario();

            contador++;
            
        }

        System.out.println("El salario promedio de todos los empleados es de: " + (cuenta / contador));

    }

    public void actualizarSalario(){

        boolean aux = false;

        System.out.println("Ingrese el codigo del empleado para actualizar su salario");

        int buscarID = leer.nextInt();

        leer.nextLine();

        for (Map.Entry<Integer, Empleado> elemento : listaEmpleados.entrySet()) {

            if (elemento.getKey() == buscarID) {

                System.out.println("Empleado encontrado, ingrese nuevo salario");

                elemento.getValue().setSalario(leer.nextInt());

                leer.nextLine();

                aux = true;
                
            }
            
        }

        if (aux = false) {

            System.out.println("Error, empleado no encontrado");
            
        }

    }

    public void eliminarEmpleado(){

        Iterator<Integer> iterator = listaEmpleados.keySet().iterator();

        System.out.println("Ingrese el ID del empleado a eliminar");

        int eliminar = leer.nextInt();

        while (iterator.hasNext()) {

            if (iterator.next() == eliminar) {

                iterator.remove();
                
            }
            
        }

    }

}