package genowl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Complete {

	public static void main(String[] args) {

		Writer writer = null;

		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("owl/split/musee.txt"), "utf-8"));

			BufferedReader br = null;

			try {

				String sCurrentLine;

				br = new BufferedReader(new FileReader("liste-musees-de-france-2012.csv"));
				br.readLine();

				int itm = 1;
				while ((sCurrentLine = br.readLine()) != null) {
					String[] splitted = sCurrentLine.split("\\$");
					String ID_RO = splitted[5];	
					String NOM  = splitted[6];
					String ID_T = splitted[7];
					String ID_A = splitted[9];
					String ID_SW = splitted[13];
					String ID_FA = splitted[15];
					String ID_HO = splitted[17];
					String ID_NO = splitted[19];
					
					String toAdd = "###  http://www.musee.com/ontologies/musee.owl#M_"+itm+"\n\n";
					toAdd += ":M_"+itm+" rdf:type owl:NamedIndividual ;\n\n";
					toAdd += "    :estMuséeDeLAdresse :"+ID_A+" ;\n\n";
					if (ID_SW.length() > 0)
						toAdd += "    :estMuséeDuSiteWeb :"+ID_SW+" ;\n\n";
					if (ID_T.length() > 0)
						toAdd += "    :estMuséeDuThème :"+ID_T+" ;\n\n";
					if (ID_NO.length() > 0)
						toAdd += "    :estMuséeDeOuvertureNocture :"+ID_NO+" ;\n\n";
					if (ID_FA.length() > 0)
						toAdd += "    :estMuséeDeLaFermetureAnnuelle :"+ID_FA+" ;\n\n";
					if (ID_RO.length() > 0)
						toAdd += "    :estMuséeDeLaDateRéouverture :"+ID_RO+" ;\n\n";
					if (ID_HO.length() > 0)
						toAdd += "    :estMuséeDeHoraireOuverture :"+ID_HO+" ;\n\n";
					
					toAdd += "    :aNomMusée \""+NOM+"\" .\n\n\n\n";
					
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
