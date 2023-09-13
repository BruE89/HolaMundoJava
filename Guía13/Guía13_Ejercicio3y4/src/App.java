package src;


import Entidades.DivisionNumero;

public class App {
    public static void main(String[] args) throws Exception {

        DivisionNumero d = new DivisionNumero();

        try {

            d.convertirYdividir();

        }catch (ArithmeticException e){

            System.out.println("Error, no se puede dividir por cero");

        }catch (NumberFormatException e){

            System.out.println("Error, por favor asegúrese de ingresar sólo números enteros");
            
        } catch (Exception e) {
            
            System.out.println("Error desconocido: " + e.getMessage());

        }
        
    }

}