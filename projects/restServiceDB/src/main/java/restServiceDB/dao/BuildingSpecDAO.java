package restServiceDB.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import restServiceDB.dao.BuildingSpec;

public class BuildingSpecDAO {
	private static SessionFactory factory; 

	public BuildingSpecDAO() {
		try{
			factory = new Configuration().
	                   configure("hibernate.cfg.xml").
	                   addAnnotatedClass(BuildingSpec.class).
	                   buildSessionFactory();
		}catch (Throwable ex) { 
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex); 
		}
	}
	
	
	public List<BuildingSpec> getBuildingSpec(String query){
        Session session = factory.openSession(); 
        Transaction tx = null;
        List<BuildingSpec> buildingSpec = null;
		try{
			tx = session.beginTransaction();
			buildingSpec =  session.createQuery(query,BuildingSpec.class).list();
			tx.commit();
			session.close();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}
		return buildingSpec;
    }

	public List<String> getBuildingSpecJSON(String query) {
		Session session = factory.openSession(); 
        Transaction tx = null;
        List<String> buildingSpec = null;
		try{
			tx = session.beginTransaction();
			buildingSpec =  session.createQuery(query,String.class).list();
			tx.commit();
			session.close();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}
		return buildingSpec;
	}
}
