package br.com.fiap.petshop.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.petshop.dao.AnimalDAO;
import br.com.fiap.petshop.model.Animal;

@WebServlet("/animal-novo")
public class AnimalNovoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("animal/novo.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long idAnimal = Long.valueOf(request.getParameter("idAnimal"));
		String nomeAnimal = request.getParameter("nomeAnimal");
		String especieAnimal = request.getParameter("especieAnimal");
		String corAnimal = request.getParameter("corAnimal");
		
		Animal animal = new Animal(idAnimal, nomeAnimal, especieAnimal, corAnimal);
		
		AnimalDAO.cadastrar(animal);
		
		request.setAttribute("animais", AnimalDAO.listar());
		
		request.getRequestDispatcher("animal/index.jsp").forward(request, response);
	}

}
