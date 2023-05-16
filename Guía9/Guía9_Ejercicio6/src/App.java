package src;

import src.Servicios.CursoServicio;

public class App {
    public static void main(String[] args) throws Exception {

        CursoServicio curso1 = new CursoServicio();

        curso1.crearCurso();

        System.out.println("Ganancias semanales:");

        System.out.println(curso1.calcularGananciaSemanal());
    }

}