package br.com.cep.Jena;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.VCARD;

public class HelloRDFworld {
	
	static String personURI = "http://somewhere/Rogerio";
	static String nome = "Rogerio";
	static String sobrenome = "Horauti";
	static String idade = "37";
	
	public static void main(String[] args) {
		
		// Criar um Model vazio
		Model model = ModelFactory.createDefaultModel();

		// Criar o resource
		Resource r = model.createResource(personURI);

		// Adicionar as property
		r.addProperty(VCARD.NAME, nome)
			.addProperty(VCARD.Family, sobrenome)
			.addProperty(VCARD.ADR, idade);
		
		//model.write(System.out);
		//model.write(System.out, "N3");
		//model.write(System.out, "RDF/XML-ABBREV");
		model.write(System.out, "N-TRIPLES");
	}

}
