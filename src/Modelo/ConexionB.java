/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HEYDI
 */
public class ConexionB {
    Connection con;
    String conexionMysql = "com.mysql.jdbc.Driver";
    String urlMysql = "jdbc:mysql://localhost:3306/bdfarmacia";
    String userMysql = "root";
    String passMysql = "heydi";
    public Connection getConnection(){
        try {
            Class.forName(conexionMysql);
            con =DriverManager.getConnection(urlMysql,userMysql,passMysql);
        } catch (Exception e) {
            System.err.println("Error:"+e);
        }
        return con;
    }
}
