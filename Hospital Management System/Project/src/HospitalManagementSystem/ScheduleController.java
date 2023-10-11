
package HospitalManagementSystem;

import static HospitalManagementSystem.Database.patientName;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ScheduleController implements Initializable {
    

    @FXML
    private TableView<UserAppointment> tableUsers;
    @FXML
    private TableColumn<UserAppointment, String> colName;
    @FXML
    private TableColumn<UserAppointment, String> colEmail;
    @FXML
    private TableColumn<UserAppointment,String> colBirth;
    @FXML
    private TableColumn<UserAppointment, String> colGender;
    @FXML
    private TableColumn<UserAppointment, String> colTime;
    @FXML
    private TableColumn<UserAppointment, String> colDate;
    @FXML
    private TableColumn<UserAppointment, Integer> colId;
    @FXML
    private TableColumn<UserAppointment, String> colDoctorName;
    @FXML
    private TableColumn<UserAppointment, String> colDisease;

    ObservableList<UserAppointment> listM;
    private DatabaseConnection dc;
    @FXML
    private ImageView back;
    

  
  
   @Override
    public void initialize(URL url, ResourceBundle rb) {
      
         try {
            dc=new DatabaseConnection();
            Connection conn=dc.Connect();
            listM=FXCollections.observableArrayList();
            
            ResultSet qs = conn.createStatement().executeQuery("SELECT * FROM  appointmenttable");

             while (qs.next()) 
             {
                    listM.add(new UserAppointment(Integer.parseInt(qs.getString("Id")),qs.getString("UserName"),qs.getString("Gender"),
                    qs.getString("Email"),qs.getString("Birth"),
                    qs.getString("Slot"),qs.getString("AptDate"),qs.getString("DoctorName"),qs.getString("Department")));
            
             System.out.println("SuccessfulIF");
             }
         
        } catch (SQLException ex) {
            System.out.println("Error:"+ex);
            
            /*Alert a = new Alert(Alert.AlertType.WARNING);
            a.setContentText("This does not exist in data base");
            a.show();*/
        }
        
       colId.setCellValueFactory(new PropertyValueFactory<UserAppointment, Integer>("Id"));
       colName.setCellValueFactory(new PropertyValueFactory<UserAppointment, String>("Name"));
       //System.out.println("Successfull Name");
       colGender.setCellValueFactory(new PropertyValueFactory<UserAppointment, String>("Gender"));
       colEmail.setCellValueFactory(new PropertyValueFactory<UserAppointment, String>("Email"));
       //System.out.println("Successfull Email");
       colBirth.setCellValueFactory(new PropertyValueFactory<UserAppointment, String>("Birth"));
       colTime.setCellValueFactory(new PropertyValueFactory<UserAppointment, String>("Slot"));
       colDate.setCellValueFactory(new PropertyValueFactory<UserAppointment, String>("aptdate"));
       //System.out.println("Successfull AptDate");
       colDoctorName.setCellValueFactory(new PropertyValueFactory<UserAppointment, String>("doctorName"));
       //System.out.println("Successfull doctor name");
       colDisease.setCellValueFactory(new PropertyValueFactory<UserAppointment, String>("disease"));
       //System.out.println("Successfull disease");

        tableUsers.setItems(null);
        tableUsers.setItems(listM);
    }  

    @FXML
    private void backAction(MouseEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("MenuPage.fxml"));     
        Scene scn=new Scene(root);
        Stage about=(Stage)((Node)event.getSource()).getScene().getWindow();
        about.setScene(scn);                                                    
        about.setTitle("Menu Page");
        about.show();
    }
    

    }

        
        
        
        
        
        
       
