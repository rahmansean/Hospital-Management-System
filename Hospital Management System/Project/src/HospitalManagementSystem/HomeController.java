/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagementSystem;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * FXML Controller class
 *
 * @author Rbkar
 */
public class HomeController implements Initializable {

    @FXML
    private JFXButton sign_up;
    @FXML
    private JFXButton PatientLogin;
    private JFXTextField userInput;
    @FXML
    private JFXPasswordField userPassword;
    @FXML
    private JFXTextField Email;
    @FXML
    private ImageView AdminEmail;
    @FXML
    private JFXButton ForgotPswrd;
    @FXML
    private JFXButton AdminLoginBTN;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    

    @FXML
    private void signupbtnAction(ActionEvent event) throws IOException {
        Parent SignUp =FXMLLoader.load(getClass().getResource("LoginMain.fxml")); 
        Scene scr=new Scene(SignUp);
        Stage signup=(Stage)((Node)event.getSource()).getScene().getWindow();
        signup.setScene(scr);                                                    
        signup.setTitle("Sign Up");
        signup.show();
    }

    @FXML
    private void patientLoginbtnAction(ActionEvent event) throws IOException {
        
        String ui=Email.getText();
        String up= userPassword.getText();
        String hp= DigestUtils.shaHex(up);
        Database db= new Database();
        boolean match=db.getData(ui, hp);
        if(match){
            
        Parent MenuPage =FXMLLoader.load(getClass().getResource("MenuPage.fxml")); 
        Scene scr=new Scene(MenuPage);
        Stage mp=(Stage)((Node)event.getSource()).getScene().getWindow();
        mp.setScene(scr);                                                    
        mp.setTitle("Sign Up");
        mp.show();
        }
        else{
        Alert error = new Alert(Alert.AlertType.WARNING);
            error.setContentText("Wrong Email or Password!");
            error.show();
        }
        
        
    }

    @FXML
    private void ForgotPassBtn(ActionEvent event) throws IOException {
        Parent Frgtpswrd =FXMLLoader.load(getClass().getResource("Forgot Password.fxml")); 
        Scene scr=new Scene(Frgtpswrd);
        Stage fp=(Stage)((Node)event.getSource()).getScene().getWindow();
        fp.setScene(scr);                                                    
        fp.setTitle("Recovery Password");
        fp.show();
    }

    @FXML
    private void AdminLoginBTNAtion(ActionEvent event) throws IOException {
    
     Parent Frgtpswrd =FXMLLoader.load(getClass().getResource("AdminMenuPage.fxml")); 
        Scene scr=new Scene(Frgtpswrd);
        Stage fp=(Stage)((Node)event.getSource()).getScene().getWindow();
        fp.setScene(scr);                                                    
        fp.setTitle("Menu Page");
        fp.show();
    }
}
