package br.com.cep.teste;

import br.com.cep.beans.Cep;
import br.com.cep.dao.CepDao;

public class Busca {

	public static void main(String[] args) {
		//String cepStr = "04693120";
		//String cepStr = "18074761";//Rafinha
		//String cepStr = "04693120";
		String cepStr = "09784445";
		
		CepDao dao = new CepDao();
		Cep cep = new Cep();
		cep = dao.findCep(cepStr);
		System.out.println("Rua : "+cep.getDs_logradouro_nome()
				+"\nBairro: "+cep.getDs_bairro_nome()
				+"\nCidade : "+cep.getDs_cidade_nome()
				+"\nUF : "+cep.getDs_uf_sigla());
	}

}
