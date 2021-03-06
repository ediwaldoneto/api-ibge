package br.com.ibge.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegiaoImediata {

	private int id;
	private String nome;
	@JsonProperty("regiao-intermediaria")
	private RegiaoIntermediara regiaointermediara;

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

	public RegiaoIntermediara getRegiaointermediara() {
		return regiaointermediara;
	}

	public void setRegiaointermediara(RegiaoIntermediara regiaointermediara) {
		this.regiaointermediara = regiaointermediara;
	}

}
