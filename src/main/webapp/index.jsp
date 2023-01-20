<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
   <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="resources/style.css" rel="stylesheet">
    <title>Librairie</title>
</head>
	<body>
		<h2>Ajouter un livre</h2>
   
	    <form class="form" action="bookServlet" method="POST">
		  <div class="form-content">
		    <label for="title">Titre: </label>
		    <input type="text" name="title" id="title" required>
		  </div>
		  
		  <div class="form-content">
		    <label for="author">Author: </label>
		    <input type="text" name="author" id="author" required>
		  </div>
	  
		  <div class="form-content">
		    <label for="illustrator">Illustrator: </label>
		    <input type="text" name="illustrator" id="illustrator" required>
		  </div>
	  
		  <div class="form-content">
		    <label for="editor">Editor: </label>
		    <input type="text" name="editor" id="editor" required>
		  </div>
	
		  <div class="form-content">
		    <label for="collection">Collection: </label>
		    <input type="text" name="collection" id="collection" required>
		  </div>
	
		  <div class="form-content">
		    <input class="submit-button" type="submit" value="Ajouter">
		  </div>
		</form>
		
		<h2>Recherche livre par id</h2>
		
		<form class="form" action="bookServlet" method="GET">
		  <div class="form-content">
		    <label for="book-id">id: </label>
		    <input type="number" name="book-id" id="book-id" required>
		  </div>
		</form>
	</body>
</html>