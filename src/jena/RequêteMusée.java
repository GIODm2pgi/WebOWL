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
import com.hp.hpl.jena.rdf.model.RDFNode;

public class RequêteMusée {

	public static List<LienMusée> processQueryApp (String nom, String region, String dep, String ville, String theme, String sort, String sort_sens){
		if ((region + dep + ville).length() == 0)
			return processQueryAppBis(nom, null, null, null, theme, sort, sort_sens);

		List<LienMusée> toReturn = new ArrayList<LienMusée>();

		if (region.length() > 0){
			List<LienMusée> toAdd = processQueryAppBis(nom, region, null, null, theme, sort, sort_sens);
			for (LienMusée lm : toAdd)
				if (!toReturn.contains(lm))
					toReturn.add(lm);
		}

		if (dep.length() > 0){
			List<LienMusée> toAdd = processQueryAppBis(nom, null,dep, null, theme, sort, sort_sens);
			for (LienMusée lm : toAdd)
				if (!toReturn.contains(lm))
					toReturn.add(lm);
		}

		if (ville.length() > 0){
			List<LienMusée> toAdd = processQueryAppBis(nom, null, null, ville, theme, sort, sort_sens);
			for (LienMusée lm : toAdd)
				if (!toReturn.contains(lm))
					toReturn.add(lm);
		}

		return toReturn;
	}

	private static List<LienMusée> processQueryAppBis (String nom, String region, String dep, String ville, String theme, String sort, String sort_sens){
		String base = Utils.PREFIX 
				+ "SELECT ?m (str(?nm) AS ?nms) (str(?nv) AS ?nvs) (str(?nd) AS ?nds) (str(?nr) AS ?nrs) ?r WHERE {"
				+ "?a m:estAdresseDuMusée ?m ."
				+ "?v m:estVilleDeLAdresse ?a ."
				+ "?v m:aNomVille ?nv ."
				+ "?d m:estDépartementDeLaVille ?v ."
				+ "?d m:aNomDépartement ?nd ."
				+ "?r m:estRégionDuDépartement ?d ."
				+ "?r m:aNomRégion ?nr ."
				+ "?m m:aNomMusée ?nm ."
				+ "OPTIONAL { ?m m:estMuséeDuThème ?t . ?t m:aNomThème ?nt } .";

		String queryString = base;

		if (region != null){
			queryString += "?r m:aNomRégion \"" + region + "\"^^xsd:string .";
		}
		else if (dep != null){
			queryString += "?d m:aNomDépartement \"" + dep + "\"^^xsd:string .";
		}
		else if (ville != null){
			queryString += "?v m:aNomVille  \"" + ville + "\"^^xsd:string .";
		}

		if (theme.length() > 0){
			queryString += "FILTER regex(str(?nt), \"" + theme + "\", \"i\")";
		}

		if (nom.length() > 0){
			queryString += "FILTER regex(str(?nm), \"" + nom + "\", \"i\")";
		}

		queryString += "}";

		if (sort != null && sort_sens != null && 
				(sort.equals("nm") || sort.equals("nr") || sort.equals("nd") || sort.equals("nv")) && 
				(sort_sens.equals("ASC") || sort_sens.equals("DESC"))){
			queryString += "ORDER BY " + sort_sens + "(?" + sort + ")";
		}

		Query query = QueryFactory.create(queryString);
		ARQ.getContext().setTrue(ARQ.useSAX);        

		QueryExecution qexec = QueryExecutionFactory.create(query, MuséeOwl.getModel());
		ResultSet results = qexec.execSelect();

		List<LienMusée> toReturn = new ArrayList<LienMusée>();

		while (results.hasNext()) {
			QuerySolution soln = results.nextSolution();
			LienMusée lm = new LienMusée(soln.get("?m").toString().split("#")[1], soln.get("?nms").toString(), soln.get("?r").toString().split("#")[1], soln.get("?nrs").toString(), soln.get("?nds").toString(), soln.get("?nvs").toString());
			toReturn.add(lm);
		}
		qexec.close();

		return toReturn;
	}

	public static FicheMusée getFicheMusée (String id){
		String queryString = Utils.PREFIX 
				+ "SELECT (str(?NomMusee) AS ?nms) (str(?NomRue) AS ?nrus) (str(?NomVille) AS ?nvs) "
				+ "(str(?NomDepartement) AS ?nds) (str(?NomRegion) AS ?nrs) (str(?NomTheme) AS ?nts) "
				+ "(str(?HoraireOuverture) AS ?hos) (str(?ReOuverture) AS ?ros) (str(?FermetureAnnuelle) AS ?fas) "
				+ "(str(?PeriodeNocturne) AS ?pns) (str(?SiteWeb) AS ?sws) WHERE {"
				+ "m:" + id + " m:aNomMusée ?NomMusee ."
				+ "OPTIONAL { m:" + id + " m:estMuséeDeLAdresse ?adresse . ?adresse m:aRue ?NomRue } ."
				+ "OPTIONAL { ?adresse m:estAdresseDeLaVille ?ville  . ?ville m:aNomVille ?NomVille } ."
				+ "OPTIONAL { ?ville m:estVilleDuDépartement ?departement  . ?departement m:aNomDépartement ?NomDepartement } ."
				+ "OPTIONAL { ?departement m:estDépartementDeLaRégion ?region  . ?region m:aNomRégion ?NomRegion } ."
				+ "OPTIONAL { m:" + id + " m:estMuséeDuThème ?theme . ?theme m:aNomThème ?NomTheme } ."
				+ "OPTIONAL { m:" + id + " m:estMuséeDeHoraireOuverture ?houvert . ?houvert m:aHoraireOuverture ?HoraireOuverture } ."
				+ "OPTIONAL { m:" + id + " m:estMuséeDeLaDateRéouverture ?rouvert . ?rouvert m:aPériodeRéouverture ?ReOuverture } ."
				+ "OPTIONAL { m:" + id + " m:estMuséeDeLaFermetureAnnuelle ?fannuelle . ?fannuelle m:aPériodeFermeture ?FermetureAnnuelle } ."
				+ "OPTIONAL { m:" + id + " m:estMuséeDeOuvertureNocture ?onocturne . ?onocturne m:aPériodeNocturne ?PeriodeNocturne } ."
				+ "OPTIONAL { m:" + id + " m:estMuséeDuSiteWeb ?web . ?web m:aURL ?SiteWeb } ."
				+ "}";

		Query query = QueryFactory.create(queryString);
		ARQ.getContext().setTrue(ARQ.useSAX);        

		QueryExecution qexec = QueryExecutionFactory.create(query, MuséeOwl.getModel());
		ResultSet results = qexec.execSelect();

		FicheMusée toReturn = new FicheMusée(id);

		while (results.hasNext()) {
			QuerySolution soln = results.nextSolution();
			toReturn.setNm(toString(soln.get("?nms")));
			toReturn.setNv(toString(soln.get("?nvs")));
			toReturn.setNd(toString(soln.get("?nds")));
			toReturn.setNr(toString(soln.get("?nrs")));
			toReturn.setNru(toString(soln.get("?nrus")));
			toReturn.setNth(toString(soln.get("?nts")));
			toReturn.setHov(toString(soln.get("?hos")));
			toReturn.setRov(toString(soln.get("?ros")));
			toReturn.setFan(toString(soln.get("?fas")));
			toReturn.setPno(toString(soln.get("?pns")));
			toReturn.setSwe(toString(soln.get("?sws")));
		}
		qexec.close();

		return toReturn;
	}

	private static String toString (RDFNode n){
		if (n == null)
			return null;
		else
			return n.toString();
	}

}
