<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<p>
		Seja bem vindo,
		<c:out value="${sessionScope.usuario_sessao.nome}"></c:out>
		<a href="menu.jsp">Voltar para o menu inicial</a>
		<a href="logoff">Logoff</a>
	</p>