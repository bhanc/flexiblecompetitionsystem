package pl.sportscompetitions.listeners;

import javax.persistence.EntityManager;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

import pl.sportscompetitions.DAO.UsersDAO;

/**
 * Application Lifecycle Listener implementation class SetUpDB
 *
 */
@WebListener
public class SetUpDB implements ServletRequestListener {

    
    public void requestDestroyed(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    }

	
    public void requestInitialized(ServletRequestEvent sre)  { 
    	EntityManager entityManager = DBconfig.createEntityManager();
    	UsersDAO usersDAO = new UsersDAO(entityManager);
    	ServletRequest request = sre.getServletRequest();
    	request.setAttribute("UsersDAO", usersDAO);
    }
	
}
