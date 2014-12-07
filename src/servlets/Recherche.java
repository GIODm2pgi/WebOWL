package servlets;



import java.io.IOException;
import java.util.ArrayList;
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
		String nom = request.getParameter("nom");
		List<String> regions = this.getParameters(request, "compteurRegion", "region");
		List<String> deps = this.getParameters(request, "compteurDep", "dep");
		List<String> villes = this.getParameters(request, "compteurVille", "ville");
		String theme = request.getParameter("theme");

		MuséeOwl.setModel(getServletContext().getResourceAsStream("/data/musee.owl"));

		String sort = request.getParameter("sort");
		String sort_sens = request.getParameter("sort_sens");
		request.setAttribute("sort", sort);
		request.setAttribute("sort_sens", sort_sens);

		List<LienMusée> listResult = RequêteMusée.processQueryApp(nom, regions, deps, villes, theme, sort, sort_sens);
		request.setAttribute("result", listResult);
		request.getRequestDispatcher("recherche.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	List<String> getParameters(HttpServletRequest request, String compteur, String prefix){
		if(request.getParameter(compteur) == null){
			return null;
		}
		Integer cpt = new Integer(request.getParameter(compteur));
		List<String> toReturn = new ArrayList<String>();
		for(int i=1 ; i <= cpt ; i++){
			String value = request.getParameter(prefix + i);
			if(value != null && value.length() > 0){
				toReturn.add(value);
			}
		}
		return toReturn;
	}

}
