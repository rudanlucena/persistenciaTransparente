package DAO;

import entidades.Clube;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
   
  public class ClubeDao {
   
           private static ClubeDao instance;
           protected EntityManager entityManager;
           
           public static ClubeDao getInstance(){
                     if (instance == null){
                              instance = new ClubeDao();
                     }
                     
                     return instance;
           }
   
           private ClubeDao() {
                     entityManager = getEntityManager();
           }
   
           private EntityManager getEntityManager() {
                     EntityManagerFactory factory = Persistence.createEntityManagerFactory("crudHibernatePU");
                     if (entityManager == null)
                              entityManager = factory.createEntityManager();
                     return entityManager;
           }

           public void persist(Clube clube) {
                try {
                         entityManager.getTransaction().begin();
                         entityManager.persist(clube);
                         entityManager.getTransaction().commit();
                } catch (Exception ex) {
                         ex.printStackTrace();
                         entityManager.getTransaction().rollback();
                }
           }
           
           public void remove(Clube clube){
               try{
                   entityManager.getTransaction().begin();
                   entityManager.remove(entityManager.merge(clube));
                   entityManager.getTransaction().commit();
               }
               catch(Exception ex){
                   ex.printStackTrace();
                   entityManager.getTransaction().rollback();
               }
           }
           
           public Clube find(int id){
               entityManager.getTransaction().begin();
               Clube clube = entityManager.find(Clube.class, id);
               entityManager.getTransaction().commit();
               return clube;
           }
           
           public Clube update(Clube clube){
               entityManager.getTransaction().begin();
               entityManager.merge(clube);
               entityManager.getTransaction().commit();
               return clube;
           }
      
  }