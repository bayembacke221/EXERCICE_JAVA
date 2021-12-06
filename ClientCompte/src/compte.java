/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bayembacke
 */


public interface compte extends java.rmi.Remote  {
	int solde=0;
	double numero=0 ;
	public void deposer ( double montant)throws java.rmi.RemoteException ; 
	public void retirer ( double montant)throws java.rmi.RemoteException ;
	public void consulter ( int numero)throws java.rmi.RemoteException ; 
	

}
