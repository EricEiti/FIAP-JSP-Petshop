package br.com.fiap.petshop.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.petshop.dao.AnimalDAO;
import br.com.fiap.petshop.model.Animal;

@WebServlet("/animal-editar")
public class AnimalEditarServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long idAnimal = Long.valueOf(request.getParameter("id"));
		
		Animal animal = AnimalDAO.buscar(idAnimal);
		
		request.setAttribute("animal", animal);
		
		request.getRequestDispatcher("animal/editar.jsp").forward(request, response);
	}
}
