package br.com.ibge.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MesorRegiao {

	private int id;
	private String nome;
	@JsonProperty("UF")
	private UF uf;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

}
