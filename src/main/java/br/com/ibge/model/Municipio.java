package br.com.ibge.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Municipio {

	private int id;
	private String nome;
	private MicrorRegiao microrregiao;
	@JsonProperty("regiao-imediata")
	private RegiaoImediata regiaoimediata;

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

	public MicrorRegiao getMicrorregiao() {
		return microrregiao;
	}

	public void setMicrorregiao(MicrorRegiao microrregiao) {
		this.microrregiao = microrregiao;
	}

	public RegiaoImediata getRegiaoimediata() {
		return regiaoimediata;
	}

	public void setRegiaoimediata(RegiaoImediata regiaoimediata) {
		this.regiaoimediata = regiaoimediata;
	}

}
