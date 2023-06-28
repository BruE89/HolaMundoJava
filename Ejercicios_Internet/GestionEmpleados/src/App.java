package src;

import Servicios.EmpleadoService;

public class App {
    public static void main(String[] args) throws Exception {

        EmpleadoService es = new EmpleadoService();

        es.agregarEmpleado();
        es.agregarEmpleado();

        es.mostrarEmpleados();

        es.buscarID();

        es.calcularSalarioPromedio();

        es.actualizarSalario();

        es.mostrarEmpleados();

        es.eliminarEmpleado();

        es.mostrarEmpleados();

    }
    
}