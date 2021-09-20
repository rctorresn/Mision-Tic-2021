
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
 
public class ControladorProducto {
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String USUARIO = "root";
    private static String PASSWORD = "1234";
    private static String URL = "jdbc:mysql://localhost:3306/basedatosproductos?useSSL = false &useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
   
    static{
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"error"+ e);
        }
    }
    public Connection getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL,USUARIO,PASSWORD);
            
            JOptionPane.showMessageDialog(null,"conectado");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"error"+ e);
        }
        return con;
    }
            
}
