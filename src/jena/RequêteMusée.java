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

public class RequêteMusée {

	public static List<LienMusée> processQueryApp (String region, String dep, String ville, String theme, String sort, String sort_sens){
		if ((region + dep + ville).length() == 0)
			return processQueryAppBis(null, null, null, theme, sort, sort_sens);

		List<LienMusée> toReturn = new ArrayList<LienMusée>();

		if (region.length() > 0){
			List<LienMusée> toAdd = processQueryAppBis(region, null, null, theme, sort, sort_sens);
			for (LienMusée lm : toAdd)
				if (!toReturn.contains(lm))
					toReturn.add(lm);
		}

		if (dep.length() > 0){
			List<LienMusée> toAdd = processQueryAppBis(null,dep, null, theme, sort, sort_sens);
			for (LienMusée lm : toAdd)
				if (!toReturn.contains(lm))
					toReturn.add(lm);
		}

		if (ville.length() > 0){
			List<LienMusée> toAdd = processQueryAppBis(null, null, ville, theme, sort, sort_sens);
			for (LienMusée lm : toAdd)
				if (!toReturn.contains(lm))
					toReturn.add(lm);
		}

		return toReturn;
	}

	private static List<LienMusée> processQueryAppBis (String region, String dep, String ville, String theme, String sort, String sort_sens){
		String base = Utils.PREFIX 
				+ "SELECT ?m ?nm ?nv ?nd ?nr ?r {"
				+ "?a m:estAdresseDuMusée ?m ."
				+ "?v m:estVilleDeLAdresse ?a ."
				+ "?v m:aNomVille ?nv ."
				+ "?d m:estDépartementDeLaVille ?v ."
				+ "?d m:aNomDépartement ?nd ."
				+ "?r m:estRégionDuDépartement ?d ."
				+ "?r m:aNomRégion ?nr ."
				+ "?m m:aNomMusée ?nm .";

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
			// TODO ...
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
			LienMusée lm = new LienMusée(Utils.cd(soln.get("?m")), Utils.ct(soln.get("?nm")), Utils.cd(soln.get("?r")), Utils.ct(soln.get("?nr")), Utils.ct(soln.get("?nd")), Utils.ct(soln.get("?nv")));
			toReturn.add(lm);
		}
		qexec.close();

		return toReturn;
	}

	public static FicheMusée getFicheMusée (String id){
		String queryString = Utils.PREFIX 
				+ "SELECT ?NomMusee ?NomRue ?NomVille ?NomDepartement ?NomRegion ?NomTheme ?HoraireOuverture ?ReOuverture "
				+ "?FermetureAnnuelle ?PeriodeNocturne ?SiteWeb {"
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
			toReturn.setNm(Utils.ct(soln.get("?NomMusee")));
			toReturn.setNv(Utils.ct(soln.get("?NomVille")));
			toReturn.setNd(Utils.ct(soln.get("?NomDepartement")));
			toReturn.setNr(Utils.ct(soln.get("?NomRegion")));
			toReturn.setNru(Utils.ct(soln.get("?NomRue")));
			toReturn.setNth(Utils.ct(soln.get("?NomTheme")));
			toReturn.setHov(Utils.ct(soln.get("?HoraireOuverture")));
			toReturn.setRov(Utils.ct(soln.get("?ReOuverture")));
			toReturn.setFan(Utils.ct(soln.get("?FermetureAnnuelle")));
			toReturn.setPno(Utils.ct(soln.get("?PeriodeNocturne")));
			toReturn.setSwe(Utils.ct(soln.get("?SiteWeb")));
		}
		qexec.close();

		return toReturn;
	}

}
