<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Locations :</h2>
	<table>
		<tr>
			<th>id</th>
			<th>code</th>
			<th>name</th>
			<th>type</th>
		</tr>
		    <c:forEach var="location" items="${locations}">
            <tr>
               <td>${locations.loc_id}</td>
               <td>${locations.loc_code}</td>
                <td>${locations.loc_name}</td>
                 <td>${locations.loc_type}</td>
            </tr>
         </c:forEach>
	</table>



</body>
</html>