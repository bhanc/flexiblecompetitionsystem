package pl.sportscompetitions;

import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.sportscompetitions.entities.Users;

/**
 * Servlet implementation class Test
 */
@WebServlet("/test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/plain;charset=utf-8");
//		response.getWriter().println("przed");
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SportsCompetitions");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		response.getWriter().println("po");
//		Users user = new Users();
//		user.setLogin("login");
//		user.setMail("mail");
//		user.setPassword("password");
//		if(entityManager == null) {
//			System.out.println("em nie ma");
//		}
//		Users user = (Users)entityManager.createQuery("SELECT u FROM Users WHERE u.name = :name")
//				.setParameter("name", "Bartosz").getSingleResult();
//		Users user = (Users)entityManager.find(Users.class, 1);
//		if(user == null) {
//			System.out.println("user nie ma");
//		}
		
//		entityManager.getTransaction().begin();
//		entityManager.persist(user);
//		entityManager.getTransaction().commit();
//		entityManager.close();
//		entityManagerFactory.close();
		response.sendRedirect("login");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
