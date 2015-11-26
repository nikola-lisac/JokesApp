package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Service;

/**
 * Servlet implementation class JokeServlet
 */
@WebServlet("/newJoke")
public class JokeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Service serv = new Service();
		String joke = serv.getRandomJoke(); // random joke ID
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(joke);

	}

}
