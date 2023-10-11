package HospitalManagementSystem;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * FXML Controller class
 *
 * @author User
 */
public class LoginMainController implements Initializable {

    @FXML
    private JFXButton SignUp;
    @FXML
    private JFXTextField UserName;
    @FXML
    private ToggleGroup Gender;
    @FXML
    private JFXPasswordField Password;
    @FXML
    private JFXRadioButton Male;
    @FXML
    private JFXRadioButton Female;
    @FXML
    private JFXTextArea Address;
    @FXML
    private JFXRadioButton Other;
    @FXML
    private JFXTextField Email;
    @FXML
    private ImageView UserNameError;
    @FXML
    private ImageView PasswordError;
    @FXML
    private ImageView EmailError;
    @FXML
    private ImageView GenderError;
    @FXML
    private ImageView AdrsError;
    @FXML
    private JFXButton loginbtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void signedUpbtnAction(ActionEvent event) throws IOException {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\User.User-PC\\Desktop\\2.1\\sd\\mid\\Hospital Management System\\src\\Image\\error-icon-14-256.png");
            Image image = new Image(fis);

            String un = UserName.getText();
            String pass = Password.getText();
            RadioButton selectedRadioButton = (RadioButton) Gender.getSelectedToggle();
            String gender = selectedRadioButton.getText();
            String e = Email.getText();
            String addr = Address.getText();
            boolean unsuccess = true;
            
            boolean UserNameFormat = false, EmailFormat = false, PassFormat = false, AdrsFormat = false, genderFormat = false;
            UserNameFormat = Pattern.matches("([^.\\s]([a-zA-Z\\.]){1,}\\s[a-zA-Z]{1,}\\s?([a-zA-Z]{1,})\\s?([a-zA-Z]{1,})?)", un);
            EmailFormat = Pattern.matches("[^.\\s][a-z0-9\\.\\_]{3,64}@([a-z]){2,50}.[a-z]{2,}", e);
            PassFormat = Pattern.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}", pass);
            AdrsFormat = Pattern.matches("[\\w\\.\\s\\/\\-\\,]{5,50}", addr);
            genderFormat = selectedRadioButton.isSelected();

            if (UserNameFormat && EmailFormat && PassFormat && AdrsFormat && genderFormat) {
                Database db = new Database();
                UserNameError.setImage(null);
                EmailError.setImage(null);
                PasswordError.setImage(null);
                AdrsError.setImage(null);
                GenderError.setImage(null);
                
                String hashPswrd= DigestUtils.shaHex(pass);

                unsuccess = db.showData(un, hashPswrd, gender, e, addr);

                if (!unsuccess) {
                    Parent SignedUp = FXMLLoader.load(getClass().getResource("Home.fxml"));
                    Scene scr = new Scene(SignedUp);
                    Stage signedup = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    signedup.setScene(scr);
                    signedup.setTitle("Hospital Management System");
                    signedup.show();
                }
            } else {

                if (!UserNameFormat) {

                    UserNameError.setImage(image);
                }
                if (UserNameFormat) {
                    UserNameError.setImage(null);
                }
                if (!EmailFormat) {

                    EmailError.setImage(image);
                }
                if (EmailFormat) {
                    EmailError.setImage(null);
                }

                if (!PassFormat) {
                    PasswordError.setImage(image);
                }
                if (PassFormat) {
                    PasswordError.setImage(null);
                }
                if (!AdrsFormat) {
                    AdrsError.setImage(image);
                }
                if (AdrsFormat) {
                    AdrsError.setImage(null);
                }
                if (!genderFormat) {
                    GenderError.setImage(image);
                }
                if (genderFormat) {
                    GenderError.setImage(null);
                }

            }

        } catch (Exception ex) {
           
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("Please Insert All Information");
            a.show();
        }
    }

    @FXML
    private void LoginbtnAction(ActionEvent event) throws IOException {
        Parent SignedUp = FXMLLoader.load(getClass().getResource("Home.fxml"));
                    Scene scr = new Scene(SignedUp);
                    Stage signedup = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    signedup.setScene(scr);
                    signedup.setTitle("Hospital Management System");
                    signedup.show();
    }

}
