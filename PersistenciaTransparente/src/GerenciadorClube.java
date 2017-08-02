import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GerenciadorClube {
   private static SessionFactory factory; 
   public static void main(String[] args) {
      try{
         factory = new AnnotationConfiguration().
                   configure().
                   //addPackage("com.xyz") //add package if used.
                   addAnnotatedClass(Clube.class).
                   buildSessionFactory();
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
     GerenciadorClube GC = new GerenciadorClube();

     GC.addClube("Vasco", "RJ", "São Januario", 1);
      
   }
   /* Method to CREATE an employee in the database */
   public void addClube(String nome, String cidade, String estadio, int divisao){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer clubeID = null;
      try{
         tx = session.beginTransaction();
         Clube clube = new Clube();
         clube.setFirstName(nome);
         clube.setFirstName(cidade);
         clube.setFirstName(estadio);
         clubeID = (Integer) session.save(clube); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
   
}