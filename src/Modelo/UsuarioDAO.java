
package Modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class UsuarioDAO extends ConexionB{

    public boolean registrar(UsuarioM usr){
        PreparedStatement ps=null;
        Connection con=getConnection();
        String sql="INSERT INTO cuenta (idCuenta, nombre, user, pass, rol, estado) VALUES(?,?,?,?,?,?)";
        
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1,usr.getIdU());
            ps.setString(2,usr.getNombre());
            ps.setString(3,usr.getUsuario());
            ps.setString(4,usr.getClave());
            ps.setString(5,usr.getPerfil());
            ps.setString(6,usr.getEstado());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public int existeUsuario(String user){
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=getConnection();
        String sql="SELECT count(idCuenta) FROM cuenta WHERE user=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,user);
            rs=ps.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }
    
    public boolean login(UsuarioM usr){
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=getConnection();
        
        String sql="SELECT idCuenta, nombre, user, pass, rol, estado FROM cuenta WHERE user=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,usr.getUsuario());
            rs=ps.executeQuery();
            
            if(rs.next()){
                if(usr.getClave().equals(rs.getString(4))){
                    usr.setIdU(rs.getInt(1));
                    usr.setNombre(rs.getString(2));
                    usr.setPerfil(rs.getString(5));
                    usr.setEstado(rs.getString(6));
                    return true;
                }else{
                    return false;
                }
            }
          return false;
          
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
     public boolean modificar(UsuarioM usr){
        PreparedStatement ps=null;
        Connection con=getConnection();
        String sql="CALL UpdatePersona (?,?,?,?,?,?)";
        
        try {
            ps=con.prepareStatement(sql);
            ps.setString(2,usr.getNombre());
            ps.setString(3,usr.getUsuario());
            ps.setString(4,usr.getClave());
            ps.setString(5,usr.getPerfil());
            ps.setString(6,usr.getEstado());
              ps.setInt(1,usr.getIdU());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
     }
        
     
    
}
