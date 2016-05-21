package br.com.fiap.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.entity.Usuario;

@WebServlet("/admin/cadUsuarios")
@MultipartConfig
public class ServletCadastroUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletCadastroUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("cadUsuarios.jsp").include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Usuario usuario = new Usuario();
		
			usuario.setNome(request.getParameter("nome"));
			usuario.setSenha(request.getParameter("senha"));
			usuario.setNivel(Integer.parseInt(request.getParameter("nivel")));
		
			GenericDao<Usuario> dao = new GenericDao<>(Usuario.class);
			dao.adicionar(usuario);
			request.setAttribute("msg", "Usuário cadastrado com sucesso");
			
		} catch (Exception e) {
			request.setAttribute("msg", e.getMessage());
		} finally{
			request.getRequestDispatcher("cadUsuarios.jsp").forward(request, response);
		}
	}
}
