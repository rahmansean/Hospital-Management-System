
package HospitalManagementSystem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AboutusController implements Initializable {

    @FXML
    private ImageView back;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    

    @FXML
    private void backAction(MouseEvent event) throws IOException {
        Parent SignedUp =FXMLLoader.load(getClass().getResource("MenuPage.fxml")); 
        Scene scr=new Scene(SignedUp);
        Stage menu=(Stage)((Node)event.getSource()).getScene().getWindow();
        menu.setScene(scr);                                                    
        menu.setTitle("Menu");
        menu.show();
    }
    
}
