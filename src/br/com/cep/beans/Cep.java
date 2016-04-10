package br.com.cep.beans;

import java.io.Serializable;

public class Cep implements Serializable{
	
	private String ds_uf_sigla;
	private String ds_cidade_nome;
	private String ds_bairro_nome;
	private String ds_logradouro_nome;
	
	public Cep() {
		// TODO Auto-generated constructor stub
	}

	public String getDs_uf_sigla() {
		return ds_uf_sigla;
	}

	public void setDs_uf_sigla(String ds_uf_sigla) {
		this.ds_uf_sigla = ds_uf_sigla;
	}

	public String getDs_cidade_nome() {
		return ds_cidade_nome;
	}

	public void setDs_cidade_nome(String ds_cidade_nome) {
		this.ds_cidade_nome = ds_cidade_nome;
	}

	public String getDs_bairro_nome() {
		return ds_bairro_nome;
	}

	public void setDs_bairro_nome(String ds_bairro_nome) {
		this.ds_bairro_nome = ds_bairro_nome;
	}

	public String getDs_logradouro_nome() {
		return ds_logradouro_nome;
	}

	public void setDs_logradouro_nome(String ds_logradouro_nome) {
		this.ds_logradouro_nome = ds_logradouro_nome;
	}
	
	
}
