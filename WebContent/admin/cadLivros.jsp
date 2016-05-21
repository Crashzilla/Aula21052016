<!DOCTYPE html>
<html>
	<head>
		<title>CadastroLivro</title>
	</head>
	<body>
		<h1>Cadastro de livros</h1>
		<form action="cadLivros" method="post" enctype="multipart/form-data">
		<label for="codigo">Código</label><br/>
		<input type="text" name="codigo" id="codigo" size="10"/><br/>
		<label for="titulo">Título</label><br/>
		<input type="text" name="titulo" id="titulo" size="30"/><br/>
		<label for="autor">Autor</label><br/>
		<input type="text" name="autor" id="autor" size="30"/><br/>
		<label for="data">Data Publicação</label><br/>
		<input type="text" name="data" id="data" size="30"/><br/>
		<label for="preco">Preço</label><br/>
		<input type="text" name="preco" id="preco" size="30"/><br/>
		<label for="foto">Foto</label><br/>
		<input type="file" name="foto" id="foto"/><br/>
		<br/>
		<input type="submit" value="Incluir"/><br/>
		<br/>
		${msg}
	</body>
</html>