package HospitalManagementSystem;

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


public class HealthQueriesController implements Initializable {

    @FXML
    private TableColumn<HealthQueries,String> Diseases_col;
    @FXML
    private TableColumn<HealthQueries,String> Symptoms_col;
    @FXML
    private ImageView returnMP;
    @FXML
    private TableView<HealthQueries> HealthQueriesTable;

    private ObservableList<HealthQueries>data;
    private DatabaseConnection dc;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            dc=new DatabaseConnection();
            Connection conn=dc.Connect();
            data=FXCollections.observableArrayList();
            ResultSet rs=conn.createStatement().executeQuery("SELECT * FROM healthqueries");
            
            while(rs.next()){
                
                data.add(new HealthQueries(rs.getInt("Id"),rs.getString("DiseasesName"),rs.getString("Symptoms")));
            } 
        } catch (SQLException ex) {
            System.out.println("Error:"+ex);
        }
        Diseases_col.setCellValueFactory(new PropertyValueFactory<>("DiseasesName"));
        Symptoms_col.setCellValueFactory(new PropertyValueFactory<>("Symptoms"));
        
        HealthQueriesTable.setItems(null);
        HealthQueriesTable.setItems(data);
    }    
    @FXML
        private void returnMPAction(MouseEvent event) throws IOException {
        Parent MenuPage = FXMLLoader.load(getClass().getResource("MenuPage.fxml"));
        Scene scr = new Scene(MenuPage);
        Stage fmp = (Stage) ((Node) event.getSource()).getScene().getWindow();
        fmp.setScene(scr);
        fmp.setTitle("Menu Page");
        fmp.show();

    }
  
}
