package jena;

import com.hp.hpl.jena.query.ARQ;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;

public class RequêteDBpedia {

	private static boolean proxy_on = true;
	private static boolean proxy = false;
	
	public static void setProxy (){
		if (proxy_on && !proxy){
			System.getProperties().put("proxySet","true");
			System.getProperties().put("http.proxyHost", "www-cache.ujf-grenoble.fr");
			System.getProperties().put("http.proxyPort", "3128");
			proxy = true;
		}
	}

	public static FicheRégion getFicheRégion (String id){
		setProxy();
		
		FicheRégion toReturn = new FicheRégion(id);
		toReturn.setNom(getNomRégion(id));
		
		String queryString = Utils.PREFIX 
				+ "SELECT (str(?res) AS ?ress) (str(?web) AS ?webs) (str(?cap) AS ?caps) (str(?pop) AS ?pops) (str(?area) AS ?areas) WHERE {"
				+ "?r rdf:type <http://dbpedia.org/ontology/AdministrativeRegion> ."
				+ "?r rdfs:label \"" + toReturn.getNom() + "\"@fr ."
				+ "?r <http://dbpedia.org/ontology/abstract> ?res ."
				+ "?r <http://dbpedia.org/property/website> ?web ."
				+ "?r <http://dbpedia.org/property/capital> ?cap ."
				+ "?r <http://dbpedia.org/ontology/populationTotal> ?pop ."
				+ "?r <http://dbpedia.org/property/area> ?area ."
				+ "FILTER( lang(?res) = \"fr\" )"
				+ "}";
		
		Query query = QueryFactory.create(queryString);
		ARQ.getContext().setTrue(ARQ.useSAX); 

		QueryExecution qexec = QueryExecutionFactory.sparqlService("http://DBpedia.org/sparql", query);
		ResultSet results = qexec.execSelect();

		while (results.hasNext()) {
			QuerySolution soln = results.nextSolution();
			toReturn.setResume(soln.get("?ress").toString());
			toReturn.setWebsite(soln.get("?webs").toString());
			toReturn.setCapital(soln.get("?caps").toString()); 
			toReturn.setPopulation(soln.get("?pops").toString()); 
			toReturn.setArea(soln.get("?areas").toString()); 
		}
		qexec.close();

		return toReturn;		
	}

	public static String getNomRégion (String id){
		String queryString = Utils.PREFIX 
				+ "SELECT (str(?nr) AS ?nrs) WHERE {"
				+ "m:" + id + " m:aNomRégion ?nr ."
				+ "}";
		
		Query query = QueryFactory.create(queryString);
		ARQ.getContext().setTrue(ARQ.useSAX);        

		QueryExecution qexec = QueryExecutionFactory.create(query, MuséeOwl.getModel());
		ResultSet results = qexec.execSelect();

		String nr = null;

		while (results.hasNext()) {
			QuerySolution soln = results.nextSolution();
			nr = soln.get("?nrs").toString();
		}
		qexec.close();

		if (nr.equals("Centre"))
			return nr + " (région française)";
		
		return nr;
	}

}
