package HospitalManagementSystem;

import static HospitalManagementSystem.DoctorListController.doctorName;
import static HospitalManagementSystem.FindDoctorsController.Doc_dept;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Rbkar
 */
public class AdminDocListController implements Initializable {

    @FXML
    private JFXComboBox<String> DepartmentSelectBox;
    ObservableList<String> list1 = FXCollections.observableArrayList("Cardiology", "Ent", "Orhtopedic", "Gastroenterology",
            "Nephrology", "Neurology", "Diabetology");

    @FXML
    private TableView<User> AdminDoctorList;
    @FXML
    private TableColumn<User, String> col_Id;
    @FXML
    private TableColumn<User, String> col_doctorsName;
    @FXML
    private TableColumn<User, String> col_qualification;
    @FXML
    private TableColumn<User, String> col_fees;

    private ObservableList<User> data;
    private DatabaseConnection dc;
    @FXML
    private ImageView returnMP;
    @FXML
    private JFXButton RemoveBtn;

    static String docList;

    static int idNo;
    @FXML
    private JFXButton AddBtn;
    @FXML
    private JFXButton RefreshBtn;
    @FXML
    private JFXButton UpdateBtn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        DepartmentSelectBox.setItems(list1);

        DepartmentSelectBox.setOnAction(e -> getInfo());//lambda action bujachhe
    }

    void getInfo() {
        docList = DepartmentSelectBox.getValue();

        if (docList != null) {
            if ("Cardiology".equals(docList)) {
                Cardiology();
            } else if ("Ent".equals(docList)) {
                Ent();
            } else if ("Orhtopedic".equals(docList)) {

                Orthopedic();
            } else if ("Gastroenterology".equals(docList)) {
                Gastrology();
            } else if ("Nephrology".equals(docList)) {

                Nephrology();
            } else if ("Neurology".equals(docList)) {
                Neurology();
            } else if ("Diabetology".equals(docList)) {
                Diabetology();
            }
        }
    }

    void Ent() {
        try {
            dc = new DatabaseConnection();
            Connection conn = dc.Connect();
            data = FXCollections.observableArrayList();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM ent");

            while (rs.next()) {

                data.add(new User(rs.getInt("Id"), rs.getString("Name"), rs.getString("Qualification"), rs.getInt("ConsultationFees")));
            }
        } catch (SQLException ex) {
            System.out.println("Error:" + ex);
        }
        col_Id.setCellValueFactory(new PropertyValueFactory<>("Id"));
        col_doctorsName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        col_qualification.setCellValueFactory(new PropertyValueFactory<>("Qualification"));
        col_fees.setCellValueFactory(new PropertyValueFactory<>("ConsultationFees"));

        AdminDoctorList.setItems(null);
        AdminDoctorList.setItems(data);
    }

    void Cardiology() {
        try {
            dc = new DatabaseConnection();
            Connection conn = dc.Connect();
            data = FXCollections.observableArrayList();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM cardiology");

            while (rs.next()) {

                data.add(new User(rs.getInt("Id"), rs.getString("Name"), rs.getString("Qualification"), rs.getInt("ConsultationFees")));
            }
        } catch (SQLException ex) {
            System.out.println("Error:" + ex);
        }
        col_Id.setCellValueFactory(new PropertyValueFactory<>("Id"));
        col_doctorsName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        col_qualification.setCellValueFactory(new PropertyValueFactory<>("Qualification"));
        col_fees.setCellValueFactory(new PropertyValueFactory<>("ConsultationFees"));

        AdminDoctorList.setItems(null);
        AdminDoctorList.setItems(data);
    }

    void Nephrology() {
        try {
            dc = new DatabaseConnection();
            Connection conn = dc.Connect();
            data = FXCollections.observableArrayList();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM nephrology");

            while (rs.next()) {

                data.add(new User(rs.getInt("Id"), rs.getString("Name"), rs.getString("Qualification"), rs.getInt("ConsultationFees")));
            }
        } catch (SQLException ex) {
            System.out.println("Error:" + ex);
        }
        col_Id.setCellValueFactory(new PropertyValueFactory<>("Id"));
        col_doctorsName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        col_qualification.setCellValueFactory(new PropertyValueFactory<>("Qualification"));
        col_fees.setCellValueFactory(new PropertyValueFactory<>("ConsultationFees"));

        AdminDoctorList.setItems(null);
        AdminDoctorList.setItems(data);
    }

    void Orthopedic() {
        try {
            dc = new DatabaseConnection();
            Connection conn = dc.Connect();
            data = FXCollections.observableArrayList();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM orthopedics");

            while (rs.next()) {

                data.add(new User(rs.getInt("Id"), rs.getString("Name"), rs.getString("Qualification"), rs.getInt("ConsultationFees")));
            }
        } catch (SQLException ex) {
            System.out.println("Error:" + ex);
        }
        col_Id.setCellValueFactory(new PropertyValueFactory<>("Id"));
        col_doctorsName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        col_qualification.setCellValueFactory(new PropertyValueFactory<>("Qualification"));
        col_fees.setCellValueFactory(new PropertyValueFactory<>("ConsultationFees"));

        AdminDoctorList.setItems(null);
        AdminDoctorList.setItems(data);
    }

    void Gastrology() {
        try {
            dc = new DatabaseConnection();
            Connection conn = dc.Connect();
            data = FXCollections.observableArrayList();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM gastroenterology");

            while (rs.next()) {

                data.add(new User(rs.getInt("Id"), rs.getString("Name"), rs.getString("Qualification"), rs.getInt("ConsultationFees")));
            }
        } catch (SQLException ex) {
            System.out.println("Error:" + ex);
        }
        col_Id.setCellValueFactory(new PropertyValueFactory<>("Id"));
        col_doctorsName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        col_qualification.setCellValueFactory(new PropertyValueFactory<>("Qualification"));
        col_fees.setCellValueFactory(new PropertyValueFactory<>("ConsultationFees"));

        AdminDoctorList.setItems(null);
        AdminDoctorList.setItems(data);

    }

    void Neurology() {
        try {
            dc = new DatabaseConnection();
            Connection conn = dc.Connect();
            data = FXCollections.observableArrayList();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM neurology");

            while (rs.next()) {

                data.add(new User(rs.getInt("Id"), rs.getString("Name"), rs.getString("Qualification"), rs.getInt("ConsultationFees")));
            }
        } catch (SQLException ex) {
            System.out.println("Error:" + ex);
        }
        col_Id.setCellValueFactory(new PropertyValueFactory<>("Id"));
        col_doctorsName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        col_qualification.setCellValueFactory(new PropertyValueFactory<>("Qualification"));
        col_fees.setCellValueFactory(new PropertyValueFactory<>("ConsultationFees"));

        AdminDoctorList.setItems(null);
        AdminDoctorList.setItems(data);
    }

    void Diabetology() {
        try {
            dc = new DatabaseConnection();
            Connection conn = dc.Connect();
            data = FXCollections.observableArrayList();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM diabetology");

            while (rs.next()) {

                data.add(new User(rs.getInt("Id"), rs.getString("Name"), rs.getString("Qualification"), rs.getInt("ConsultationFees")));
            }
        } catch (SQLException ex) {
            System.out.println("Error:" + ex);
        }
        col_Id.setCellValueFactory(new PropertyValueFactory<>("Id"));
        col_doctorsName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        col_qualification.setCellValueFactory(new PropertyValueFactory<>("Qualification"));
        col_fees.setCellValueFactory(new PropertyValueFactory<>("ConsultationFees"));

        AdminDoctorList.setItems(null);
        AdminDoctorList.setItems(data);
    }

    @FXML
    private void returnMPAction(MouseEvent event) throws IOException {
        Parent MenuPage = FXMLLoader.load(getClass().getResource("AdminMenuPage.fxml"));
        Scene scr = new Scene(MenuPage);
        Stage fmp = (Stage) ((Node) event.getSource()).getScene().getWindow();
        fmp.setScene(scr);
        fmp.setTitle("Admin Menu Page");
        fmp.show();

    }

    @FXML
    private void RemoveBtnAction(ActionEvent event) {
        if (AdminDoctorList.getSelectionModel().getSelectedItem() != null) {
            if ("Cardiology".equals(docList)) {
                CardiologyRemove();
            } else if ("Ent".equals(docList)) {
                EntRemove();
            } else if ("Orhtopedic".equals(docList)) {
                OrthopedicRemove();
            } else if ("Gastroenterology".equals(docList)) {
                GastricRemove();
            } else if ("Nephrology".equals(docList)) {
                NephrologyRemove();
            } else if ("Neurology".equals(docList)) {
                NeurologyRemove();
            } else if ("Diabetology".equals(docList)) {
                DiabetologyRemove();
            }
        } else {

            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setContentText("Choose an option");
            a.show();
        }
    }

    void CardiologyRemove() {
        User data = AdminDoctorList.getSelectionModel().getSelectedItem();
        int id = data.getId();

        try {
            dc = new DatabaseConnection();
            Connection conn = dc.Connect();

            String sql = "delete from cardiology where Id=?";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.execute();
            conn.close();

            AdminDoctorList.getItems().remove(data);
            System.out.println("SuccessfulIF");

        } catch (SQLException ex) {
            System.out.println("Error:" + ex);

        }
    }

    void EntRemove() {

        User data = AdminDoctorList.getSelectionModel().getSelectedItem();
        int id = data.getId();

        try {
            dc = new DatabaseConnection();
            Connection conn = dc.Connect();

            String sql = "delete from ent where Id=?";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.execute();
            conn.close();

            AdminDoctorList.getItems().remove(data);
            System.out.println("SuccessfulIF");

        } catch (SQLException ex) {
            System.out.println("Error:" + ex);

        }
    }

    void OrthopedicRemove() {

        User data = AdminDoctorList.getSelectionModel().getSelectedItem();
        int id = data.getId();

        try {
            dc = new DatabaseConnection();
            Connection conn = dc.Connect();

            String sql = "delete from orthopedics where Id=?";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.execute();
            conn.close();

            AdminDoctorList.getItems().remove(data);
            System.out.println("SuccessfulIF");

        } catch (SQLException ex) {
            System.out.println("Error:" + ex);

        }
    }

    void NeurologyRemove() {
        User data = AdminDoctorList.getSelectionModel().getSelectedItem();
        int id = data.getId();

        try {
            dc = new DatabaseConnection();
            Connection conn = dc.Connect();

            String sql = "delete from neurology where Id=?";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.execute();
            conn.close();

            AdminDoctorList.getItems().remove(data);
            System.out.println("SuccessfulIF");

        } catch (SQLException ex) {
            System.out.println("Error:" + ex);

        }
    }

    void NephrologyRemove() {
        User data = AdminDoctorList.getSelectionModel().getSelectedItem();
        int id = data.getId();

        try {
            dc = new DatabaseConnection();
            Connection conn = dc.Connect();

            String sql = "delete from nephrology where Id=?";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.execute();
            conn.close();

            AdminDoctorList.getItems().remove(data);
            System.out.println("SuccessfulIF");

        } catch (SQLException ex) {
            System.out.println("Error:" + ex);

        }
    }

    void DiabetologyRemove() {
        User data = AdminDoctorList.getSelectionModel().getSelectedItem();
        int id = data.getId();

        try {
            dc = new DatabaseConnection();
            Connection conn = dc.Connect();

            String sql = "delete from diabetology where Id=?";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.execute();
            conn.close();

            AdminDoctorList.getItems().remove(data);
            System.out.println("SuccessfulIF");

        } catch (SQLException ex) {
            System.out.println("Error:" + ex);

        }
    }

    void GastricRemove() {
        User data = AdminDoctorList.getSelectionModel().getSelectedItem();
        int id = data.getId();

        try {
            dc = new DatabaseConnection();
            Connection conn = dc.Connect();

            String sql = "delete from gastroenterology where Id=?";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.execute();
            conn.close();

            AdminDoctorList.getItems().remove(data);
            System.out.println("SuccessfulIF");

        } catch (SQLException ex) {
            System.out.println("Error:" + ex);

        }
    }

    @FXML
    private void AddBtnAction(ActionEvent event) throws IOException {

        if (DepartmentSelectBox.getValue() == null) {

            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setContentText("!!No Department Is Selected!!");
            a.show();
        } else {
            Pane view = new FXMLLoader().load(getClass().getResource("AddDoctorByAdmin.fxml"));

            Stage stage = new Stage();
            stage.setScene(new Scene(view));
            stage.show();
        }
    }

    @FXML
    private void RefreshBtnAction(ActionEvent event) {
        AdminDoctorList.getItems().clear();
        if ("Cardiology".equals(docList)) {
            Cardiology();
        } else if ("Ent".equals(docList)) {
            Ent();
        } else if ("Orhtopedic".equals(docList)) {

            Orthopedic();
        } else if ("Gastroenterology".equals(docList)) {
            Gastrology();
        } else if ("Nephrology".equals(docList)) {

            Nephrology();
        } else if ("Neurology".equals(docList)) {
            Neurology();
        } else if ("Diabetology".equals(docList)) {
            Diabetology();
        } else {

            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setContentText("Choose an option");
            a.show();
        }
    }

    @FXML
    private void UpdateBtnAction(ActionEvent event) throws IOException {

        if (DepartmentSelectBox.getValue() != null) {

            if (AdminDoctorList.getSelectionModel().getSelectedItem() != null) {

                User data = AdminDoctorList.getSelectionModel().getSelectedItem();
                idNo = data.getId();

                Pane view = new FXMLLoader().load(getClass().getResource("AddFeesByAdmin.fxml"));
                Stage stage = new Stage();
                stage.setScene(new Scene(view));
                stage.show();

            } 
            else {
                Alert a = new Alert(Alert.AlertType.WARNING);
                a.setContentText("!!No Doctor is Selected!!");
                a.show();
            }
        }
        else {
            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setContentText("!!No Department is Selected!!");
            a.show();
        }
    }
}
