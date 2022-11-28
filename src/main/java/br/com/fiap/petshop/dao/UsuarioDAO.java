package br.com.fiap.petshop.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.petshop.model.Usuario;

public class UsuarioDAO {
	
	private static List<Usuario> usuarios = new ArrayList<>(List.of(
			new Usuario("Eric Nomura", "eric.nomura", "123",
					List.of("listar", "criar", "editar")),
			new Usuario("Administrador", "admin", "123",
					List.of("listar", "criar", "editar", "remover"))
	));
	
	public static Usuario buscar(String login, String senha) {
		for (Usuario usuario : usuarios) {
			if (usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
				System.out.println("Login efetuado com sucesso!");
				return usuario;
			}
		}
		
		System.out.println("Login não foi efetuado com sucesso.");
		return null;
	}
	
	public static void alterar(String login, String nomeCompleto) {
		for (Usuario usuario : usuarios) {
			if (usuario.getLogin().equals(login)) {
				
			}
		}
	}

}
