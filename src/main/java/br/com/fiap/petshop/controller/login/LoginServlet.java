package br.com.fiap.petshop.controller.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.petshop.dao.UsuarioDAO;
import br.com.fiap.petshop.model.Usuario;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/login/login.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

		Usuario usuario = UsuarioDAO.buscar(login, senha);

		if (usuario == null) {
			request.setAttribute("msg", "Login/Senha invalidos");
			request.getRequestDispatcher("/login/login.jsp").forward(request, response);
						
		} else {
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(300);
			session.setAttribute("nomeUsuario", usuario.getNomeCompleto());
			session.setAttribute("permissoes", usuario.getPermissoes());
			session.setAttribute("login", usuario.getLogin());
			
			response.sendRedirect(request.getContextPath() + "/animal-listar");
		}

	}
}
