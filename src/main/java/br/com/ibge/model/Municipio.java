package br.com.ibge.model;

public class Municipio {

	private int id;
	private String nome;
	private MicrorRegiao microrRegiao;
	private RegiaoImediata regiaoImediata;

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

	public MicrorRegiao getMicrorRegiao() {
		return microrRegiao;
	}

	public void setMicrorRegiao(MicrorRegiao microrRegiao) {
		this.microrRegiao = microrRegiao;
	}

	public RegiaoImediata getRegiaoImediata() {
		return regiaoImediata;
	}

	public void setRegiaoImediata(RegiaoImediata regiaoImediata) {
		this.regiaoImediata = regiaoImediata;
	}

}
