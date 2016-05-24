
<!DOCTYPE html>
<%//@page import="br.com.fiap.entity.Usuario"%>
<html>
	<head>
		<title>menu</title>
	</head>
	<body>
		<%@ include file="welcome.jsp" %>
		<%
			/*Usuario usuario = (Usuario)(session.getAttribute("usuario_sessao"));
		 	if(usuario == null){
		 		response.sendRedirect("../login.jsp");
		 		response.sendRedirect("/AplicacaoServletJsp/login.jsp");
		 	}*/
		 %>
		<h1>Menu de Opções</h1>
		<ul>
		<li><a href="cadUsuarios.jsp">Cadastro de usuários</a></li>
		<li><a href="cadLivros.jsp">Cadastro de livros</a></li>
		<li><a href="listarLivro.jsp">Lista de livros</a></li>
		</ul>
	</body>
</html>