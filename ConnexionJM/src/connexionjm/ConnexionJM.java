/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connexionjm;
import java.sql.*;
/**
 *
 * @author Said
 */
public class ConnexionJM {
 static Connection cnx;
 static Statement st;
 static ResultSet rst;
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         AjouterP(100,"AAAA",50.50,15,"Informatique",1);
        
        //SupprimerParID(3);
        
        //recherchePparLibelle("SOURIS11");
        
        //ModifierP(1,"XXXXXX",100.50,2,"Mécanique",2 );
        
                
          try{
              cnx=connecterDB(); 
              st=cnx.createStatement();
              rst=st.executeQuery("SELECT * FROM tb_produit");
              
              while(rst.next()){
                  System.out.print(rst.getInt("id")+"\t");
                  System.out.print(rst.getString("libelle")+"\t");
                  System.out.print(rst.getDouble("prix")+"\t");
                  System.out.print(rst.getInt("quantite")+"\t");
                  System.out.print(rst.getString("categorie")+"\t");
                  System.out.print(rst.getInt("id_f")+"\t");
                  System.out.println();
              }
          }catch(Exception ex){
              ex.printStackTrace();
          } 
     
    }
    
  
    
    public static Connection  connecterDB(){
        try{
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver oki");
            String url="jdbc:postgresql://localhost:5432/produit";
            String user="mbacke";
            String password="bayembacke221";
           Connection cnx=DriverManager.getConnection(url,user,password);
            System.out.println("Connexion bien établié");
            return cnx;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
   
    public static void AjouterP(int id,String libelle,double prix,int quantite,String categorie,int id_f){
        try{
            String query="INSERT INTO tb_produit VALUES("+id+",'"+libelle+"',"+prix+","+quantite+",'"+categorie+"',"+id_f+")";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Produit bine ajouté");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        
    }
   
    public static void SupprimerParID(int id){
        try{
           String query="DELETE FROM tb_produit WHERE id="+id; 
           cnx=connecterDB();
           st=cnx.createStatement();
           st.executeUpdate(query);
           System.out.println("Produit bien supprimé");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
   
    public static void recherchePparLibelle(String libelle){
        try{
           String query="SELECT * FROM tb_produit WHERE libelle='"+libelle+"'"; 
           cnx=connecterDB();
           st=cnx.createStatement();
           rst= st.executeQuery(query);
           rst.last();
           int nbrRow = rst.getRow();
           if(nbrRow!=0){
               System.out.println("Produit trouve");
           }else{
                System.out.println("Produit non trouve");
               
           }
           
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
    }
    
   public static void ModifierP(int id,String n_libelle,double n_prix,int n_qnt,String n_cat,int n_f ){
       try{
           String query="UPDATE tb_produit SET libelle='"+n_libelle
                   +"', prix="+n_prix
                   +", quantite="+n_qnt
                   +", categorie='"+n_cat
                   +"', id_f="+n_f
                   +" WHERE id="+id;
           cnx=connecterDB();
           st=cnx.createStatement();
           st.executeUpdate(query);
           System.out.println("Produit bien modifié");
           
       }catch(SQLException e){
           System.out.println(e.getMessage());
       }
       
       
   }
    
    
    
    
   
    
}
