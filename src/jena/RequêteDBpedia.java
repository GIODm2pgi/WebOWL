package jena;

import com.hp.hpl.jena.query.ARQ;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;

public class RequêteDBpedia {

	private static boolean proxy = false;

	public static void setProxy (){
		if (!proxy){
			System.getProperties().put("proxySet","true");
			System.getProperties().put("http.proxyHost", "www-cache.ujf-grenoble.fr");
			System.getProperties().put("http.proxyPort", "3128");
		}
	}

	public static FicheRégion getFicheRégion (String id){
		String queryString = Utils.PREFIX 
				+ "SELECT ?res ?web ?cap ?pop ?area {"
				+ "?r rdf:type <http://dbpedia.org/ontology/AdministrativeRegion> ."
				+ "?r rdfs:label \"" + getNomRégion(id) + "\"@fr ."
				+ "?r <http://dbpedia.org/ontology/abstract> ?res ."
				+ "?r <http://dbpedia.org/property/website> ?web ."
				+ "?r <http://dbpedia.org/property/capital> ?cap ."
				+ "?r <http://dbpedia.org/ontology/populationTotal> ?pop ."
				+ "?r <http://dbpedia.org/property/area> ?area ."
				+ "}";

		Query query = QueryFactory.create(queryString);
		ARQ.getContext().setTrue(ARQ.useSAX); 

		QueryExecution qexec = QueryExecutionFactory.sparqlService("http://DBpedia.org/sparql", query);
		ResultSet results = qexec.execSelect();

		FicheRégion toReturn = new FicheRégion(id);

		while (results.hasNext()) {
			QuerySolution soln = results.nextSolution();
			if (soln.get("?res").toString().endsWith("@fr"))
				toReturn.setResume(Utils.ca(soln.get("?res")));
			toReturn.setWebsite(soln.get("?web").toString());
			toReturn.setCapital(Utils.ca(soln.get("?cap"))); 
			toReturn.setPopulation(Utils.ct(soln.get("?pop"))); 
			toReturn.setArea(Utils.ct(soln.get("?area"))); 
		}
		qexec.close();

		return toReturn;		
	}

	public static String getNomRégion (String id){
		String queryString = Utils.PREFIX 
				+ "SELECT ?nr {"
				+ "m:" + id + " m:aNomRégion ?nr ."
				+ "}";

		Query query = QueryFactory.create(queryString);
		ARQ.getContext().setTrue(ARQ.useSAX);        

		QueryExecution qexec = QueryExecutionFactory.create(query, MuséeOwl.getModel());
		ResultSet results = qexec.execSelect();

		String nr = null;

		while (results.hasNext()) {
			QuerySolution soln = results.nextSolution();
			nr = Utils.ct(soln.get("?nr"));
		}
		qexec.close();

		return nr;
	}

}
