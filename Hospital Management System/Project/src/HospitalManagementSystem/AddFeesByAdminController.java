package HospitalManagementSystem;

import static HospitalManagementSystem.AdminDocListController.docList;
import static HospitalManagementSystem.AdminDocListController.idNo;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;

public class AddFeesByAdminController implements Initializable {

    @FXML
    private JFXButton DoneBtn;
    @FXML
    private AnchorPane RootPane;

    private DatabaseConnection dc;
    @FXML
    private JFXTextField ConsultationFeesTxtField;
    
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
          
          String sql = "update cardiology set ConsultationFees=? where Id=?";

                PreparedStatement pstm = conn.prepareStatement(sql);

                pstm.setString(1, ConsultationFeesTxtField.getText());
                pstm.setInt(2,idNo);
                
                pstm.executeUpdate();
                int value = JOptionPane.showConfirmDialog(null, "Do you want to enlist fees?", "Fees Updated", JOptionPane.YES_NO_OPTION);

                if (value == JOptionPane.YES_OPTION) {

                    RootPane.getScene().getWindow().hide();
                }
             
     }catch(Exception ex){
     
         System.out.println("Error");
     }   
    }
    void Nephrology(){
        try{
          dc = new DatabaseConnection();
          Connection conn = dc.Connect();
          
        String sql = "update nephrology set ConsultationFees=? where Id=?";

                PreparedStatement pstm = conn.prepareStatement(sql);

                pstm.setString(1, ConsultationFeesTxtField.getText());
               pstm.setInt(2,idNo);
               
                pstm.executeUpdate();
                int value = JOptionPane.showConfirmDialog(null, "Do you want to enlist fees?", "Fees Updated", JOptionPane.YES_NO_OPTION);

                if (value == JOptionPane.YES_OPTION) {

                    RootPane.getScene().getWindow().hide();
                }
             
     }catch(Exception ex){
     
         System.out.println("Error");
     }   
    }
    void Neurology(){
    try{
          dc = new DatabaseConnection();
          Connection conn = dc.Connect();
          
         String sql = "update neurology set ConsultationFees=? where Id=?";

                PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.setString(1, ConsultationFeesTxtField.getText());
                pstm.setInt(2,idNo);
                
                pstm.executeUpdate();
                int value = JOptionPane.showConfirmDialog(null, "Do you want to enlist fees?", "Fees Updated", JOptionPane.YES_NO_OPTION);

                if (value == JOptionPane.YES_OPTION) {

                    RootPane.getScene().getWindow().hide();
                }
             
     }catch(Exception ex){
     
         System.out.println("Error");
     }   
    }
    void Orthopedic(){
    try{
          dc = new DatabaseConnection();
          Connection conn = dc.Connect();
          
         String sql = "update orthopedics set ConsultationFees=? where Id=?";

                PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.setString(1, ConsultationFeesTxtField.getText());
                pstm.setInt(2,idNo);
               
                pstm.executeUpdate();
                int value = JOptionPane.showConfirmDialog(null, "Doctor Enlisted", "Doctor Updated", JOptionPane.YES_NO_OPTION);

                if (value == JOptionPane.YES_OPTION) {

                    RootPane.getScene().getWindow().hide();
                }
             
     }catch(Exception ex){
     
         System.out.println("Error");
     }   
    }
    void Gastrology(){
    try{
          dc = new DatabaseConnection();
          Connection conn = dc.Connect();
          
         String sql = "update gastroenterology set ConsultationFees=? where Id=?";

                PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.setString(1, ConsultationFeesTxtField.getText());
                pstm.setInt(2,idNo);
               
                pstm.executeUpdate();
                int value = JOptionPane.showConfirmDialog(null, "Do you want to enlist fees?", "Fees Updated", JOptionPane.YES_NO_OPTION);

                if (value == JOptionPane.YES_OPTION) {

                    RootPane.getScene().getWindow().hide();
                }
             
     }catch(Exception ex){
     
         System.out.println("Error");
     }   
    }
    void Diabetology(){
    try{
          dc = new DatabaseConnection();
          Connection conn = dc.Connect();
          
          String sql = "Update diabetology set ConsultationFees=? where Id=?";

                PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.setString(1, ConsultationFeesTxtField.getText());
                pstm.setInt(2,idNo);
               
                pstm.executeUpdate();
                int value = JOptionPane.showConfirmDialog(null, "Do you want to enlist fees?", "Fees Updated", JOptionPane.YES_NO_OPTION);

                if (value == JOptionPane.YES_OPTION) {

                    RootPane.getScene().getWindow().hide();
                }
             
     }catch(Exception ex){
     
         System.out.println("Error");
     }   
    }
    void Ent(){
    try{
          dc = new DatabaseConnection();
          Connection conn = dc.Connect();
          
         String sql = "Update ent set ConsultationFees=? where Id=? ";

                PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.setString(1, ConsultationFeesTxtField.getText());
                pstm.setInt(2,idNo);

               
                pstm.executeUpdate();
                int value = JOptionPane.showConfirmDialog(null, "Do you want to enlist fees?", "Fees Updated", JOptionPane.YES_NO_OPTION);

                if (value == JOptionPane.YES_OPTION) {

                    RootPane.getScene().getWindow().hide();
                }
             
     }catch(Exception ex){
     
         System.out.println("Error");
     }
    }
    
}
