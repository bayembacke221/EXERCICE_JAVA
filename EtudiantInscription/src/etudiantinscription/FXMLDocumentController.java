/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiantinscription;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author bayembacke
 */
public class FXMLDocumentController  {
    @FXML
  private TextField firstname;
    @FXML
  private TextField identifiant;
    @FXML
  private TextField lastname;
    @FXML
  private TextField oldAge;
    
   public void getData(ActionEvent actionevent){
       System.out.println(Integer.parseInt(identifiant.getText()));
       System.out.println(firstname.getText());
       System.out.println(lastname.getText());
       System.out.println(Integer.parseInt(oldAge.getText()));
       JavaPostgreSql.writeToDatabase(Integer.parseInt(identifiant.getText()),firstname.getText(),lastname.getText(),Integer.parseInt(oldAge.getText()));
   }    
    
}
