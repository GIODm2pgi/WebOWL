package jena;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.Document;
import javax.swing.text.html.FormSubmitEvent;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

/**
 * A complete Java class that demonstrates how to create an HTML viewer with styles,
 * using the JEditorPane, HTMLEditorKit, StyleSheet, and JFrame.
 * 
 * @author alvin alexander, devdaily.com.
 *
 */
public class HtmlEditorKitTest{

	private Model model;

	private JEditorPane jEditorPane;

	public static void main(String[] args) throws FileNotFoundException{
		Model model = ModelFactory.createDefaultModel();
		model.read(new FileInputStream("data/musee.owl"), null, "TURTLE");
		new HtmlEditorKitTest(model);
	}

	private String getListMuséeParrégion (String région){
		String toReturn = "<html>\n"
				+ "<body>\n"
				+ "<form action=\"#\">"
				+ "<input type=\"text\" name=\"region\">"
				+ "<input type=\"submit\" value=\"OK\">"
				+ "</form>"
				+ "<ul>";
		List<String> list = RequêteMusée.trouverMuseeParRegion(model, région);
		if (list.isEmpty())
			toReturn += "<li>Pas de résultat ...</li>";
		else
			for (String s : list)
				toReturn += "<li><a href=\"#\">" + s + "</a></li>";
		toReturn += "</ul>"
				+ "</body>";
		return toReturn;
	}

	public HtmlEditorKitTest(Model model){
		this.model = model;

		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				// create jeditorpane
				jEditorPane = new JEditorPane();

				// make it read-only
				jEditorPane.setEditable(false);

				// create a scrollpane; modify its attributes as desired
				JScrollPane scrollPane = new JScrollPane(jEditorPane);

				// add an html editor kit
				HTMLEditorKit kit = new HTMLEditorKit();
				jEditorPane.setEditorKit(kit);

				// add some styles to the html
				StyleSheet styleSheet = kit.getStyleSheet();
				styleSheet.addRule("body {color:#000; font-family:times; margin: 4px; }");
				styleSheet.addRule("h1 {color: blue;}");
				styleSheet.addRule("h2 {color: #ff0000;}");
				styleSheet.addRule("pre {font : 10px monaco; color : black; background-color : #fafafa; }");

				// create some simple html as a string
				String defaultString = "<html>\n"
						+ "<body>\n"
						+ "<form action=\"#\">"
						+ "<input type=\"text\" name=\"region\">"
						+ "<input type=\"submit\" value=\"OK\">"
						+ "</form>"
						+ "</body>\n";

				// create a document, set it on the jeditorpane, then add the html
				Document doc = kit.createDefaultDocument();
				jEditorPane.setDocument(doc);
				jEditorPane.setText(defaultString);

				kit.setAutoFormSubmission(false);
				jEditorPane.addHyperlinkListener(new HyperlinkListener(){                           
					@Override
					public void hyperlinkUpdate(HyperlinkEvent e){
						if (e instanceof FormSubmitEvent){
							jEditorPane.setText(getListMuséeParrégion(((FormSubmitEvent)e).getData().split("=")[1]));
						}
					}
				});

				// now add it all to a frame
				JFrame j = new JFrame("HtmlEditorKit Test");
				j.getContentPane().add(scrollPane, BorderLayout.CENTER);

				// make it easy to close the application
				j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				// display the frame
				j.setSize(new Dimension(500,800));

				// pack it, if you prefer
				//j.pack();

				// center the jframe, then make it visible
				j.setLocationRelativeTo(null);
				j.setVisible(true);
			}
		});
	}
}