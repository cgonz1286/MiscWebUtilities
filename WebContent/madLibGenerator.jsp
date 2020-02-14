<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
th, td {
  padding: 1px;
  text-align: left;    
}
</style>
<title>Mad Lib Generator</title>
</head>
<body>
	<h1>Mad Lib Generator</h1>
	<form action="madLibGeneratorServlet" method="post">
		<table style="width:30%">
		  <tr>
		    <th><label for="volume">Volume:</label></th>
		    <td>
			  <select id="volume" name="volume">
			    <option value="quiet">Quiet</option>
			    <option value="normal">Normal</option>
			    <option value="loud">Loud</option>
			  </select>
			</td>
		  </tr>	
		  <tr>
		    <th>Person:</th>
		    <td><input type="text" name="person" size="25" required></td>
		  </tr>
		  <tr>
		    <th>Place:</th>
		    <td><input type="text" name="place" size="25" required></td>
		  </tr>
		  <tr>
		    <th>Thing:</th>
		    <td><input type="text" name="thing" size="25" required></td>
		  </tr>
		  <tr>
		    <th>Verb:</th>
		    <td><input type="text" name="verb" size="25" required></td>
		  </tr>
		  <tr>
		    <th>Adjective:</th>
		    <td><input type="text" name="adjective" size="25" required></td>
		  </tr>
		</table>		 
		<br />
		<input type="submit" value="Generate Madlib" />
	</form>
</body>
</html>