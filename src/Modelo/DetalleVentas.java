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
public class DetalleVentas {
    int idDetalleVent;
    int idVenta;
    int idProducto;
    int cant;
    double precioVenta;

    public DetalleVentas() {
    }

    public DetalleVentas(int idDetalleVent, int idVenta, int idProducto, int cant, double precioVenta) {
        this.idDetalleVent = idDetalleVent;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.cant = cant;
        this.precioVenta = precioVenta;
    }

    public int getIdDetalleVent() {
        return idDetalleVent;
    }

    public void setIdDetalleVent(int idDetalleVent) {
        this.idDetalleVent = idDetalleVent;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
}
