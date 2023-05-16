public class Funciones {

    public void crearNumero() {

        System.out.println(numero1() + "-" + numero2() + "-" + numero3());

    }

    public int numero1() {

        int num1;

        while (true) {

            num1 = 99 + (int)(Math.random() * ((1000 - 99)));


            String aux = Integer.toString(num1);

            if (aux.contains("8") || aux.contains("9")) {

                continue;

            }else {

                break;

            }

        }

        return num1;

    }

    public int numero2() {

        int num2;

        while (true) {

            num2 = 99 + (int)(Math.random() * ((1000 - 99)));

            if (num2 > 742) {
    
                continue;
                
            }else {

                break;

            }
            
        }

        return num2;

    }

    public int numero3(){

        int num3 = 999 + (int)(Math.random() * ((10000 - 999)));

        return num3;

    }

}