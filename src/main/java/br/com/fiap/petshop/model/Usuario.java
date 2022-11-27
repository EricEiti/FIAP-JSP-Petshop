package br.com.fiap.petshop.model;

import java.util.List;

public class Usuario {

	private String nomeCompleto;
	private String login;
	private String senha;
	private List<String> permissoes;

	public Usuario(String nomeCompleto, String login, String senha, List<String> permissoes) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.login = login;
		this.senha = senha;
		this.permissoes = permissoes;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<String> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<String> permissoes) {
		this.permissoes = permissoes;
	}

}
