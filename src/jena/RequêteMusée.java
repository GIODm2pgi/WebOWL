package jena;

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

public class RequêteMusée {

	private static String prefix = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + 
			"PREFIX owl: <http://www.w3.org/2002/07/owl#>" + 
			"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>" + 
			"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + 
			"PREFIX m: <http://www.musee.com/ontologies/musee.owl#>";
	
	public static List<String> trouverMuseeParRegion (Model model, String region){
		String queryString = prefix 
				+ "SELECT ?n {"
				+ "?m m:aNomMusée ?n ."
				+ "?a m:estAdresseDuMusée ?m ."
				+ "?v m:estVilleDeLAdresse ?a ."
				+ "?d m:estDépartementDeLaVille ?v ."
				+ "?r m:estRégionDuDépartement ?d ."
				+ "?r m:aNomRégion \"" + region + "\"^^xsd:string ."
				+ "}";

		Query query = QueryFactory.create(queryString);
		ARQ.getContext().setTrue(ARQ.useSAX);        

		QueryExecution qexec = QueryExecutionFactory.create(query, model);
		ResultSet results = qexec.execSelect();

		List<String> toReturn = new ArrayList<String>();
		
		while (results.hasNext()) {
			QuerySolution soln = results.nextSolution();  
			toReturn.add(soln.get("?n").toString().split("\\^\\^")[0]);
		}
		qexec.close();
		
		return toReturn;
	}
	
}
