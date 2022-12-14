package br.com.fiap.petshop.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.petshop.dao.AnimalDAO;

@WebServlet("/animal-remover")
public class AnimalRemoverServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		String nomeUsuario = (String) session.getAttribute("nomeUsuario");
		List<String> permissoes = (List<String>) session.getAttribute("permissoes");

		if (nomeUsuario != null) {
			if (permissoes.contains("remover")) {
				Long idAnimal = Long.valueOf(request.getParameter("id"));

				AnimalDAO.remover(idAnimal);

				response.sendRedirect(request.getContextPath() + "/animal-listar");
			} else {
				request.getRequestDispatcher("login/acesso-negado.jsp").forward(request, response);
			}

		} else {
			response.sendRedirect(request.getContextPath() + "/login");
		}
	}
}
