package main.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Started...");
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		System.out.println(sf);
		
		Student s=new Student();
		s.setId(112);
		s.setName("Nikhil");
		s.setCity("Gorakhpur");
		
		Session os = sf.openSession();
		Transaction tx = os.beginTransaction();
		os.persist(s);
		tx.commit();
		os.close();

	}
}
