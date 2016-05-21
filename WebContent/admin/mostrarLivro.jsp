
<!DOCTYPE html>
<head>
<title>Mostrar Livro</title>
</head>
<body>
	<h1>Detalhes do livro</h1>
	<ul>
		<li>Codigo: ${livro.codigo}</li>
 		<li>Título: ${livro.titulo}</li>
		<li>Autor: ${livro.autor}</li>

	</ul>
	<img src="imagem?id=${livro.codigo}"/>
</body>
</html>