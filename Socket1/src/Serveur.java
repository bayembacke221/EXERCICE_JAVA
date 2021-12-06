/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class Serveur extends Thread{
        public static void main(String args[]) throws Exception {
		java.net.ServerSocket ss = new java.net.ServerSocket(4444);
		System.out.println("Demarrage serveur sur le port " + ss.getLocalPort() + "....");
		while (true) {
			Socket s = ss.accept();
			System.out.println("Traitement...avec le client" + s.getRemoteSocketAddress());
			new Serveur(s).start();
		}
	}
	protected BufferedReader in;
	protected PrintWriter out;
	private Socket soc;
	String s;

	public Serveur(Socket soc) {
		try {
			this.soc=soc;
			this.in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			this.out = new PrintWriter(soc.getOutputStream(), true);
		} catch (Exception e) {
			System.out.println("Probleme lors de l'ecoute");
			e.printStackTrace();
		}
	}

	public void run() {
		try {
			try {
				traitement();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interruption grave du processus");
			}
		} catch (Exception er) {
		}
	}
	
		
	public String reception() {
		try {
			while(true) {
			System.out.println("Serveur en attente de client!!!");
			s=soc.getInputStream().toString();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}

	public void traitement() {
		try {
			in = new BufferedReader (new InputStreamReader (soc.getInputStream ()));
			out = new PrintWriter (soc.getOutputStream (), true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try { 
			String ch = in.readLine();
			if (ch != null) 	
				out.println ("Transposition de votre message : "+new StringBuffer(ch).reverse().toString());
		}catch (IOException e) {
			System.out.println ("Read failed");
			System.exit (-1);
		}
	}

	
}
