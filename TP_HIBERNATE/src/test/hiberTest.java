package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Personne;
public class hiberTest {
	public static void main(String[] args) {
	Session session = null;
	try{
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		try{
		session =sessionFactory.openSession();
		}
		catch(Exception r){
		System.out.println("Erreur session : "+r.getMessage());
		r.printStackTrace();
		}
		System.out.println("Etape d’insertion");
		Personne personne = new Personne ( );
		Transaction tx = session.beginTransaction();
		personne.setPrenom("Baye Serigne");
		personne.setNom("Seck");
		personne.setLogin("seck@");
		personne.setPassword("332UUU");
		
		session.save (personne);
		
		tx.commit();
		System.out.println ("c est fait !!!");
		}catch(Exception e){
		System.out.println("Erreur :"+e.getMessage ());e.printStackTrace ( );
		}finally{
		session.flush ( );
		session.close ( );
		}
	}
}
