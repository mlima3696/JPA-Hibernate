package br.com.java.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

	public static EntityManagerFactory factory = null;
	
	static
	{
		init();
	}

	private static void init() {
		
		try {
			if (factory == null) {
				factory=Persistence.createEntityManagerFactory("posjavamavenhibernate");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager(); //Prover a parte de persistencia
	}
	
	public static Object getPrimartkey(Object entity) { // Retorna a primary Key
		return factory.getPersistenceUnitUtil().getIdentifier(entity);
		
	}
}
