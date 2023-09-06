package conexaojavapenis;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {
    
    public Connection conectaDB(){
        Connection conn = null;
            try {
                String url = "jdbc:mysql://localhost:3306/trolha?user=root&password=";
                conn = DriverManager.getConnection(url);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return conn;
    }
    
}
