package www.asterisc.in.Hibernate_Maven;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import www.asterisc.in.Hibernate_Maven.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	
		cfg.configure("hibernate.cfg.xml");
		
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Student s=new Student("om",23.3);
		
		Transaction tx = session.beginTransaction();
		
		session.save(s);

		tx.commit();
		session.close();
		
		System.out.println("Data inserted");
        
    }
}
