/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Modelo.ConexionB;
import Modelo.Ventas;
import Modelo.DetalleVentas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author V330
 */
public class VentasDAO {
    ConexionB cn= new ConexionB();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
        
    public String IdVentas(){
        String idv="";
        String sql="Select max(idVenta) from ventas";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {                
                idv=rs.getString(1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return idv;
    }
    public int GuardarVenta(Ventas v){
        Ventas vent=new Ventas();
        String sql="insert into ventas(NumeroSerie,idCliente,idCuenta,fechaVenta,monto,estado) values (?,?,?,?,?,?)";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, v.getNumeroSerie());
            ps.setInt(2, v.getIdCliente());
            ps.setInt(3, v.getIdCuenta());
            ps.setString(4, v.getFechaVenta());
            ps.setDouble(5, v.getMonto());
            ps.setString(6, v.getEstado());
           r= ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
    public int GuardarDetalleVenta(DetalleVentas dv){
        String sql="insert into detalle_ventasventas(idVenta,idProducto,cantidad,precioVenta) values (?,?,?,?)";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, dv.getIdVenta());
            ps.setInt(2, dv.getIdProducto());
            ps.setInt(3, dv.getCant());
            ps.setDouble(4, dv.getPrecioVenta());
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
}
