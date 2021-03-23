package br.com.ibge.model;

public class MicrorRegiao {

	private int id;
	private String nome;
	private MesorRegiao mesorregiao;

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

	public MesorRegiao getMesorregiao() {
		return mesorregiao;
	}

	public void setMesorregiao(MesorRegiao mesorregiao) {
		this.mesorregiao = mesorregiao;
	}

}
