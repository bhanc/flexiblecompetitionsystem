package pl.sportscompetitions;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.sportscompetitions.DAO.UsersDAO;
import pl.sportscompetitions.entities.Users;
import pl.sportscompetitions.flags.Flags;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/view/register.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().setAttribute("registerError", null);
		Users user = new Users();
		user.setLogin(request.getParameter("login"));
		user.setMail(request.getParameter("mail"));
		user.setPassword(request.getParameter("password1"));
		UsersDAO usersDAO = (UsersDAO)request.getAttribute("UsersDAO");
		if(!(request.getParameter("password1").equals(request.getParameter("password2")))){
			request.getSession().setAttribute("registerError", "wrongPassword");
			request.getRequestDispatcher("/WEB-INF/view/register.jsp").forward(request, response);
		}else if(request.getParameter("login").equals("") || request.getParameter("password1").equals("")) {
			request.getSession().setAttribute("registerError", "wrongLogin");
			request.getRequestDispatcher("/WEB-INF/view/register.jsp").forward(request, response);
		}else if(usersDAO.registerUser(user).equals(Flags.REGISTER_SUCCESS)) {		
			//TODO: w register.jsp zaimplementować sukces rejestracji
			System.out.println("Success!");
			response.sendRedirect(request.getContextPath() + "/login");
		}else if(usersDAO.registerUser(user).equals(Flags.LOGIN_EXIST)) {
			//TODO: w register.jsp zaimplemenwotować obsługę istniejącego loginu
			System.out.println("Login exist");
			request.getSession().setAttribute("registerError", "loginExist");
			request.getRequestDispatcher("/WEB-INF/view/register.jsp").forward(request, response);
		}else if (usersDAO.registerUser(user).equals(Flags.REGISTER_FAILED)){
			//TODO: w register.jsp zaimplementować obsługę błędu przy rejesteracji
			System.out.println("Something went wrong.");
			request.getSession().setAttribute("registerError", "RegisterFailed");
			request.getRequestDispatcher("/WEB-INF/view/register.jsp").forward(request, response);
		}
		
//		request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
//		response.sendRedirect(request.getContextPath() + "/login");
	}

}
