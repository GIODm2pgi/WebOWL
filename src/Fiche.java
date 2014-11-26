


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jenatest.RequêteMusée;
import jenatest.RequêteMusée.Result;

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
		// TODO Auto-generated constructor stub
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

		RequêteMusée.setModel(getServletContext().getResourceAsStream("/data/musee.owl"));

		Result r = RequêteMusée.getFicheMusée(id);

		String table = "<table><tr><td>" + r.ID + "</td></tr></table>";	

		request.setAttribute("table", table);
		request.getRequestDispatcher("fiche.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
