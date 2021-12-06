/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscriptionetudiant;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author bayembacke
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField tf_identifiant;
    @FXML
    private TextField tf_prenom;
    @FXML
    private TextField tfnom;
    @FXML
    private TextField tfAge;
    @FXML
    private Button btnValider;
    @FXML
    private TableView<Etudiant> tvAjout;
    @FXML
    private TableColumn<Etudiant, Integer> colIdentifiant;
    @FXML
    private TableColumn<Etudiant, String> colPrenom;
    @FXML
    private TableColumn<Etudiant, String> colNom;
    @FXML
    private TableColumn<Etudiant, Integer> colAge;
    @FXML
    private Label label;
    @FXML
    private Button btnUpdate;
    @FXML
    private Button btnDelete;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws SQLException {
        if(event.getSource() ==btnValider ){
             insertRecord();
        }
        else if(event.getSource() == btnUpdate){
        updateRecord();
    }
        else if(event.getSource() == btnDelete){
            deleteEtudiant();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        showEtudiant();
    }    
    public  Connection  connecterDB(){
        try{
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver oki");
            String url="jdbc:postgresql://localhost:5432/etudiant";
            String user="mbacke";
            String password="bayembacke221";
           Connection cnx=DriverManager.getConnection(url,user,password);
            System.out.println("Connexion bien établié");
            return cnx;
        }catch(Exception e){
            System.err.println("Erreur3:");
            e.printStackTrace();
            return null;
        }
    }
    public ObservableList<Etudiant> getEtudiantList(){
        ObservableList<Etudiant> EtudiantList = FXCollections.observableArrayList();
       Connection con = connecterDB();
       String query = "SELECT * FROM etudiant";
       Statement st;
       ResultSet rs;
       try{
           st = con.createStatement();
           rs = st.executeQuery(query);
           Etudiant etudiant;
           while(rs.next()){
               etudiant = new Etudiant(rs.getInt("id"),rs.getInt("age"), rs.getString("prenom"), rs.getString("nom"));
               EtudiantList.add(etudiant);
           }
       }catch(Exception ex){
            System.err.println("Erreur2:");
           ex.printStackTrace();
       }
       return EtudiantList;
    }
    
    public void showEtudiant(){
        ObservableList<Etudiant> list = getEtudiantList();
        
        colIdentifiant.setCellValueFactory(new PropertyValueFactory<Etudiant, Integer>("id"));
        colNom.setCellValueFactory(new PropertyValueFactory<Etudiant, String>("nom"));
        colPrenom.setCellValueFactory(new PropertyValueFactory<Etudiant, String>("prenom"));
        colAge.setCellValueFactory(new PropertyValueFactory<Etudiant, Integer>("Age"));
        tvAjout.setItems(list);
    }
    private void insertRecord() throws SQLException{
        String query="INSERT INTO etudiant VALUES(?,?,?,?)";
        Connection con = connecterDB();
        PreparedStatement st=null;
        try{
            st = con.prepareStatement(query);
            st.setInt(1, Integer.parseInt(tf_identifiant.getText()));
            st.setString(2,tfnom.getText());
            st.setString(3, tf_prenom.getText());
            st.setInt(4, Integer.parseInt(tfAge.getText()));
            st.executeUpdate();
            showEtudiant();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            st.close();
            con.close();
        }
    }
    private void updateRecord() throws SQLException{
        String query = "UPDATE etudiant SET nom = ?,prenom =?, age =? WHERE id = ?";
        Connection con = connecterDB();
        PreparedStatement st=null;
        try{
            st = con.prepareStatement(query);
            st.setString(1,tfnom.getText());
            st.setString(2, tf_prenom.getText());
            st.setInt(3, Integer.parseInt(tfAge.getText()));
            st.setInt(4, Integer.parseInt(tf_identifiant.getText()));
            st.executeUpdate();
            
            showEtudiant();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            st.close();
            con.close();
        }
        
    }
    private void deleteEtudiant() throws SQLException{
        String query = "DELETE FROM etudiant WHERE id = ?";
         Connection con = connecterDB();
        PreparedStatement st=null;
        try{
            st = con.prepareStatement(query);
            st.setInt(1, Integer.parseInt(tf_identifiant.getText()));
            st.executeUpdate();
            
            showEtudiant();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            st.close();
            con.close();
        }
       
    }

}
