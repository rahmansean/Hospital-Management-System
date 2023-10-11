package HospitalManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.scene.control.Alert;



public class Database {
    static String patientGender,patientMail,patientName;
    public boolean showData(String UD, String p, String gen, String email, String add) {
        String url = "jdbc:mysql://127.0.0.1/database01";
        String username = "root";
        String pass = "";
        boolean found = false;
        try {
            Connection conn = DriverManager.getConnection(url, username, pass);
            Statement stmt = conn.createStatement();
            String sql = "select Email from patient_info Where Email='" + email + "'";
            ResultSet res = stmt.executeQuery(sql);
            if (res.next()) {

                found = true;

            }
            if (found) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("Email already Used");
                a.show();
            } else {

                String sql2 = "insert into patient_info (UserName,Password,Gender,Email,Address) values (?,?,?,?,?)";
                PreparedStatement pstm = conn.prepareStatement(sql2);

                pstm.setString(1, UD);
                pstm.setString(2, p);
                pstm.setString(3, gen);
                pstm.setString(4, email);
                pstm.setString(5, add);

                pstm.executeUpdate();

                conn.close();

            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return found;

    }

    public boolean getData(String ui, String up) {
        String url = "jdbc:mysql://127.0.0.1/database01";
        String username = "root";
        String pass = "";
        boolean found = false;

        try {
            
                
                Connection conn = DriverManager.getConnection(url, username, pass);
                Statement stmt = conn.createStatement();
                String sqlEmail = "select Email from patient_info Where Email='" + ui + "'";
                ResultSet resEmail = stmt.executeQuery(sqlEmail);
                if (resEmail.next()) {
                    String sql = "select Email, Password from patient_info Where Email='" + ui + "' and Password='" + up + "'";
                    ResultSet res = stmt.executeQuery(sql);
                    if (res.next()) {
                        found = true;
                    } else {
                        Alert a = new Alert(Alert.AlertType.ERROR);
                        a.setContentText("Worng Password!");
                        a.show();
                    }
                } else {
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setContentText("Email Invalid!");
                    a.show();
                }

                conn.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return found;
    }

    
}
