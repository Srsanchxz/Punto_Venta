/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dani PC
 */
public class Conexion {
    
    public static Connection getConexion(){
        
        String url = "jdbc:sqlserver://DESKTOP-1MCDJFH:1433;" 
                + "database=Punto_Venta;"
                + "user=sa;"
                + "password=dani2000;";
        
        try{
            
            Connection con = DriverManager.getConnection(url);
            return con;
        
        }catch(SQLException e){
        
            System.out.println(e.toString());
            return null;
        }
    
    }
    
}
