package webapp.maven.project.util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		
		try {
			
			return new Configuration().configure().buildSessionFactory();
					
			/*
			Configuration configuration = new Configuration();
			Configuration configure = configuration.configure();
			sessionFactory = configure.buildSessionFactory();
			return sessionFactory;
			*/
		} catch(Throwable ex) {
			System.err.println("Echec de la création de l'initialisation de la Session Factory " + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
