/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiantinscription;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bayembacke
 */
class JavaPostgreSql {
     public static void writeToDatabase(int userId, String userLastName, String userFisrtName, int oldAge) {

        String url = "org.postgresql.Driver";
        String urlBaseDonnees = "jdbc:postgresql://localhost:5432/postgres";
        String user = "mbacke";
        String password = "bayembacke221";
        int iduser = userId;
        String lastname  = userLastName;
        String firstname = userFisrtName;
        int old = oldAge;
        try {
            Class.forName ("org.postgresql.Driver");
            }
            catch (ClassNotFoundException e) {
            System.out.println ("Erreur dans le chargement du driver"); System.exit ( 0 );
            }
        // query
        String query = "INSERT INTO etudiant(id, Nom, Prenom,Age) VALUES(?,?, ?, ?)";
        
        try (
                
                Connection con = DriverManager.getConnection( urlBaseDonnees,user, password);
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setInt(1, iduser);
            pst.setString(2, lastname);
            pst.setString(3, firstname);
            pst.setInt(4, old);
            pst.executeUpdate();
            System.out.println("Sucessfully created.");

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(JavaPostgreSql.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
       
        Statement stmt = null;
        try {
            Connection con = DriverManager.getConnection( urlBaseDonnees,user, password);
            stmt = con.createStatement ( );
        }
        catch (SQLException e) {
        System.out.println("Impossible de créer de Statement ");
        }
        /**exécution de requêtes et récupération des données demandées*/
        ResultSet rs = null ;
        try { rs = stmt.executeQuery ("SELECT * FROM etudiant ");
        }
        catch (SQLException e) {
        System.out.println(" Erreur de requête SQL ");
        }
    }
}
