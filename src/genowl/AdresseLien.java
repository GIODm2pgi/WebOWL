package genowl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class AdresseLien {

	public static void main(String[] args) {

		Writer writer = null;

		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("owl/split/adresse.txt"), "utf-8"));

			BufferedReader br = null;

			try {

				String sCurrentLine;

				br = new BufferedReader(new FileReader("liste-musees-de-france-2012.csv"));
				br.readLine();

				int itm = 1;
				while ((sCurrentLine = br.readLine()) != null) {
					String[] splitted = sCurrentLine.split("\\$");
					String ID_A = splitted[9];
					String rue  = splitted[8];
					String ID_V  = splitted[11];

					String toAdd = "###  http://www.musee.com/ontologies/musee.owl#"+ID_A+"\n\n";
					toAdd += ":A_"+itm+" rdf:type owl:NamedIndividual ;\n\n";
					toAdd += "    :estAdresseDeLaVille :"+ID_V+" ;\n\n";
					
					toAdd += "    :aRue \""+rue+"\" .\n\n\n\n";
					
					writer.write(toAdd);
					itm++;
				}

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (br != null)br.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}

		} catch (IOException ex) {
			// report
		} finally {
			try {writer.close();} catch (Exception ex) {}
		}

	}

}
