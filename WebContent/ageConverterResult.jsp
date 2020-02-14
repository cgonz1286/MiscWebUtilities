<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Age Converter - Result</title>
</head>
<body>
	<p>
		A ${ageConverter.getHumanAge()} year old human is equal to a ${ageConverter.getAnimalAge()} year old 
		${ageConverter.getAnimal()}! 
	</p>
	<a href="index.jsp">Go to index</a><br />
	<a href="ageConverter.jsp">Back</a>
</body>
</html>