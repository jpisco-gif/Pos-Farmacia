/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author V330
 */
public class Conexion {

    Connection con;
    String url="jdbc:mysql://localhost:3306/gesdoc?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "Peruano2020");
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        return con;
    }
}
