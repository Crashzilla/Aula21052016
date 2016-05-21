<!DOCTYPE html>
<html>
	<head>
		<title>CadastroUsuario</title>
	</head>
	<body>
		<h1>Cadastro de usuários</h1>
		<form action="cadUsuarios" method="post">
			<label for="nome">Usuário</label><br/>
			<input type="text" name="nome" id="nome" size="20"/><br/>
			<label for="senha">Senha</label><br/>
			<input type="password" name="senha" id="senha" size="20"/><br/>
			<label for="nivel">Nivel</label><br/>
			<select name="nivel" "id="nivel">
				<option value="1" selected="selected">Administrador</option>
				<option value="2">Cliente</option>
			</select><br/>
			<br/>
			<input type="submit" value="Validar">
			<br/>
			${msg}
	</body>
</html>