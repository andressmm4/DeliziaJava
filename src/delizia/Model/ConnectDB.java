package delizia.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectDB {

    public static Connection connect() {
        Connection con = null;
        try {
            con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/delizia", "root", "");
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
            System.out.println("Successful Connection");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}