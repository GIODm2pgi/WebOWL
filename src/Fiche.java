


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jena.FicheMusée;
import jena.MuséeOwl;
import jena.RequêteMusée;

/**
 * Servlet implementation class Fiche
 */
@WebServlet("/Fiche")
public class Fiche extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Fiche() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		if (id == null){
			response.sendRedirect("index.html");
			return;
		}

		MuséeOwl.setModel(getServletContext().getResourceAsStream("/data/musee.owl"));

		FicheMusée r = RequêteMusée.getFicheMusée(id);

		String table = "<table><tr><td>" + r.getId() + "</td></tr></table>";	

		request.setAttribute("table", table);
		request.getRequestDispatcher("fiche.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
