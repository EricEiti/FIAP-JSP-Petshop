package br.com.fiap.petshop.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.fiap.petshop.model.Animal;

public class AnimalDAO {

	private static Map<Long, Animal> animais = new HashMap<Long, Animal>(Map.of(
		1L, new Animal(1, "Jose", "papagaio", "verde claro", "eric.nomura"),
		2L, new Animal(2, "Toto", "cachorro", "preto", "eric.nomura"),
		3L, new Animal(3, "Maria", "cacatua", "branca", "admin"),
		4L, new Animal(4, "Bruno", "tatu", "cinza", "admin")));
	
	public static List<Animal> listar(String dono){
		return new ArrayList<>(animais.values()).stream()
				.filter(a -> a.getDono().equals(dono))
				.collect(Collectors.toList());
	}
	
	public static void cadastrar(Animal animal) {
		System.out.println("Iniciando novo cadastro...");
		animais.put(animal.getId(), animal);
		System.out.println("Cadastro finalizado!");
	}
	
	public static Animal buscar(long id) {
		return animais.get(id);
	}
	
	public static void editar(Animal animal) {
		System.out.println("Iniciando edicao de cadastro...");
		animais.put(animal.getId(), animal);
		System.out.println("Edicao finalizado!");
	}
	
	public static void remover(long id) {
		System.out.println("Iniciando remocao de cadastro...");
		animais.remove(id);
		System.out.println("Remocao finalizada!");
	}
}
