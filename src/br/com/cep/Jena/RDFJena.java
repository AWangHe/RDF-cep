package br.com.cep.Jena;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.VCARD;

import br.com.cep.beans.Cep;
import br.com.cep.dao.CepDao;

public class RDFJena {
	
	//static String cepStr = "04693120";
	static String cepStr = "04673070";
	//static String cepStr = "06622180";
	//static String cepStr = "02764041";
	
	static String personURI = "http://cep.com.br/"+cepStr;
	
	public static void main(String[] args) {
		
		
		
		CepDao dao = new CepDao();
		Cep cep = new Cep();
		cep = dao.findCep(cepStr);
		
		// Criar um Model vazio
		Model model = ModelFactory.createDefaultModel();

		// Criar o resource
		Resource r = model.createResource(personURI);

		// Adicionar as propriedades
		r.addProperty(VCARD.Street, cep.getDs_logradouro_nome())
			.addProperty(VCARD.Region, cep.getDs_bairro_nome())
			.addProperty(VCARD.Locality, cep.getDs_cidade_nome())
			.addProperty(VCARD.GROUP, cep.getDs_uf_sigla());
		
		model.write(System.out);
		//model.write(System.out, "N3");
		//model.write(System.out, "RDF/XML-ABBREV");
		//model.write(System.out, "N-TRIPLES");
	}

}
