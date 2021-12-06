/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bayembacke
 */

import java.rmi .*; import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
import java.io .*;
public class client extends UnicastRemoteObject implements compte, Serializable {

	private String nom,prenom;
    @SuppressWarnings("unused")
	private double numero;
    @SuppressWarnings("unused")
	private int age;
    double solde;
	protected client(double i) throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
		nom="X";
		prenom="Malcolm";
		age=23;
		numero=i;
	}

	@Override
	public void deposer(double montant) throws RemoteException {
		solde +=montant;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retirer(double montant) throws RemoteException {
		// TODO Auto-generated method stub
		if (solde >=montant){
			solde -=montant ;}
		
	}

	@Override
	public void consulter(int numero) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.print(prenom+" "+nom+" Votre solde="+solde); 
		
	}
	public void SetNom()
	{
		System.out.println("Donner votre nom\n");
		@SuppressWarnings("resource")
		Scanner rep=new Scanner(System.in);
		String r=rep.nextLine();
		nom=r;
	}
	public void SetPnom()
	{
		System.out.println("Donner votre prenomnom\n");
		Scanner pr=new Scanner(System.in);
		String p=pr.nextLine();
		prenom=p;
	}
	public void SetAge()
	{
		System.out.println("Donner votre age\n");
		Scanner ag=new Scanner(System.in);
		int a=ag.nextInt();
		age=a;

}
	  public void transfert(int m,compte a) throws RemoteException
	   {
		   this.solde=solde-m;
		   a.deposer(m);
			  
		   }  
	   @SuppressWarnings("static-access")
	public void inscription(compte[] b,compte c)
	   {
		  int i=0,s=0;
		   for(i=0;i<10;i=i+1)
		   { 
			   if(b[i].numero!=c.numero)
			   {
				   s=s+1; 
			   }
			   else
			   {
				   System.out.println("ce numero existe deja");
				   break;
			   }
		   }  
		   
	   }
}