package main.java.com.mindteck.store.dao.hibernateutils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {   
		try{
			return new Configuration().configure().buildSessionFactory();  // this needs a try/catch but for clarity let's leave it like it is for now
		} catch(Throwable e) {
			System.err.println("SessionFactory initialization failed!" + e);
			throw new ExceptionInInitializerError(e);
		}
    }	
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	public static void shutdown(){
		 getSessionFactory().close();
	}

}
