package jena;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jena.RequêteMusée.Result;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class TrouverUnMusée {

	public static void main(String[] args) throws FileNotFoundException {
		Model model = ModelFactory.createDefaultModel();
		model.read(new FileInputStream("data/musee.owl"), null, "TURTLE");
		
		for (Result s : RequêteMusée.processQueryApp(null, null, null, null, null))
			System.out.println(s.nom);	
	}
	
}
