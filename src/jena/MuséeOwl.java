package jena;

import java.io.InputStream;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class MuséeOwl {

	private static Model model;

	public static void setModel (InputStream in) {
		if (model == null){
			model = ModelFactory.createDefaultModel();
			model.read(in, null, "TURTLE");
		}
	}

	public static Model getModel(){
		return model;
	}

}
