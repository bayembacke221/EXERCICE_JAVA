/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testnet1;

/**
 *
 * @author bayembacke
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestNet1 {

  public static void main(String[] args) {
  	try {
      InetAddress adrLocale = InetAddress.getLocalHost(); 
      System.out.println("Adresse locale = "+adrLocale.getHostAddress());
      InetAddress adrServeur = InetAddress.getByName("java.sun.com"); 
      System.out.println("Adresse Sun = "+adrServeur.getHostAddress());
      InetAddress[] adrServeurs = InetAddress.getAllByName("www.microsoft.com");
      System.out.println("Adresses Microsoft : ");
      for (int i = 0; i < adrServeurs.length; i++) {
      	System.out.println("     "+adrServeurs[i].getHostAddress());
      }
    } catch (UnknownHostException e) {
  	  e.printStackTrace();	
  	}
	
  }
}
