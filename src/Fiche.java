

import java.io.IOException;
import java.io.PrintWriter;

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
		response.setContentType("text/html");

		String id = request.getParameter("id");
		
		RequêteMusée.setModel(getServletContext().getResourceAsStream("/data/musee.owl"));
		
		Result r = RequêteMusée.getFicheMusée(id);

		PrintWriter out = response.getWriter();
		out.println("<!doctype html>\n" + 
				"<html lang=\"fr\">\n" + 
				"<head>\n" + 
				"<meta charset=\"utf-8\">\n" + 
				"<title>TrouverUnMusée.fr - Trouver un musée en France par thème,\n" + 
				"	par région, par date, etc ...</title>\n" + 
				"<link rel=\"stylesheet\" href=\"style.css\">\n" + 
				"</head>\n" + 
				"<body>\n" + 
				"	<div id=\"header\">\n" + 
				"		<h1 class=\"display-none\">TrouverUnMusée.fr - Trouver un musée en\n" + 
				"			France par thème, par région, par date, etc ...</h1>\n" + 
				"	</div>\n" + 
				"	<div id=\"corps\">\n" + 
				"		<div id=\"corps-top\"></div>\n" + 
				"		<div id=\"corps-center\">\n" + 
				"			<h2>\n" + 
				"				<img src=\"img/museum.png\" title=\"icône musée\" width=\"22px\" /><span\n" + 
				"					class=\"titre\">Fiche du musée</span>\n" + 
				"			</h2>\n" + 
				"			\n" +
				"			<p>" + r.ID + "</p>\n" +
				"		</div>\n" + 
				"\n" + 
				"		<div id=\"corps-bot\"></div>\n" + 
				"	</div>\n" + 
				"</body>\n" + 
				"</html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
