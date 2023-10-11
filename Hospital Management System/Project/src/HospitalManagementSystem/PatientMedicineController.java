
package HospitalManagementSystem;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;
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
import javafx.scene.control.ButtonType;
import javafx.scene.control.DateCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class PatientMedicineController implements Initializable {
    
    String s1,s2,s3,s4,s5;
    @FXML
    private JFXDatePicker Msdate;
    @FXML
    private JFXTextField Mname;
    @FXML
    private JFXTextField Mpower;
    @FXML
    private JFXTimePicker Mtime;
    @FXML
    private JFXDatePicker Medate;
    @FXML
    private JFXButton addNewmedicineBTN;
    @FXML
    private TableView<UserMedicine> tableMorning;
    @FXML
    private TableColumn<UserMedicine,Integer> colId;
    @FXML
    private TableColumn<UserMedicine,String> colMname;
    @FXML
    private TableColumn<UserMedicine,String> colMpower;
    @FXML
    private TableColumn<UserMedicine,String> colMsdate;
    @FXML
    private TableColumn<UserMedicine,String> colMedate;
    @FXML
    private TableColumn<UserMedicine,String> colMtime;
    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private JFXButton bt;
    
    private DatabaseConnection dc;
    
   ObservableList<UserMedicine> listM;
    @FXML
    private JFXButton reloadBTN;
    @FXML
    private JFXButton deleteBTN;
    @FXML
    private ImageView back;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
       something();
       AnchorPane.setVisible(false);
        
    }    

    @FXML
    private void addNewmedicineBTNAction(ActionEvent event) {
        
        
        AnchorPane.setVisible(true); 
         Msdate.setDayCellFactory(param -> new DateCell() {
                @Override
                 public void updateItem(LocalDate date, boolean empty) {
            super.updateItem(date, empty);
            setDisable(empty || date.compareTo(LocalDate.now()) > 0 );
            }
        });
         Medate.setDayCellFactory(param -> new DateCell() {
                @Override
                 public void updateItem(LocalDate date, boolean empty) {
            super.updateItem(date, empty);
            setDisable(empty || date.compareTo(LocalDate.now()) < 0 );
           }
        });
        
         Mname.clear();
         Mpower.clear();
         Msdate.setValue(null);
         Medate.setValue(null);
         Mtime.setValue(null);
        
    }

    @FXML
    private void btaction(ActionEvent event) {

        
        try {

            if (Mname.getText() != null && Mpower.getText() != null && Msdate.getValue() != null && Medate.getValue() != null
                    && Mtime.getValue() != null) {

                dc = new DatabaseConnection();
                Connection conn = dc.Connect();

                s1 = Mname.getText();

                s2 = Mpower.getText();

                LocalDate ld1 = Msdate.getValue();
                s3 = ld1.toString();

                LocalDate ld2 = Medate.getValue();
                s4 = ld2.toString();

                LocalTime lt = Mtime.getValue();

                if (lt.getHour() >= 0 && lt.getHour() <= 12) {
                    s5 = lt.toString() + " AM";
                }
                if (lt.getHour() >= 12.01 && lt.getHour() <= 18) {
                    s5 = lt.toString() + " PM";
                }
                if (lt.getHour() >= 18.01 && lt.getHour() <= 23.09) {
                    s5 = lt.toString() + " PM";
                }
                //s5 = lt.toString();

                String sql = "Insert into mdcnrmndr (Mname,Mpower,Msdate,Medate,Mtime) values(?,?,?,?,?)";
                PreparedStatement pst = conn.prepareStatement(sql);

                pst.setString(1, s1);
                pst.setString(2, s2);
                pst.setString(3, s3);
                pst.setString(4, s4);
                pst.setString(5, s5);

                pst.executeUpdate();

                conn.close();

                System.out.println("Done");
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
    private void reloadBTNAction(ActionEvent event) {
       
      something();
       
    }

    void something()
    {
        try{
         dc = new DatabaseConnection();
         Connection conn = dc.Connect();
         listM=FXCollections.observableArrayList();
         
            
         ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM  mdcnrmndr");

            
             while (rs.next()) 
             {
                 
                 listM.add(new UserMedicine(Integer.parseInt(rs.getString("Id")),rs.getString("Mname"),rs.getString("Mpower"),
                    rs.getString("Msdate"),rs.getString("Medate"),rs.getString("Mtime")));
                 
              
             }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
      colId.setCellValueFactory(new PropertyValueFactory<UserMedicine,Integer>("id"));
      colMname.setCellValueFactory(new PropertyValueFactory<UserMedicine,String>("name"));
      colMpower.setCellValueFactory(new PropertyValueFactory<UserMedicine,String>("power"));
      colMsdate.setCellValueFactory(new PropertyValueFactory<UserMedicine,String>("sdate"));
      colMedate.setCellValueFactory(new PropertyValueFactory<UserMedicine,String>("edate"));
      colMtime.setCellValueFactory(new PropertyValueFactory<UserMedicine,String>("time"));
   
      tableMorning.setItems(null);
      tableMorning.setItems(listM);
    }

    @FXML
    private void deleteBTNAction(ActionEvent event) {
         if (tableMorning.getSelectionModel().getSelectedItem() != null) {

            UserMedicine data = tableMorning.getSelectionModel().getSelectedItem();
            int id = data.getId();

        try {
            dc=new DatabaseConnection();
            Connection conn=dc.Connect();
        
           String sql = "delete from mdcnrmndr where Id=?";

                PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.setInt(1, id);
                pstm.execute();
                conn.close();
            
             Alert a = new Alert(Alert.AlertType.CONFIRMATION);
              a.setTitle("Delete File");
              a.setHeaderText("Are you sure want to remove this name from Table?");
              
              Optional<ButtonType> option = a.showAndWait();

            if (option.get() == null) {
                //Label.setText("No selection!");
            } else if (option.get() == ButtonType.OK) {
                tableMorning.getItems().remove(data);
                 //Label.setText("Successfully Deleted");
            } else if (option.get() == ButtonType.CANCEL) {
                //Label.setText("Cancelled!");
            } else {
               //Label.setText("-");
            }
             
             System.out.println("SuccessfulIF");
         
        } catch (SQLException ex) {
            
            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setContentText("Please Select a Row");
            a.show();
           
        }
    }
        else
        {
            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setContentText("Please Select a Row");
            a.show();
        }
   }

    @FXML
    private void backAction(MouseEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("MenuPage.fxml"));     
        Scene scn=new Scene(root);
        Stage about=(Stage)((Node)event.getSource()).getScene().getWindow();
        about.setScene(scn);                                                    
        about.setTitle("Admin Menu Page");
        about.show();
    }
    
    
    
}

    

