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
public class Producto {
    int idProducto;
    int idCategoria;
    int idProveedor;
    int codBarras;
    String nombre;
    double precioCompra;
    double precioVenta;
    String FechaCaduc;
    int stock;
    String Estado;

    public Producto() {
    }

    public Producto(int idProducto, int idCategoria, int idProveedor, int codBarras, String nombre, double precioCompra, double precioVenta, String FechaCaduc, int stock, String Estado) {
        this.idProducto = idProducto;
        this.idCategoria = idCategoria;
        this.idProveedor = idProveedor;
        this.codBarras = codBarras;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.FechaCaduc = FechaCaduc;
        this.stock = stock;
        this.Estado = Estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(int codBarras) {
        this.codBarras = codBarras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getFechaCaduc() {
        return FechaCaduc;
    }

    public void setFechaCaduc(String FechaCaduc) {
        this.FechaCaduc = FechaCaduc;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
}
