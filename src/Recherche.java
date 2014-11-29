


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jena.LienMusée;
import jena.MuséeOwl;
import jena.RequêteMusée;

/**
 * Servlet implementation class ServletSearch
 */
@WebServlet("/Recherche")
public class Recherche extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor. 
	 */
	public Recherche() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String region = request.getParameter("region");
		String dep = request.getParameter("dep");
		String ville = request.getParameter("ville");
		String theme = request.getParameter("theme");

		if (region == null || dep == null || ville == null || theme == null){
			response.sendRedirect("index.html");
			return;
		}

		MuséeOwl.setModel(getServletContext().getResourceAsStream("/data/musee.owl"));

		List<LienMusée> listResult = RequêteMusée.processQueryApp(region, dep, ville, theme);

		request.setAttribute("result", listResult);
		request.getRequestDispatcher("recherche.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
