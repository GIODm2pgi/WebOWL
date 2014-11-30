


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jena.FicheRégion;
import jena.MuséeOwl;
import jena.RequêteDBpedia;

/**
 * Servlet implementation class Fiche
 */
@WebServlet("/FicheRegion")
public class FicheRegion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FicheRegion() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("name");
		
		if (id == null){
			response.sendRedirect("index.html");
			return;
		}
		
		MuséeOwl.setModel(getServletContext().getResourceAsStream("/data/musee.owl"));

		//RequêteDBpedia.setProxy();

		FicheRégion ficheRégion = RequêteDBpedia.getFicheRégion(id);

		request.setAttribute("fiche", ficheRégion);
		request.getRequestDispatcher("region.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
