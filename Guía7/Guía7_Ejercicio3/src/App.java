public class App {
    public static void main(String[] args) throws Exception {
        
        Operacion miOperacion = new Operacion();

        miOperacion.crearOperacion();

        System.out.println("Suma: " + miOperacion.sumar());

        System.out.println("Resta: " + miOperacion.restar());

        System.out.println("Multiplicación: " + miOperacion.multiplicar());

        System.out.println("División: " + miOperacion.dividir());

    }

}
