package br.com.fiap.petshop.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.petshop.model.Animal;

@WebServlet("/animal-listar")
public class AnimalListarServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Animal> listaAnimais = new ArrayList<>();
		listaAnimais.add(new Animal(1, "Jose", "papagaio", "verde"));
		listaAnimais.add(new Animal(2, "Toto", "cachorro", "preto"));
		listaAnimais.add(new Animal(3, "Maria", "cacatua", "branca"));
		
		request.setAttribute("animais", listaAnimais);
		
		request.getRequestDispatcher("/animal/index.jsp").forward(request, response);
	}

}
