
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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DepartmentController implements Initializable {

    @FXML
    private JFXButton c;
    @FXML
    private Label label;
    @FXML
    private JFXButton n;
    @FXML
    private JFXButton nu;
    @FXML
    private JFXButton g;
    @FXML
    private JFXButton o;
    @FXML
    private JFXButton d;
    @FXML
    private JFXButton e;
    @FXML
    private ImageView back;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private AnchorPane anchor2;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void Actionc(ActionEvent event) {
        label.setText("Cardiology is a branch of medicine that deals with the disorders of the ");
        anchor2.setVisible(true);
        label2.setVisible(true);
        label2.setText("heart as well as some parts of the circulatory system.");
    }

    @FXML
    private void Actionn(ActionEvent event) {
        label.setText("Nephrology is a specialty of medicine and pediatric medicine");
        anchor2.setVisible(true);
         label2.setVisible(true);
        label2.setText("that concerns with study of the kidneys.");
    }

    @FXML
    private void Actionnu(ActionEvent event) {
        label.setText("Neurology is a branch of medicine dealing with ");
        anchor2.setVisible(true);
        label2.setVisible(true);
        label2.setText("disorders of the nervous system.");
    }
    

    @FXML
    private void Actiong(ActionEvent event) {
        label.setText("Gastroenterology is the branch of medicine focused on the ");
        anchor2.setVisible(true);
        label2.setVisible(true);
        label2.setText("digestive system and its disorders. ");
    }

    @FXML
    private void Actiono(ActionEvent event) {
        label.setText("Orthopedic department works for the prevention,diagnosis,");
        anchor2.setVisible(true);
        label2.setVisible(true);
        label2.setText("treatment of disorders of the bones,ligaments,tendons,muscles.");
    }

    @FXML
    private void Actiond(ActionEvent event) {
        label.setText("Diabetology department deals with the problem of diabetes.");
        label2.setVisible(false);
        anchor2.setVisible(false);
    }

    @FXML
    private void Actione(ActionEvent event) {
        label.setText("Ear, Nose, Throat, Head & Neck are the things that are matter.");
        label2.setText("for concern for this department.");
        label2.setVisible(false);
        anchor2.setVisible(false);
          
    }

    @FXML
    private void ActionBack(MouseEvent event) throws IOException {
        Parent MenuPage = FXMLLoader.load(getClass().getResource("MenuPage.fxml"));
        Scene scr = new Scene(MenuPage);
        Stage fmp = (Stage) ((Node) event.getSource()).getScene().getWindow();
        fmp.setScene(scr);
        fmp.setTitle("Menu Page");
        fmp.show();
    }

    
     
    
    
}
