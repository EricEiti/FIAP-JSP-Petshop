package br.com.fiap.petshop.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.fiap.petshop.model.Animal;

public class AnimalDAO {

	private static Map<Long, Animal> animais = new HashMap<Long, Animal>(Map.of(
		1L, new Animal(1, "Jose", "papagaio", "verde claro"),
		2L, new Animal(2, "Toto", "cachorro", "preto"),
		3L, new Animal(3, "Maria", "cacatua", "branca"),
		4L, new Animal(4, "Bruno", "tatu", "cinza")));
	
	public static List<Animal> listar(){
		return new ArrayList<>(animais.values());
	}
	
	public static void cadastrar(Animal animal) {
		System.out.println("Iniciando novo cadastro...");
		animais.put(animal.getId(), animal);
		System.out.println("Cadastro finalizado!");
	}
	
	public static Animal buscar(long id) {
		return animais.get(id);
	}
	
}
