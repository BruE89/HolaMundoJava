public class Rectangulo {

    private int lado1, lado2;

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int calcular_area(){

        int area = lado1 * lado2;

        return area;

    }

}