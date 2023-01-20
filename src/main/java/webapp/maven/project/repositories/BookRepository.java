package webapp.maven.project.repositories;
import org.hibernate.Session;
import org.hibernate.Transaction;

import webapp.maven.project.entities.Book;
import webapp.maven.project.util.HibernateUtil;




public class BookRepository {
	 
    public void create(Book book) {
    	Session session = null;
        Transaction transaction = null;
        
        try {
     	   session = HibernateUtil.getSessionFactory().getCurrentSession();
     	   transaction = session.beginTransaction();
		   session.persist(book);
		   transaction.commit();
		   System.out.println("Livre créé");
        } catch (Exception e) {
        	if(transaction != null) {
        		transaction.rollback();
        	}
        	e.printStackTrace();
        } finally {
    	   if(session != null) {
    		   session.close();
    	   }
       }
   }

   public Book getById(int id) {
       Session session = null;
       Transaction transaction = null;
       Book book = null;
       
       try {
    	   session = HibernateUtil.getSessionFactory().getCurrentSession();
    	   transaction = session.beginTransaction();
    	   book = session.get(Book.class,id);
    	   transaction.commit();
    	   System.out.println("Livre trouvé");
       }catch (Exception e) {
    	   if(transaction != null) {
    		   transaction.rollback();
    	   }
    	   e.printStackTrace();
       } finally {
    	   if(session != null) {
    		   session.close();
    	   }
       }
       return book;
       
   }

   public void delete(int id) {
	   
	   Session session = null;
       Transaction transaction = null;
       Book book;
       
       try {
    	   book = getById(id);
    	   session = HibernateUtil.getSessionFactory().getCurrentSession();
    	   transaction = session.beginTransaction();
   	
    	   session.remove(book);
    	   transaction.commit();
    	   System.out.println("Livre supprimé");
    	   
       }catch (Exception e) {
    	   if(transaction != null) {
    		   transaction.rollback();
    	   }
    	   e.printStackTrace();
       } finally {
    	   if(session != null) {
    		   session.close();
    	   }
       }
   	}
}
