package br.com.ibge.model;

public class MicrorRegiao {

	private int id;
	private String nome;
	private MesorRegiao mesorRegiao;

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

	public MesorRegiao getMesorRegiao() {
		return mesorRegiao;
	}

	public void setMesorRegiao(MesorRegiao mesorRegiao) {
		this.mesorRegiao = mesorRegiao;
	}

}
