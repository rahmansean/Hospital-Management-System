package HospitalManagementSystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ForgotPasswordController implements Initializable {

    @FXML
    private JFXTextField UserName;
    @FXML
    private JFXTextField Email;
    @FXML
    private JFXButton recoverbtn;
    @FXML
    private JFXPasswordField RecoverPassword;
    @FXML
    private ImageView UserNameError;
    @FXML
    private ImageView EmailError;
    @FXML
    private ImageView PasswordError;
    @FXML
    private JFXButton Loginbtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void recoverbtnAction(ActionEvent event) throws IOException {
        //sql
        String url = "jdbc:mysql://127.0.0.1/database01";
        String username = "root";
        String pass = "";
        //inputs
        String user = UserName.getText();
        String mail = Email.getText();
        String passwrd = RecoverPassword.getText();
        //cheching password
        boolean PassFormat = Pattern.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}", passwrd);
        
        boolean done = false;

        FileInputStream fis = new FileInputStream("C:\\Users\\User.User-PC\\Desktop\\2.1\\sd\\mid\\Hospital Management System\\src\\Image\\error-icon-14-256.png");
        Image image = new Image(fis);
        
        

        try {
            Connection conn = DriverManager.getConnection(url, username, pass);
            Statement stmt = conn.createStatement();
            String sql = "select *from patient_info";
            ResultSet res = stmt.executeQuery(sql);
            while (res.next()) {
                if (res.getString("UserName").equals(user) && res.getString("Email").equals(mail)) {

                    done = true;

                    break;
                }

            }
            if (done) {
                if ( PassFormat) {

                    
                    PasswordError.setImage(null);
                    //hash
                    String hashPswrd= DigestUtils.shaHex(passwrd);
                    //SQL UPdate
                    String qr = "UPDATE patient_info SET Password=? WHERE UserName=? ";
                    PreparedStatement pstmt = conn.prepareStatement(qr);
                    pstmt.setString(1, hashPswrd);
                    pstmt.setString(2, user);
                    pstmt.executeUpdate();
                    
                    //node
                    Parent SignedUp = FXMLLoader.load(getClass().getResource("Home.fxml"));
                    Scene scr = new Scene(SignedUp);
                    Stage signedup = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    signedup.setScene(scr);
                    signedup.setTitle("Hospital Management System");
                    signedup.show();
                } else {

                    
                    if (!PassFormat) {
                        PasswordError.setImage(image);
                    }
                    if (PassFormat) {
                        PasswordError.setImage(null);
                    }
                }
            } else {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setContentText("Wrong Email or UserName!");
                error.show();

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    private void loginbtnAction(ActionEvent event) throws IOException {
                    Parent SignedUp = FXMLLoader.load(getClass().getResource("Home.fxml"));
                    Scene scr = new Scene(SignedUp);
                    Stage signedup = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    signedup.setScene(scr);
                    signedup.setTitle("Hospital Management System");
                    signedup.show();
    }
}
