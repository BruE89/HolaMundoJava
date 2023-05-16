package src.Servicios;

import src.Entidades.Raices;

public class RaicesServicio {

    public double getDiscriminante(Raices r){

        double discriminante = (Math.pow(r.getB(), 2))  - 4 * r.getA() * r.getC();

        return discriminante;

    }

    public boolean tieneRaices(Raices r){

        if (getDiscriminante(r) >= 0){

            return true;

        }else {

            return false;

        }

    }

    public boolean tieneRaiz(Raices r){

        if (getDiscriminante(r) == 0){

            return true;

        }else {

            return false;

        }

    }

    public void obtenerRaices(Raices r){

        if (tieneRaices(r) == true){

            double raiz1 = (-r.getB() + Math.sqrt(((Math.pow(r.getB(),2))) - (4 * r.getA() * r.getC()))) / (2 * r.getA());

            double raiz2 = (-r.getB() - Math.sqrt(((Math.pow(r.getB(),2))) - (4 * r.getA() * r.getC()))) / (2 * r.getA());

            System.out.println("Raíz 1: " + raiz1);
            System.out.println("Raíz 2: " + raiz2);

        }else {

            System.out.println("No existen soluciones reales");

        }
        
    }

    public void obtenerRaiz(Raices r){

        if (tieneRaiz(r) == true){

            double raiz = (-r.getB() + Math.sqrt(((Math.pow(r.getB(),2))) - (4 * r.getA() * r.getC()))) / (2*r.getA());

            System.out.println(raiz);

        }

    }

    public void calcular(Raices r){

        if (tieneRaices(r)) {

            obtenerRaices(r);

        } else if (tieneRaiz(r)) {

            obtenerRaiz(r);

        } else {

            System.out.println("No tiene solución real");

        }

    }
    
}