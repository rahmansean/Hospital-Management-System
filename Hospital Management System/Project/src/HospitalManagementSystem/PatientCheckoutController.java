package HospitalManagementSystem;

import static HospitalManagementSystem.DoctorListController.doctorName;
import static HospitalManagementSystem.DoctorListController.fees;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class PatientCheckoutController implements Initializable {

    @FXML
    private Label DoctorNameLabel;
    @FXML
    private Label FeesLabel;
    @FXML
    private ImageView returnMP;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      DoctorNameLabel.setText(doctorName);
      FeesLabel.setText(Integer.toString(fees)+ " Taka only");
    }    

    @FXML
    private void returnMPAction(MouseEvent event) throws IOException {
        Parent MenuPage =FXMLLoader.load(getClass().getResource("MenuPage.fxml")); 
        Scene scr=new Scene(MenuPage);
        Stage fmp=(Stage)((Node)event.getSource()).getScene().getWindow();
        fmp.setScene(scr);                                                    
        fmp.setTitle("Menu Page");
        fmp.show();
    }
    
}
