package HospitalManagementSystem;

import static HospitalManagementSystem.FindDoctorsController.Doc_dept;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class DoctorListController implements Initializable {

    @FXML
    private TableView<User> DoctorsListTable;
    @FXML
    private TableColumn<User, String> col_Id;
    @FXML
    private TableColumn<User, String> col_doctorsName;
    @FXML
    private TableColumn<User, String> col_qualification;
    @FXML
    private TableColumn<User,String> col_fees;

    private ObservableList<User> data;
    private DatabaseConnection dc;
    static String doctorName;
    static String dept;
    static int fees;
    @FXML
    private ImageView returnMP;
   

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if ("Eyes-Ears and Throat".equals(Doc_dept)) {
            Ent();
        } else if ("Heart".equals(Doc_dept)) {
            Cardiology();
        } else if ("Liver and Kidney".equals(Doc_dept)) {
            Nephrology();
        } else if ("Arthritis".equals(Doc_dept)) {
            Orthopedic();
        } else if ("Gastric".equals(Doc_dept)) {
            Gastrology();
        } else if ("Brain and Spinal".equals(Doc_dept)) {
            Neurology();
        } else if ("Diabetese".equals(Doc_dept)) {
            Diabetology();
        }
    }

    void Ent() {
        try {
            dc = new DatabaseConnection();
            Connection conn = dc.Connect();
            data = FXCollections.observableArrayList();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM ent");

            while (rs.next()) {

                 data.add(new User(rs.getInt("Id"), rs.getString("Name"), rs.getString("Qualification"),rs.getInt("ConsultationFees")));
            }
        } catch (SQLException ex) {
            System.out.println("Error:" + ex);
        }
        col_Id.setCellValueFactory(new PropertyValueFactory<>("Id"));
        col_doctorsName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        col_qualification.setCellValueFactory(new PropertyValueFactory<>("Qualification"));
        col_fees.setCellValueFactory(new PropertyValueFactory<>("ConsultationFees"));

        DoctorsListTable.setItems(null);
        DoctorsListTable.setItems(data);
    }

    void Cardiology() {
        try {
            dc = new DatabaseConnection();
            Connection conn = dc.Connect();
            data = FXCollections.observableArrayList();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM cardiology");

            while (rs.next()) {

                  data.add(new User(rs.getInt("Id"), rs.getString("Name"), rs.getString("Qualification"),rs.getInt("ConsultationFees")));
            }
        } catch (SQLException ex) {
            System.out.println("Error:" + ex);
        }
        col_Id.setCellValueFactory(new PropertyValueFactory<>("Id"));
        col_doctorsName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        col_qualification.setCellValueFactory(new PropertyValueFactory<>("Qualification"));
        col_fees.setCellValueFactory(new PropertyValueFactory<>("ConsultationFees"));

        DoctorsListTable.setItems(null);
        DoctorsListTable.setItems(data);
    }

    void Nephrology() {
        try {
            dc = new DatabaseConnection();
            Connection conn = dc.Connect();
            data = FXCollections.observableArrayList();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM nephrology");

            while (rs.next()) {

                 data.add(new User(rs.getInt("Id"), rs.getString("Name"), rs.getString("Qualification"),rs.getInt("ConsultationFees")));
            }
        } catch (SQLException ex) {
            System.out.println("Error:" + ex);
        }
        col_Id.setCellValueFactory(new PropertyValueFactory<>("Id"));
        col_doctorsName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        col_qualification.setCellValueFactory(new PropertyValueFactory<>("Qualification"));
        col_fees.setCellValueFactory(new PropertyValueFactory<>("ConsultationFees"));

        DoctorsListTable.setItems(null);
        DoctorsListTable.setItems(data);
    }

    void Orthopedic() {
        try {
            dc = new DatabaseConnection();
            Connection conn = dc.Connect();
            data = FXCollections.observableArrayList();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM orthopedics");

            while (rs.next()) {

                 data.add(new User(rs.getInt("Id"), rs.getString("Name"), rs.getString("Qualification"),rs.getInt("ConsultationFees")));
            }
        } catch (SQLException ex) {
            System.out.println("Error:" + ex);
        }
        col_Id.setCellValueFactory(new PropertyValueFactory<>("Id"));
        col_doctorsName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        col_qualification.setCellValueFactory(new PropertyValueFactory<>("Qualification"));
        col_fees.setCellValueFactory(new PropertyValueFactory<>("ConsultationFees"));

        DoctorsListTable.setItems(null);
        DoctorsListTable.setItems(data);
    }

    void Gastrology() {
        try {
            dc = new DatabaseConnection();
            Connection conn = dc.Connect();
            data = FXCollections.observableArrayList();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM gastroenterology");

            while (rs.next()) {

                 data.add(new User(rs.getInt("Id"), rs.getString("Name"), rs.getString("Qualification"),rs.getInt("ConsultationFees")));
            }
        } catch (SQLException ex) {
            System.out.println("Error:" + ex);
        }
        col_Id.setCellValueFactory(new PropertyValueFactory<>("Id"));
        col_doctorsName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        col_qualification.setCellValueFactory(new PropertyValueFactory<>("Qualification"));
        col_fees.setCellValueFactory(new PropertyValueFactory<>("ConsultationFees"));

        DoctorsListTable.setItems(null);
        DoctorsListTable.setItems(data);

    }

    void Neurology() {
        try {
            dc = new DatabaseConnection();
            Connection conn = dc.Connect();
            data = FXCollections.observableArrayList();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM neurology");

            while (rs.next()) {

                  data.add(new User(rs.getInt("Id"), rs.getString("Name"), rs.getString("Qualification"),rs.getInt("ConsultationFees")));
            }
        } catch (SQLException ex) {
            System.out.println("Error:" + ex);
        }
        col_Id.setCellValueFactory(new PropertyValueFactory<>("Id"));
        col_doctorsName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        col_qualification.setCellValueFactory(new PropertyValueFactory<>("Qualification"));
        col_fees.setCellValueFactory(new PropertyValueFactory<>("ConsultationFees"));

        DoctorsListTable.setItems(null);
        DoctorsListTable.setItems(data);
    }

    void Diabetology() {
        try {
            dc = new DatabaseConnection();
            Connection conn = dc.Connect();
            data = FXCollections.observableArrayList();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM diabetology");

            while (rs.next()) {

                data.add(new User(rs.getInt("Id"), rs.getString("Name"), rs.getString("Qualification"),rs.getInt("ConsultationFees")));
            }
        } catch (SQLException ex) {
            System.out.println("Error:" + ex);
        }
        col_Id.setCellValueFactory(new PropertyValueFactory<>("Id"));
        col_doctorsName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        col_qualification.setCellValueFactory(new PropertyValueFactory<>("Qualification"));
        col_fees.setCellValueFactory(new PropertyValueFactory<>("ConsultationFees"));

        DoctorsListTable.setItems(null);
        DoctorsListTable.setItems(data);
    }

    @FXML
    private void AppoinmentBtnAction(ActionEvent event) throws IOException {
        if (DoctorsListTable.getSelectionModel().getSelectedItem() != null) {
            User data = DoctorsListTable.getSelectionModel().getSelectedItem();
            doctorName = data.getName();
            fees=data.getConsultationFees();
            Parent MenuPage = FXMLLoader.load(getClass().getResource("Appoinment.fxml"));
            Scene scr = new Scene(MenuPage);
            Stage fmp = (Stage) ((Node) event.getSource()).getScene().getWindow();
            fmp.setScene(scr);
            fmp.setTitle("Menu Page");
            fmp.show();
        } else {
            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setContentText("Choose an option");
            a.show();
        }
    }

    @FXML
    private void returnMPAction(MouseEvent event) throws IOException {
        Parent MenuPage = FXMLLoader.load(getClass().getResource("FindDoctors.fxml"));
        Scene scr = new Scene(MenuPage);
        Stage fmp = (Stage) ((Node) event.getSource()).getScene().getWindow();
        fmp.setScene(scr);
        fmp.setTitle("Menu Page");
        fmp.show();

    }

}
