package src.Servicios;

import src.Entidades.Cadena;

public class CadenaServicio {

    Cadena objeto = new Cadena("Murcielago");

    public void mostrarVocales(){

        int contadorVocales = 0;

        char[] arregloVocales = {'a' , 'e' , 'i' , 'o' , 'u'};

        for (int i = 0; i < objeto.getLongitudFrase(); i++) {

            char letra = objeto.getFrase().charAt(i);

            for (int j = 0; j < arregloVocales.length; j++) {

                if (letra == arregloVocales[j]) {

                    contadorVocales++;
                    break;

                }

            }
            
        }

        System.out.println("La frase tiene " + contadorVocales + " vocales");

    }

    public void invertirFrase(){

        StringBuilder sb = new StringBuilder(objeto.getFrase());

        System.out.println("Frase invertida: " + sb.reverse());

    }

    public void vecesRepetido(String letra){

        int contadorLetra = 0;

        for (int i = 0; i < objeto.getLongitudFrase(); i++) {

            if (objeto.getFrase().substring(i, i+1).matches(letra)){

                contadorLetra++;

            }
            
        }

        System.out.println("La letra '" + letra + "' se repite " + contadorLetra + " veces");

    }

    public void compararLongitud(String fraseNueva){

        System.out.println(Integer.compare(objeto.getLongitudFrase(), fraseNueva.length()));

    }

    public void unirFrases(String fraseNueva){

        String frase = objeto.getFrase();

        System.out.println("La frase quedaría: " + frase.concat(fraseNueva));

    }

    public void reemplazar(String letra){

        System.out.println("La frase quedaría: " + objeto.getFrase().replaceAll("a", letra));

    }

    public boolean contiene(String letra){

        return objeto.getFrase().contains(letra);

    }
    
}