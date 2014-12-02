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

public class StaticRDV {

	private static List<String> régions = null;
	private static List<String> départements = null;
	private static List<String> villes = null;

	public static List<String> getRégions (){
		if (régions == null){
			String queryString = Utils.PREFIX 
					+ "SELECT (str(?nr) AS ?nrs) WHERE {"
					+ "?r m:aNomRégion ?nr ."
					+ "}";

			Query query = QueryFactory.create(queryString);
			ARQ.getContext().setTrue(ARQ.useSAX);        

			QueryExecution qexec = QueryExecutionFactory.create(query, MuséeOwl.getModel());
			ResultSet results = qexec.execSelect();

			régions = new ArrayList<String>();

			while (results.hasNext()) {
				QuerySolution soln = results.nextSolution();
				régions.add(soln.get("?nrs").toString());
			}
			qexec.close();

			return régions;
		}
		else
			return régions;
	}

	public static List<String> getDépartements (){
		if (départements == null){
			String queryString = Utils.PREFIX 
					+ "SELECT (str(?nd) AS ?nds) WHERE {"
					+ "?d m:aNomDépartement ?nd ."
					+ "}";

			Query query = QueryFactory.create(queryString);
			ARQ.getContext().setTrue(ARQ.useSAX);        

			QueryExecution qexec = QueryExecutionFactory.create(query, MuséeOwl.getModel());
			ResultSet results = qexec.execSelect();

			départements = new ArrayList<String>();

			while (results.hasNext()) {
				QuerySolution soln = results.nextSolution();
				départements.add(soln.get("?nds").toString());
			}
			qexec.close();

			return départements;
		}
		else
			return départements;
	}

	public static List<String> getVilles (){
		if (villes == null){
			String queryString = Utils.PREFIX 
					+ "SELECT (str(?nv) AS ?nvs) WHERE {"
					+ "?v m:aNomVille ?nv ."
					+ "}";

			Query query = QueryFactory.create(queryString);
			ARQ.getContext().setTrue(ARQ.useSAX);        

			QueryExecution qexec = QueryExecutionFactory.create(query, MuséeOwl.getModel());
			ResultSet results = qexec.execSelect();

			villes = new ArrayList<String>();

			while (results.hasNext()) {
				QuerySolution soln = results.nextSolution();
				villes.add(soln.get("?nvs").toString());
			}
			qexec.close();

			return villes;
		}
		else
			return villes;
	}
}
