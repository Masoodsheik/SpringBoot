<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Location</title>
</head>
<body>
<form action="saveloc" method="post">
<pre>
Id  : <input type="text" name="loc_id"/> 
Code: <input type="text" name="loc_code"/>
Name: <input type="text" name="loc_name"/>
Type: Urban<input type="radio" name="loc_type" value="URBAN"/>
	  Rural<input type="radio" name="loc_type" value="RURAL"/>
	  <input type="submit" value="save"/>
	  </pre> 
</form>
${msg}
<a href="displayLocation">View All</a>
</body>
</html>