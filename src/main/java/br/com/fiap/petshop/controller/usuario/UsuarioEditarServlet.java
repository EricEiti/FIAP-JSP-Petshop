package br.com.fiap.petshop.controller.usuario;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.petshop.dao.UsuarioDAO;
import br.com.fiap.petshop.model.Usuario;

@WebServlet("/usuario-editar")
public class UsuarioEditarServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String login = (String)session.getAttribute("login");
		String nomeCompleto = (String)session.getAttribute("nomeUsuario");
		
		request.setAttribute("login", login);
		request.setAttribute("nomeCompleto", nomeCompleto);
		
		request.getRequestDispatcher("usuario/editar.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String nomeCompleto = request.getParameter("nomeCompleto");
		
		UsuarioDAO.alterar(login, nomeCompleto);
	}
}