package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionMysql {
    Connection cn;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/login_java_qsl", "root", "");
        } catch(Exception e) {
            System.out.println("ERROR DE CONEXION BD: " + e);
        }
        return cn;
    }
}
