package br.com.fiap.petshop.model;

public class Animal {

	private long id;
	private String nome;
	private String especie;
	private String cor;

	public Animal(long id, String nome, String especie, String cor) {
		super();
		this.id = id;
		this.nome = nome;
		this.especie = especie;
		this.cor = cor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}
