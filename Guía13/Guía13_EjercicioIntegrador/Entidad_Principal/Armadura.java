package Entidad_Principal;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Partes.Bota;
import Partes.Consola;
import Partes.Dispositivo;
import Partes.Generador;
import Partes.Guante;
import Partes.Sintetizador;

public class Armadura {

    protected String colorPrimario;

    protected String colorSecundario;

    protected int resistencia;

    protected int salud;

    protected Bota botas;

    protected Guante guantes;

    protected Consola consola;

    protected Sintetizador sintetizador;

    protected Generador generador;

    Scanner leer = new Scanner(System.in);

    ArrayList<Dispositivo> dispositivos = new ArrayList<>();

    //-------------------------------------------------------------------------------------------------------------------

    public Armadura(String colorPrimario, String colorSecundario, int resistencia, int salud, Bota botas,
            Guante guantes, Consola consola, Sintetizador sintetizador, Generador generador) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.resistencia = resistencia;
        this.salud = salud;
        this.botas = botas;
        this.guantes = guantes;
        this.consola = consola;
        this.sintetizador = sintetizador;
        this.generador = generador;
    }

    public Armadura() {
    }


    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public Bota getBotas() {
        return botas;
    }

    public void setBotas(Bota botas) {
        this.botas = botas;
    }

    public Guante getGuantes() {
        return guantes;
    }

    public void setGuantes(Guante guantes) {
        this.guantes = guantes;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    public Sintetizador getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(Sintetizador sintetizador) {
        this.sintetizador = sintetizador;
    }

    public Generador getGenerador() {
        return generador;
    }

    public void setGenerador(Generador generador) {
        this.generador = generador;
    }

    //-------------------------------------------------------------------------------------------------------------------

    public void crearArmadura(){
 
        String colorPrimario = "";
        String colorSecundario = "";

        System.out.println("Bienvenido a la inferfaz para la creación de armaduras IRON MAN");

        while (!colorPrimario.equalsIgnoreCase("ROJO") && !colorPrimario.equalsIgnoreCase("NEGRO") && !colorPrimario.equalsIgnoreCase("METALICO")) {
            
            System.out.println("Por favor ingrese el color PRIMARIO de la armadura: (ROJO / NEGRO / METALICO)");

            colorPrimario = leer.nextLine();

        }

        while (!colorSecundario.equalsIgnoreCase("AMARILLO") && !colorSecundario.equalsIgnoreCase("BLANCO")) {
            
            System.out.println("A continuaación, seleccione el color SECUNDARIO: (AMARILLO / BLANCO)");

            colorSecundario = leer.nextLine();

        }

        System.out.println("Asignando colores...");

        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;

        System.out.println("Construyendo exoesqueleto...");
        this.resistencia = 100;
        this.salud = 100;

        System.out.println("Terminando partes...");

        Bota bota = new Bota();
        Guante guante = new Guante();
        Consola consola = new Consola();
        Sintetizador sintetizador = new Sintetizador();
        Generador generador = new Generador();

        this.botas = bota;
        this.guantes = guante;
        this.consola = consola;
        this.sintetizador = sintetizador;
        this.generador = generador;

        dispositivos.add(bota);
        dispositivos.add(guante);
        dispositivos.add(consola);
        dispositivos.add(sintetizador);
        dispositivos.add(generador);
        
    }

    //-------------------------------------------------------------------------------------------------------------------

    public void caminar(int tiempo){

        if (this.botas.isFuncional()) {

            int consumoTotal = this.botas.getConsumoEnergetico() * tiempo;

            generador.setCargaActual(generador.getCargaActual() - consumoTotal);

            System.out.println("Armadura caminando...");

            if (funcional() == false) {

                this.botas.setFuncional(false);
            
            }
            
        }else {

            System.out.println("Imposible cumplir acción, dispositivo dañado");

        }

    }

    public void correr(int tiempo){

        if (this.botas.isFuncional()) {

            int consumoTotal = (this.botas.getConsumoEnergetico() * 2) * tiempo;

            generador.setCargaActual(generador.getCargaActual() - consumoTotal);

            System.out.println("Armadura corriendo...");

            if (funcional() == false) {

                this.botas.setFuncional(false);
            
            }
            
        }else {

            System.out.println("Imposible cumplir acción, dispositivo dañado");

        }

    }

    public void propulsarse(int tiempo){

        if (this.botas.isFuncional()) {

            int consumoTotal = (this.botas.getConsumoEnergetico() * 3) * tiempo;

            generador.setCargaActual(generador.getCargaActual() - consumoTotal);

            System.out.println("Armadura propulsándose...");

            if (funcional() == false) {

                this.botas.setFuncional(false);
            
            }
            
        }else {

            System.out.println("Imposible cumplir acción, dispositivo dañado");

        }

    }

    public void volar(int tiempo){

        if (this.botas.isFuncional() && this.guantes.isFuncional()) {

            int consumoTotal = ((this.botas.getConsumoEnergetico() * 3) + (this.guantes.getConsumoEnergetico() * 2)) * tiempo;

            generador.setCargaActual(generador.getCargaActual() - consumoTotal);

            System.out.println("Armadura volando...");

            if (funcional() == false) {

                this.botas.setFuncional(false);

            }

            if (funcional() == false) {

                this.guantes.setFuncional(false);

            }
            
        }else {

            System.out.println("Imposible cumplir acción, dispositivo dañado");

        }

    }

    public void dispararGuantes(int tiempo){

        if (this.guantes.isFuncional()) {

            int consumoTotal = (this.guantes.getConsumoEnergetico() * 3) * tiempo;

            generador.setCargaActual(generador.getCargaActual() - consumoTotal);

            System.out.println("Armadura disparando...");

            if (funcional() == false) {

                this.guantes.setFuncional(false);
            
            }
            
        } else {

            System.out.println("Imposible cumplir acción, dispositivo dañado");

        }

    }

    public void utilizarConsola(int tiempo){

        if (this.consola.isFuncional()) {
            
            int consumoTotal = (this.consola.getConsumoEnergetico() * tiempo);

            generador.setCargaActual(generador.getCargaActual() - consumoTotal);

            System.out.println("Armadura activando consola...");

            if (funcional() == false) {

                this.consola.setFuncional(false);

            }
            
        } else {

            System.out.println("Imposible cumplir acción, dispositivo dañado");

        }

    }

    public void utilizarSintetizador(int tiempo){

        if (this.sintetizador.isFuncional()) {

            int consumoTotal = (this.sintetizador.getConsumoEnergetico() * tiempo);

            generador.setCargaActual(generador.getCargaActual() - consumoTotal);

            System.out.println("Armadura activando sintetizador...");

            if (funcional() == false) {

                this.sintetizador.setFuncional(false);

            }
            
        } else {

            System.out.println("Imposible cumplir acción, dispositivo dañado");

        }

    }

    //-------------------------------------------------------------------------------------------------------------------

    public void estadoBateria(){

        int bateriaRestante = (generador.getCargaActual() * 100) / generador.getCargaMaxima();

        System.out.println("Batería al " + bateriaRestante + "%" );

    }

    public boolean funcional(){

        Random r = new Random();

        boolean aux = true;

        int num = r.nextInt(100) + 1;

        if (num < 30) {

            aux = false;
            
        }

        return aux;

    }

    public void mostrarEstadoGeneral(){

        System.out.println("Mostrando estado general del sistema...");

        for (Dispositivo dispositivo : dispositivos) {

            if (dispositivo.isFuncional() && dispositivo.isDestruido() == false) {

                System.out.println(dispositivo.getClass() + " se encuentra operacional");
                
            } else if (!dispositivo.isFuncional()){

                System.out.println(dispositivo.getClass() + " se encuentra dañado");

            } else if (dispositivo.isDestruido()){

                System.out.println(dispositivo.getClass() + " se encuentra DESTRUIDO");

            }
            
        }

    }

    public void intentarRepararDispositivo(Dispositivo dispositivo){

        System.out.println("Intentando reparar " + (dispositivo.getClass()));

        if (dispositivo.isFuncional()) {

            System.out.println("El dispositivo no necesita reparación");
            
        }else if (dispositivo.isDestruido()) {
            
            System.out.println("Imposible efectuar reparaciones, el dispositivo se encuentra DESTRUIDO");
        
        }else {

            System.out.println("Intentando reparaciones...");

            Random r = new Random();

            int num = r.nextInt(100) + 1;

            if (num < 40) {

                dispositivo.setFuncional(true);

                System.out.println("Reparación exitosa! dispositivo funcionando!");
                
            } else {

                System.out.println("Intento de reparación fallido...");
                
            }

        }

    }

    public void reparacionAutomatica(){

        Random r = new Random();

        System.out.println("Intentando reparación automática...");

        for (Dispositivo dispositivo : dispositivos) {

            int num = r.nextInt(100) + 1;

            if (num > 30) {

                intentarRepararDispositivo(dispositivo);
                
            } else {

                System.out.println("ERROR CRITICO, DISPOSITIVO DESTRUIDO");

                dispositivo.setDestruido(true);

            }
            
        }

    }

    @Override
    public String toString() {
        return "Armadura [colorPrimario=" + colorPrimario + ", colorSecundario=" + colorSecundario + ", resistencia="
                + resistencia + ", salud=" + salud + ", botas=" + botas + ", guantes=" + guantes + ", consola="
                + consola + ", sintetizador=" + sintetizador + ", generador=" + generador + "]";
    }

}