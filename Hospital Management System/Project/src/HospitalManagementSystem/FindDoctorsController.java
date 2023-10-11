
package HospitalManagementSystem;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class FindDoctorsController implements Initializable {

    @FXML
    private ImageView returnMP;
    @FXML
    private JFXComboBox<String> selectSymptomscmbbox;
    ObservableList<String> list1=FXCollections.observableArrayList("Heart","Arthritis","Eyes-Ears and Throat","Gastric",
                                                                    "Liver and Kidney","Brain and Spinal","Diabetese");
    @FXML
    private JFXButton SelectDocSearchBTN;
    
    static String Doc_dept;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selectSymptomscmbbox.setItems(list1);
         
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

    @FXML
     private void SelectDocSearchBTNAction(ActionEvent event) throws IOException {

        Doc_dept=selectSymptomscmbbox.getValue();
        if(Doc_dept!=null){
        Parent SelectdocPage = FXMLLoader.load(getClass().getResource("DoctorList.fxml"));
            Scene scr = new Scene(SelectdocPage);
            Stage fmp = (Stage) ((Node) event.getSource()).getScene().getWindow();
            fmp.setScene(scr);
            fmp.setTitle("Menu Page");
            fmp.show();
        }
        else {
            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setContentText("Choose an option");
            a.show();
        }
    }
    
}
