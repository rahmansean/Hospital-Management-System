package HospitalManagementSystem;

import static HospitalManagementSystem.Database.patientGender;
import static HospitalManagementSystem.Database.patientMail;
import static HospitalManagementSystem.Database.patientName;
import static HospitalManagementSystem.DoctorListController.doctorName;
import static HospitalManagementSystem.DoctorListController.fees;
import static HospitalManagementSystem.FindDoctorsController.Doc_dept;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXListView;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import javafx.stage.Stage;
import javafx.util.Callback;

public class AppoinmentController implements Initializable { 
    @FXML
    private JFXButton appointmentcompleteField; //button
    @FXML
    private JFXComboBox<String> timeField;  //cmbbox
    @FXML
    private JFXListView<String> list; //list showing time
    @FXML
    private JFXDatePicker BirthField; //date picker birth
    @FXML
    private JFXDatePicker aptdate; //date of appointment  data picker

    ObservableList<String> list2 = FXCollections.observableArrayList("Morning", "Evening");
    ObservableList<String> list3 = FXCollections.observableArrayList();

    @FXML
    private Label AppointmentDone;
    @FXML
    private ImageView back;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        timeField.setItems(list2);
        list.setItems(list3);
        appointmentcompleteField.setVisible(true);
        BirthField.setDayCellFactory(param -> new DateCell() {
            @Override
            public void updateItem(LocalDate date, boolean empty) {
                super.updateItem(date, empty);
                setDisable(empty || date.compareTo(LocalDate.now()) > 0);
            }
        });
        aptdate.setDayCellFactory(param -> new DateCell() {
            @Override
            public void updateItem(LocalDate date, boolean empty) {
                super.updateItem(date, empty);
                setDisable(empty || date.compareTo(LocalDate.now()) < 0);
            }
        });


    }

    public DatabaseConnection dc;

    @FXML
    private void appointmentcompleteFieldAction(ActionEvent event) {

        try {
            
            if (BirthField.getValue() != null && list.getSelectionModel().getSelectedItem() != null && aptdate.getValue() != null) {
                
               
                LocalDate b = BirthField.getValue();
                String t = b.toString();

                String s = list.getSelectionModel().getSelectedItem();
                LocalDate c = aptdate.getValue();
                String u = c.toString();
                
              
                
                dc = new DatabaseConnection();
                Connection conn = dc.Connect();

        
                String sql = "Insert into appointmenttable (UserName,Gender,Email,Birth,Slot,AptDate,DoctorName,Department,Fees) values(?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst = conn.prepareStatement(sql);

                pst.setString(1, patientName);
                pst.setString(2, patientGender);
                pst.setString(3, patientMail);
                pst.setString(4, t);
                pst.setString(5, s);
                pst.setString(6, u);
                pst.setString(7, doctorName);
                pst.setString(8, Doc_dept);
                pst.setInt(9, fees);

                pst.executeUpdate();
             
                conn.close();
                
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Appointment");

                // Header Text: null
                alert.setHeaderText(null);
                alert.setContentText("Appointment Taken Successfully!");
 
                alert.showAndWait();
                //AppointmentDone.setText("    -Appointment Done-    ");

                System.out.println("Done");
                appointmentcompleteField.setVisible(false);
            } else {
                Alert a = new Alert(Alert.AlertType.WARNING);
                a.setContentText("Please choose every Field");
                a.show();
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    @FXML
    private void timeFieldAction(ActionEvent event) {
        if (timeField.getValue() == "Evening") {
            list.getItems().clear();
            System.out.println("Evening");
            list.getItems().addAll("3:30 PM - 03:45 PM", "03:45 PM - 04:00 PM", "04:15 PM - 04:30 PM", "04:45 PM - 05:00 PM");
        } else if (timeField.getValue() == "Morning") {
            list.getItems().clear();
            list.getItems().addAll("10:30 AM - 10:45 AM", "10:45 AM - 11:00 AM", "11:00 AM - 11:15 AM", "11:15 AM - 11:30 AM");
        }
    }

    @FXML
    private void BirthFieldAction(ActionEvent event) {
    }

    @FXML
    private void aptdateAction(ActionEvent event) {
    }

    @FXML
    private void backAction(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FindDoctors.fxml"));
        Scene scn = new Scene(root);
        Stage about = (Stage) ((Node) event.getSource()).getScene().getWindow();
        about.setScene(scn);
        about.setTitle("Find Doctors Page");
        about.show();
    }

}
