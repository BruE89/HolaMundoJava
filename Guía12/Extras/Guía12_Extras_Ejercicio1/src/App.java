package src;

import java.time.LocalDate;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoAMotor;
import Entidades.Velero;
import Entidades.YatesDeLujo;

public class App {
    public static void main(String[] args) throws Exception {

        Barco velero = new Velero("GZY123", 10, LocalDate.of(1998, 12, 28), 1);

        Barco barcoAmotor = new BarcoAMotor("ASD123", 6, LocalDate.of(2005, 1, 2), 600);

        Barco yate = new YatesDeLujo("QWE321", 50, LocalDate.of(2020, 5, 25), 1500, 10);

        Alquiler alquilerVelero = new Alquiler("Venicio", 30555444, LocalDate.of(2023, 6, 10), LocalDate.of(2023, 6, 20), 5, velero);
        Alquiler alquilerMotor = new Alquiler("Mauricio", 20333111, LocalDate.of(2023, 6, 10), LocalDate.of(2023, 6, 25), 6, barcoAmotor);
        Alquiler alquilerYate = new Alquiler("Yamil", 10222555, LocalDate.of(2023, 6, 10), LocalDate.of(2023, 6, 30), 7, yate);

        System.out.println("El velero paga: $" + alquilerVelero.calcularAlquiler());

        System.out.println("El barco a motor paga: $" + alquilerMotor.calcularAlquiler());

        System.out.println("El yate paga: $" + alquilerYate.calcularAlquiler());

        

    }

}