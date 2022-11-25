package br.com.fiap.petshop.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.petshop.dao.AnimalDAO;

@WebServlet("/animal-remover")
public class AnimalRemoverServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		long idAnimal = Long.valueOf(request.getParameter("id"));
		
		AnimalDAO.remover(idAnimal);

		response.sendRedirect(request.getContextPath() + "/animal-listar");
	}

}
