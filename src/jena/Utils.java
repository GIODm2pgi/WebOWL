package jena;

import com.hp.hpl.jena.rdf.model.RDFNode;

public class Utils {

	public static final String PREFIX = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + 
			"PREFIX owl: <http://www.w3.org/2002/07/owl#>" + 
			"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>" + 
			"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + 
			"PREFIX m: <http://www.musee.com/ontologies/musee.owl#>";
	
	public static String ct (RDFNode s){
		if (s == null)
			return null;
		return s.toString().split("\\^\\^")[0];
	}

	public static String cd (RDFNode s){
		if (s == null)
			return null;
		return s.toString().split("#")[1];
	}
	
	public static String ca (RDFNode s){
		if (s == null)
			return null;
		return s.toString().split("@")[0];
	}
	
}
