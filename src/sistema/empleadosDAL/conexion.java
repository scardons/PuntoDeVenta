/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.empleadosDAL;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Santiago
 */
public class conexion {
    String strConxionDB = "jdbc:sqlite:C:/Users/Santiago/Desktop/sqliteadmin/sistema.s3db"; //con ctrl + espacio autollena la palabra
    Connection conn = null; // por que no me deja crear clases = primero hay que import
    
    
    
    
    public conexion(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn = (Connection) DriverManager.getConnection(strConxionDB);
            
            System.out.println("conexion establecida");
            
        } catch (Exception e) {
            
            System.out.println("error de conexion"+e);
        }
        
    }
    // instruccion para conectar a la base de datos el boton de agregar
    public int ejecturSentenciaSQL(String strSentenciaSQL){
        
        try {
            PreparedStatement pstm=conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
            
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    
    }
    // metodo para recuperar datos
    public ResultSet consultarRegistos(String strSentenciaSQL){
    
        try {
            PreparedStatement pstm=conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta= pstm.executeQuery();
            return respuesta;
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
}
