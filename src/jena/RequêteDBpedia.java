package jena;

import com.hp.hpl.jena.query.ARQ;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;

public class RequêteDBpedia {

	public static void main(String[] args) {

		System.getProperties().put("proxySet","true");
		System.getProperties().put("http.proxyHost", "www-cache.ujf-grenoble.fr");
		System.getProperties().put("http.proxyPort", "3128");

		RequêteDBpedia.queryExternalSources("PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" + 
				"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
				+ "select ?r where {\n" + 
				"    ?r rdf:type <http://dbpedia.org/ontology/AdministrativeRegion> .\n" + 
				"    ?r rdfs:label \"Rhône-Alpes\"@fr .\n" + 
				"}");
	}

	private static void queryExternalSources(String queryString) {
		Query query = QueryFactory.create(queryString);
		ARQ.getContext().setTrue(ARQ.useSAX);
		QueryExecution qexec = QueryExecutionFactory.sparqlService("http://DBpedia.org/sparql", query);
		ResultSet results = qexec.execSelect();
		while (results.hasNext()) {
			QuerySolution soln = results.nextSolution();
			System.out.println(soln.get("?r"));                                                
		}
		qexec.close();
	}

}
