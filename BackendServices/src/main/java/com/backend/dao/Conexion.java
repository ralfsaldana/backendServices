package com.backend.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import com.backend.util.PropiedadesConexionBD;

/**
 *
 * @author rsaldana
 */
public class Conexion {
      
    public Connection getConexion() {
        Connection con = null;
         try {                  
            Class.forName(PropiedadesConexionBD.DRIVER_BD);
            con = DriverManager.getConnection(PropiedadesConexionBD.CADENA_BD, 
                                              PropiedadesConexionBD.USER_BD, 
                                              PropiedadesConexionBD.PASSWORD_BD);
        } catch (Exception e) {
           e.printStackTrace();
        }
        return con;        
    }

}
