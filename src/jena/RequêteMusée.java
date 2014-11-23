package jena;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.hp.hpl.jena.query.ARQ;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class RequêteMusée {

	public static class Result {

		public Result (String n, String i){
			this.nom = n;
			this.ID = i;
		}

		public String nom;
		public String ID;

	}

	public static Model model = null;

	public static void setModel (InputStream in) {
		if (model == null){
			model = ModelFactory.createDefaultModel();
			model.read(in, null, "TURTLE");
		}
	}

	private static String prefix = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + 
			"PREFIX owl: <http://www.w3.org/2002/07/owl#>" + 
			"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>" + 
			"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + 
			"PREFIX m: <http://www.musee.com/ontologies/musee.owl#>";

	public static List<Result> processQueryApp (String region, String dep, String ville, String theme, String date){
		String base = prefix 
				+ "SELECT ?n ?m {"
				+ "?m m:aNomMusée ?n .";

		String queryString = base;

		if (region.length() > 0){
			queryString += "?a m:estAdresseDuMusée ?m ."
					+ "?v m:estVilleDeLAdresse ?a ."
					+ "?d m:estDépartementDeLaVille ?v ."
					+ "?r m:estRégionDuDépartement ?d ."
					+ "?r m:aNomRégion \"" + region + "\"^^xsd:string .";
		}

		if (dep.length() > 0){
			// TODO ...
		}

		if (ville.length() > 0){
			// TODO ...
		}

		if (theme.length() > 0){
			// TODO ...
		}

		queryString += "}";

		Query query = QueryFactory.create(queryString);
		ARQ.getContext().setTrue(ARQ.useSAX);        

		QueryExecution qexec = QueryExecutionFactory.create(query, model);
		ResultSet results = qexec.execSelect();

		List<Result> toReturn = new ArrayList<Result>();

		while (results.hasNext()) {
			QuerySolution soln = results.nextSolution();
			toReturn.add(new Result(soln.get("?n").toString().split("\\^\\^")[0], soln.get("?m").toString().split("#")[1]));
		}
		qexec.close();

		if (date.length() > 0){
			// TODO ...
		}

		return toReturn;
	}
	
}
