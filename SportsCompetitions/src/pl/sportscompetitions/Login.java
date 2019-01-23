package pl.sportscompetitions;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pl.sportscompetitions.DAO.UsersDAO;
import pl.sportscompetitions.entities.Users;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsersDAO usersDAO = (UsersDAO)request.getAttribute("UsersDAO");
		if(usersDAO.Logging(request.getParameter("login"), request.getParameter("password"))) {
			request.getSession().setAttribute("isLogged", true);
			request.getSession().setAttribute("user", usersDAO.getUserByLogin(request.getParameter("login")));
			//TODO: usuń to
//			Users user = (Users) request.getSession().getAttribute("user");
//			System.out.println(user.getId());
			response.sendRedirect(request.getContextPath());
		} else {
			request.setAttribute("loginError", true);
			request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
		}
		
		
	}

}
