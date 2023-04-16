package src;

public class Rectangulo {

    private int base;

    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //////////////////////////////////////////////////

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    //////////////////////////////////////////////////

    public void crearRectangulo(int base, int altura){

        this.base = base;
        this.altura = altura;

    }

    public int superficie(){

        int superficie = base * altura;

        return superficie;

    }

    public int perimetro(){

        int perimetro = (base + altura) * 2;

        return perimetro;

    }
    
    public void dibujarRectangulo(){

        for (int i = 0; i < altura; i++) {

            if (i == 0 || i == altura-1 ){

                System.out.print("* ".repeat(base));

            }else{

                System.out.print("* ");
                System.out.print("  ".repeat(base-2));
                System.out.print("*");
            }

            System.out.println("");
                
        }
            
    }

}