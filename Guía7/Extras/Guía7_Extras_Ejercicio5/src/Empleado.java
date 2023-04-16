package src;
public class Empleado {

    private String nombre;

    private double salario;

    private int edad;

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void calcular_aumento(String nombre, int edad, double salario){

        double aumento;

        if (edad >= 30){

            aumento = salario * 0.1;

        }else {

            aumento = salario * 0.05;

        }

        System.out.println("El aumento para " + nombre + " sería de: $" + aumento);

    }
    
}