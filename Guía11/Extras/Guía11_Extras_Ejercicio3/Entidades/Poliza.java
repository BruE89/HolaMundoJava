package Entidades;

import java.sql.Date;

public class Poliza {

    private Cliente cliente;

    private Vehiculo vehiculo;

    private int numeroPoliza, cantidadCuotas, montoAsegurado, montoMaximoGranizo;

    private Date fechaInicio, fechaFin;

    private String formaPago, incluyeGranizo, tipoCobertura;

    public Poliza() {
    }

    public Poliza(Cliente cliente, Vehiculo vehiculo, int numeroPoliza, int cantidadCuotas, int montoAsegurado,
            int montoMaximoGranizo, Date fechaInicio, Date fechaFin, String formaPago, String incluyeGranizo,
            String tipoCobertura) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.numeroPoliza = numeroPoliza;
        this.cantidadCuotas = cantidadCuotas;
        this.montoAsegurado = montoAsegurado;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.formaPago = formaPago;
        this.incluyeGranizo = incluyeGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public int getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(int montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public int getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(int montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(String incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public String toString() {
        return "Poliza [cliente=" + cliente + ", vehiculo=" + vehiculo + ", numeroPoliza=" + numeroPoliza
                + ", cantidadCuotas=" + cantidadCuotas + ", montoAsegurado=" + montoAsegurado + ", montoMaximoGranizo="
                + montoMaximoGranizo + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", formaPago="
                + formaPago + ", incluyeGranizo=" + incluyeGranizo + ", tipoCobertura=" + tipoCobertura + "]";
    }

}