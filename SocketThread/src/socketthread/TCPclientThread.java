/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketthread;

/**
 *
 * @author bayembacke
 */

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPclientThread extends Thread
{
	Socket s;
	Scanner entree=null;
	BufferedReader sin =null;
	PrintWriter sout =null;
	public TCPclientThread ( ){}
	public void run ( )
	{
		try 
		{
			String line;
			while (true) 
			{
				s = new Socket ("localhost",2000);
				Thread.sleep(1000);
				System.out.println ("Connected to  " + s.getInetAddress ( ) + " on port  " + s.getPort( ));
				sin = new BufferedReader (new InputStreamReader(s.getInputStream ( )));
				sout = new PrintWriter (s.getOutputStream ( ), true);
				System.out.print ("[Client Ask] > > >");
				entree = new Scanner (System.in);
				line = entree.nextLine ( );
				if(line.equals("")) 
				{
					s.close() ;
					System.out.println("Client sarrete");
					break;
				} 
				else 
				{  
					sout.println(line);
					sout.flush() ;
					line = sin.readLine();
					System.out.println("recu du serveur: " + line);
				}
			}	
		}
		catch(Exception dd)
			{
				System.out.println("probleme d'enfrmissement du Thread...");
			}
		finally
		{
			try
			{
				s.close();
			} 
			catch(Exception er){}
		}
	}	
	public static void main(String[] args) 
	{
		new TCPclientThread ().start();
	}
}
