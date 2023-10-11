package HospitalManagementSystem;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {
    public Connection Connect() throws SQLException{
          
            try {
                String url="jdbc:mysql://127.0.0.1/database01";
                String user="root";
                String password="";
                
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection(url, user, password);
                return conn;
                
            } catch (ClassNotFoundException ex ) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        return null;
    }
}