package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import modeles.Personne;
public class hiberTest {
	public static void main(String[] args) {
	Session session = null;
	try{
		//lecture de hibernate.cfg.xml et preparation de hibernate pour utilisation
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		try{
		session =sessionFactory.openSession();
		}
		catch(Exception r){
		System.out.println("Erreur session : "+r.getMessage());
		r.printStackTrace();
		}
		//Creer une instance de Contact et insertion dans la base
		System.out.println("Etape d’insertion");
		Personne personne = new Personne ( );
		Transaction tx = session.beginTransaction();
		personne.setPrenom("Lhaad");
		personne.setNom("Mbacke");
		personne.setLogin("Lahad@");
		personne.setMotpasse("222UUU");
		
		session.save (personne);
		
		tx.commit();
		System.out.println ("c’est fait !!!");
		}catch(Exception e){
		System.out.println("Erreur :"+e.getMessage ( ));e.printStackTrace ( );
		}finally{
		//l’insertion effective a lieu ici
		session.flush ( );
		session.close ( );
		}
	}
}
