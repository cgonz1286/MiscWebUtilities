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
<title>Age Converter</title>
</head>
<body>
	<h1>Human to Animal Years Conversion Calculator</h1>
	<form action="ageConverterServlet" method="post">
		<table style="width:30%">
		  <tr>
		    <th>Human Age:</th>
		    <td><input type="number" name="age" size="3" maxlength="3" min="1" max="150" required></td>
		  </tr>
		  <tr>
		    <th><label for="animals">Animal Type:</label></th>
		    <td>
			  <select id="animals" name="animals">
			    <option value="Dog">Dog</option>
			    <option value="Cat">Cat</option>
			    <option value="Pig">Pig</option>
			    <option value="Mouse">Mouse</option>
			    <option value="Elephant">Elephant</option>
			  </select>
			</td>
		  </tr>
		</table>		 
		<br />
		<input type="submit" value="Calculate Animal Age" />
	</form>
</body>
</html>