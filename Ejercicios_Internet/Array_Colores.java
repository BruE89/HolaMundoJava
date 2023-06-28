import java.util.ArrayList;

public class Array_Colores {

    public static void main(String[] args) {
        
        ArrayList<String> arrayColores = new ArrayList<>();

        arrayColores.add("Rojo");
        arrayColores.add("Verde");
        arrayColores.add("negro");

        for (Object object : arrayColores) {

            System.out.println(object);
            
        }

        arrayColores.add(0,"blanco");

        System.out.println(arrayColores);

    }
    
}
