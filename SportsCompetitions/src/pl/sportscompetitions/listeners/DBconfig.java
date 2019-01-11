package pl.sportscompetitions.listeners;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class DBconfig implements ServletContextListener {
	
	private static EntityManagerFactory entityManagerFactory;


	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         if(entityManagerFactory != null && entityManagerFactory.isOpen()) {
        	 entityManagerFactory.close();
         }
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         entityManagerFactory = Persistence.createEntityManagerFactory("SportsCompetitions");
    }
	
    public static EntityManager createEntityManager() {
    	if(entityManagerFactory != null) {
    		return entityManagerFactory.createEntityManager();
    	} else {
    		return null;
    	}
    }
}
