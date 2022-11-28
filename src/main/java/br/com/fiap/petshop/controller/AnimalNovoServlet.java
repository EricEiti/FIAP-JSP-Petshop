package br.com.fiap.petshop.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.petshop.dao.AnimalDAO;
import br.com.fiap.petshop.model.Animal;

@WebServlet("/animal-novo")
public class AnimalNovoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		String nomeUsuario = (String) session.getAttribute("nomeUsuario");

		if (nomeUsuario != null) {
			request.getRequestDispatcher("/animal/novo.jsp").forward(request, response);
		} else {
			response.sendRedirect(request.getContextPath() + "/login");
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		Long idAnimal = Long.valueOf(request.getParameter("idAnimal"));
		String nomeAnimal = request.getParameter("nomeAnimal");
		String especieAnimal = request.getParameter("especieAnimal");
		String corAnimal = request.getParameter("corAnimal");
		String login = (String) session.getAttribute("login");

		Animal animal = new Animal(idAnimal, nomeAnimal, especieAnimal, corAnimal, login);

		AnimalDAO.cadastrar(animal);

		response.sendRedirect(request.getContextPath() + "/animal-listar");
	}

}
