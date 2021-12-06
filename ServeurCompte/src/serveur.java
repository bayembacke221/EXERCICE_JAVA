/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.*;
/**
 *
 * @author bayembacke
 */


public class serveur {
	public static void main (String [ ] args)
	{  
		System.setSecurityManager (new RMISecurityManager()) ;
	try {     System.out .println ("démarrage serveur...") ;
	client  objetdistant = new client (Math.random()) ;
	Naming.rebind ("rmi://localhost:1099/client", objetdistant) ; 
	System.out .println ("serveur prêt") ; } 
	catch (Exception e){
		System.out.println ("ERREUR: "+e.getMessage () ) ;} 
	}
}
