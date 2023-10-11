
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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AdminMenuPageController implements Initializable {

    @FXML
    private JFXButton ScheduleBTN;
    @FXML
    private ImageView back;
    @FXML
    private JFXButton DoctorBTN;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void ScheduleBTN(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("AdminPatientSchedule.fxml"));     
        Scene scn=new Scene(root);
        Stage about=(Stage)((Node)event.getSource()).getScene().getWindow();
        about.setScene(scn);                                                    
        about.setTitle("Schedule Page");
        about.show();
        
    }

    @FXML
    private void backAction(MouseEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("Home.fxml"));     
        Scene scn=new Scene(root);
        Stage about=(Stage)((Node)event.getSource()).getScene().getWindow();
        about.setScene(scn);                                                    
        about.setTitle("Login Page");
        about.show();
    }

    @FXML
    private void DoctorBTNAction(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("AdminDocList.fxml"));     
        Scene scn=new Scene(root);
        Stage about=(Stage)((Node)event.getSource()).getScene().getWindow();
        about.setScene(scn);                                                    
        about.setTitle("Login Page");
        about.show();
    }
    
}
