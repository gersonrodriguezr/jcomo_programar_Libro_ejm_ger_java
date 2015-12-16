/*
 * La conexion con la BD en realidad es un socket
 * Si varios hilos comparten esta conexión, deben usarla sincronizadamente.
 */
package pkg47.jdbc.pkg4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author gerson
 */
public class BDManagement {
    private final static String driver = "com.mysql.jdbc.Driver";
    private final static String servidor = "jdbc:mysql://localhost:3306/gersonyoutubenico";//jdbc:mysql = por que estamos utilizando un driver jdbc  para mysql
    private final static String user = "root";
    private final static String pass = "GrsonRR357";
    
    
    private Connection conexion;//Se importa al libreria de java.mysql, no de com.mysql.jdbc, igual el de abajo.
    private Statement st;//para poder realizar cualquier accion sobre la bas de datos(consulta, insertar, etc.)
    
    public BDManagement(){
        try {
            Class.forName(driver);//Enlace en tiempo de ejecución
            conexion = DriverManager.getConnection(servidor, user, pass);//Establece la conexion con el servidor
            st = conexion.createStatement();//Insstanciamos al Statement
            System.out.println("Conexión exitosa");
        } catch (Exception e) {
            System.out.println("No se pudo conectar a la Base de datos");
        }
    }
    
    /*public void showAll(){
        try {
            ResultSet rs = st.executeQuery("SELECT * FROM PERSONAS");//En realidad ResultSet es una lista
            
            while (rs.next()) {
                System.out.println(rs.getString(1)+"|"+rs.getString(2)+"|"+rs.getString(3));
                
            }
        } catch (Exception e) {
            System.out.println("Error al realizar la consulta");
        }
    }*/
    
    public Statement getStatement(){
        return st;
    }
    
}
