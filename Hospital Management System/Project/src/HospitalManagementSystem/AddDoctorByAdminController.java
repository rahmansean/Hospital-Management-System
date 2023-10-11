package HospitalManagementSystem;

import static HospitalManagementSystem.AdminDocListController.docList;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;

public class AddDoctorByAdminController implements Initializable {

    @FXML
    private JFXButton DoneBtn;
      
    private DatabaseConnection dc;
    @FXML
    private JFXTextField DoctorName;
    @FXML
    private JFXTextField DoctorQualification;
    @FXML
    private AnchorPane Rootpane;
    @FXML
    private JFXTextField ConsultationFeesField;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void DoneBtnAction(ActionEvent event) {
         if(docList!=null){
        if("Cardiology".equals(docList)){
            Cardiology();
        }
        else if("Ent".equals(docList)){
        Ent();
        }
        else if("Orhtopedic".equals(docList)){
        
            Orthopedic();
        }
        else if("Gastroenterology".equals(docList)){
        Gastrology();
        }
        else if("Nephrology".equals(docList)){
        
            Nephrology();
        }
        else if("Neurology".equals(docList)){
        Neurology();
        }
        else if("Diabetology".equals(docList)){
            Diabetology();
        }
    }
    }

    void Cardiology(){
     try{
          dc = new DatabaseConnection();
          Connection conn = dc.Connect();
          
          String sql = "insert into cardiology(Name,Qualification,ConsultationFees) values(?,?,?)";

                PreparedStatement pstm = conn.prepareStatement(sql);

                pstm.setString(1, DoctorName.getText());
                pstm.setString(2, DoctorQualification.getText());
                pstm.setString(3, ConsultationFeesField.getText());
               
                pstm.executeUpdate();
                int value = JOptionPane.showConfirmDialog(null, "Doctor Enlisted", "Doctor Updated", JOptionPane.YES_NO_OPTION);

                if (value == JOptionPane.YES_OPTION) {

                    Rootpane.getScene().getWindow().hide();
                }
             
     }catch(Exception ex){
     
         System.out.println("Error");
     }   
    }
    void Nephrology(){
        try{
          dc = new DatabaseConnection();
          Connection conn = dc.Connect();
          
        String sql = "insert into nephrology(Name,Qualification,ConsultationFees) values(?,?,?)";

                PreparedStatement pstm = conn.prepareStatement(sql);

                pstm.setString(1, DoctorName.getText());
                pstm.setString(2, DoctorQualification.getText());
                pstm.setString(3, ConsultationFeesField.getText());
               
                pstm.executeUpdate();
                int value = JOptionPane.showConfirmDialog(null, "Doctor Enlisted", "Doctor Updated", JOptionPane.YES_NO_OPTION);

                if (value == JOptionPane.YES_OPTION) {

                    Rootpane.getScene().getWindow().hide();
                }
             
     }catch(Exception ex){
     
         System.out.println("Error");
     }   
    }
    void Neurology(){
    try{
          dc = new DatabaseConnection();
          Connection conn = dc.Connect();
          
         String sql = "insert into neurology(Name,Qualification,ConsultationFees) values(?,?,?)";

                PreparedStatement pstm = conn.prepareStatement(sql);

                pstm.setString(1, DoctorName.getText());
                pstm.setString(2, DoctorQualification.getText());
                pstm.setString(3, ConsultationFeesField.getText());
               
                pstm.executeUpdate();
                int value = JOptionPane.showConfirmDialog(null, "Doctor Enlisted", "Doctor Updated", JOptionPane.YES_NO_OPTION);

                if (value == JOptionPane.YES_OPTION) {

                    Rootpane.getScene().getWindow().hide();
                }
             
     }catch(Exception ex){
     
         System.out.println("Error");
     }   
    }
    void Orthopedic(){
    try{
          dc = new DatabaseConnection();
          Connection conn = dc.Connect();
          
         String sql = "insert into orthopedics(Name,Qualification,ConsultationFees) values(?,?,?)";

                PreparedStatement pstm = conn.prepareStatement(sql);

                pstm.setString(1, DoctorName.getText());
                pstm.setString(2, DoctorQualification.getText());
                pstm.setString(3, ConsultationFeesField.getText());
               
                pstm.executeUpdate();
                int value = JOptionPane.showConfirmDialog(null, "Doctor Enlisted", "Doctor Updated", JOptionPane.YES_NO_OPTION);

                if (value == JOptionPane.YES_OPTION) {

                    Rootpane.getScene().getWindow().hide();
                }
             
     }catch(Exception ex){
     
         System.out.println("Error");
     }   
    }
    void Gastrology(){
    try{
          dc = new DatabaseConnection();
          Connection conn = dc.Connect();
          
         String sql = "insert into gastroenterology(Name,Qualification,ConsultationFees) values(?,?,?)";

                PreparedStatement pstm = conn.prepareStatement(sql);

                pstm.setString(1, DoctorName.getText());
                pstm.setString(2, DoctorQualification.getText());
                pstm.setString(3, ConsultationFeesField.getText());
               
                pstm.executeUpdate();
                int value = JOptionPane.showConfirmDialog(null, "Doctor Enlisted", "Doctor Updated", JOptionPane.YES_NO_OPTION);

                if (value == JOptionPane.YES_OPTION) {

                    Rootpane.getScene().getWindow().hide();
                }
             
     }catch(Exception ex){
     
         System.out.println("Error");
     }   
    }
    void Diabetology(){
    try{
          dc = new DatabaseConnection();
          Connection conn = dc.Connect();
          
          String sql = "insert into diabetology(Name,Qualification,ConsultationFees) values(?,?,?)";

                PreparedStatement pstm = conn.prepareStatement(sql);

                pstm.setString(1, DoctorName.getText());
                pstm.setString(2, DoctorQualification.getText());
                pstm.setString(3, ConsultationFeesField.getText());
               
                pstm.executeUpdate();
                int value = JOptionPane.showConfirmDialog(null, "Doctor Enlisted", "Doctor Updated", JOptionPane.YES_NO_OPTION);

                if (value == JOptionPane.YES_OPTION) {

                    Rootpane.getScene().getWindow().hide();
                }
             
     }catch(Exception ex){
     
         System.out.println("Error");
     }   
    }
    void Ent(){
    try{
          dc = new DatabaseConnection();
          Connection conn = dc.Connect();
          
         String sql = "insert into ent(Name,Qualification,ConsultationFees) values(?,?,?)";

                PreparedStatement pstm = conn.prepareStatement(sql);

                pstm.setString(1, DoctorName.getText());
                pstm.setString(2, DoctorQualification.getText());
                pstm.setString(3, ConsultationFeesField.getText());
               
                pstm.executeUpdate();
                int value = JOptionPane.showConfirmDialog(null, "Doctor Enlisted", "Doctor Updated", JOptionPane.YES_NO_OPTION);

                if (value == JOptionPane.YES_OPTION) {

                    Rootpane.getScene().getWindow().hide();
                }
             
     }catch(Exception ex){
     
         System.out.println("Error");
     }   
    }
  
}
