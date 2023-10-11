
package HospitalManagementSystem;

import com.jfoenix.controls.JFXButton;
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
import javafx.stage.Stage;

public class MenuPageController implements Initializable {

    /*@FXML
    private ComboBox<String> aboutUscmbbox;
    ObservableList<String> list1=FXCollections.observableArrayList("Who We Are?");
    @FXML
    private ComboBox<String> forpatientscmbbox;
    ObservableList<String> list2=FXCollections.observableArrayList("Pateint Guide","Patient Information");
    @FXML
    private ComboBox<String> departmentscmbbox;
    ObservableList<String> list3=FXCollections.observableArrayList("Medicine","Heart","Surgery","Mother and Children");*/
    

    @FXML
    private JFXButton findDoctorbtn;
    @FXML
    private JFXButton LogOut;
    @FXML
    private JFXButton schedule;
    @FXML
    private JFXButton dgtest;
    @FXML
    private JFXButton aboutus;
    @FXML
    private JFXButton HealthQueriesBtn;
    @FXML
    private JFXButton departmentBTN;
    @FXML
    private JFXButton mdcnrmndrBTN;
    @FXML
    private JFXButton CheckOutBTN;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       //aboutUscmbbox.setItems(list1);
       //forpatientscmbbox.setItems(list2);
       //departmentscmbbox.setItems(list3);
    }    

    @FXML
    private void findDoctorbtnAction(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("FindDoctors.fxml"));     
        Scene scn=new Scene(root);
        Stage finding=(Stage)((Node)event.getSource()).getScene().getWindow();
        finding.setScene(scn);                                                    
        finding.setTitle("Finding Doctor");
        finding.show();
    }

    @FXML
    private void logoutActionbtn(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("Home.fxml"));     
        Scene scn=new Scene(root);
        Stage mp=(Stage)((Node)event.getSource()).getScene().getWindow();
        mp.setScene(scn);                                                    
        mp.setTitle("Finding Doctor");
        mp.show();
    }

    @FXML
    private void scheduleAction(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("Schedule.fxml"));     
        Scene scn=new Scene(root);
        Stage schedule=(Stage)((Node)event.getSource()).getScene().getWindow();
        schedule.setScene(scn);                                                    
        schedule.setTitle("Schedule Page");
        schedule.show();
    }

    @FXML
    private void aboutusAction(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("Aboutus.fxml"));     
        Scene scn=new Scene(root);
        Stage about=(Stage)((Node)event.getSource()).getScene().getWindow();
        about.setScene(scn);                                                    
        about.setTitle("About us Page");
        about.show();
    }
    
    @FXML
    private void HealthQueriesBtnAction(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("HealthQueries.fxml"));     
        Scene scn=new Scene(root);
        Stage mp=(Stage)((Node)event.getSource()).getScene().getWindow();
        mp.setScene(scn);                                                    
        mp.setTitle("Health Queries");
        mp.show();
    }

    @FXML
    private void dgtestAction(ActionEvent event) {
    }

    @FXML
    private void departmentBTNAction(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("Department.fxml"));     
        Scene scn=new Scene(root);
        Stage mp=(Stage)((Node)event.getSource()).getScene().getWindow();
        mp.setScene(scn);                                                    
        mp.setTitle("Department");
        mp.show();
    }

    @FXML
    private void mdcnrmndrBTNAction(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("PatientMedicine.fxml"));     
        Scene scn=new Scene(root);
        Stage mp=(Stage)((Node)event.getSource()).getScene().getWindow();
        mp.setScene(scn);                                                    
        mp.setTitle("Medicine Remainder");
        mp.show();
    }

    @FXML
    private void CheckOutBTNAction(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("PatientCheckout.fxml"));     
        Scene scn=new Scene(root);
        Stage about=(Stage)((Node)event.getSource()).getScene().getWindow();
        about.setScene(scn);                                                    
        about.setTitle("Checkout Page");
        about.show();
    }
    
    
}

