/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author V330
 */
public class Ventas {
    int idVenta;
    String NumeroSerie;
    int idCliente;
    int idCuenta;
    String fechaVenta;
    double monto;
    String estado;

    public Ventas() {
    }

    public Ventas(int idVenta, String NumeroSerie, int idCliente, int idCuenta, String fechaVenta, double monto, String estado) {
        this.idVenta = idVenta;
        this.NumeroSerie = NumeroSerie;
        this.idCliente = idCliente;
        this.idCuenta = idCuenta;
        this.fechaVenta = fechaVenta;
        this.monto = monto;
        this.estado = estado;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getNumeroSerie() {
        return NumeroSerie;
    }

    public void setNumeroSerie(String NumeroSerie) {
        this.NumeroSerie = NumeroSerie;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
