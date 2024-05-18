package classes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Program Started!");
		
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		
		SessionFactory sf=c.buildSessionFactory();
		
		Student s=new Student();
		s.setName("Ram");
		s.setAddress("Ayodhya");
		
		Session open=sf.openSession();
		Transaction tx = open.beginTransaction();
		
		open.persist(s);
		tx.commit();
		open.close();
	}
}
