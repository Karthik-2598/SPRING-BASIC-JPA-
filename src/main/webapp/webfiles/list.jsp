<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
	<a href="/logout">Logout</a>
	<head>
		<title>My First JSP</title>
	</head>
	<body>
		<h1> Welcome content </h1>
	</body>
	<c:forEach items="${message}" var="temp">
		<p>
			${temp.getId()}
			<br>
			${temp.getGender()}
			<hr>
		</p>
	</c:forEach>
	<form action="addstudent"" method="GET">
		<label>Id of student </label><br>
		<input type="number" name="id"><br><br>
		<label>First name of student </label><br>
		<input type="text" name="Fname"><br><br>
		<label>Last of of student </label><br>
		<input type="text" name="Lname"><br><br>
		<label>Gender of student </label><br>
		<input type="text" name="Gender"><br><br>
		<label>Age of student </label><br>
		<input type="number" name="age"><br><br>
		<button type="submit">Add Student</button>
	</form>
	
	<form action="addmovie"" method="GET">
		<label><b>Id of Movie </b></label><br>
		<input type="number" name="id"><br><br>
		<label><b>Name of Movie</b></label><br>
		<input type="text" name="Mname"><br><br>
		<label><b>Cast of Movie</b></label><br>
		<input type="text" name="Heros"><br><br>
		<label><b>Director of Movie</b></label><br>
		<input type="text" name="Director"><br><br>
		<button type="submit">Add Movie</button>
	</form>
	
	<table border="1">
		<thead>
			<tr>
				<th>id</th>
				<th>FName</th>
				<th>LName</th>
				<th>Age</th>
				<th>Gender</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${message}" var="temp">
				<tr>
					<td>${temp.getId()}</td>
					<td>${temp.getFname()}</td>
					<td>${temp.getLname()}</td>
					<td>${temp.getAge()}</td>
					<td>${temp.getGender()}</td>
					<td><a href="delete?id=${temp.getId()}">delete</a></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
	<table border="1">
		<thead>
			<tr>
				<th>id</th>
				<th>Movie</th>
				<th>cast</th>
				<th>Director</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${message1}" var="temp">
				<tr>
					<td>${temp.getId()}</td>
					<td>${temp.getMovie()}</td>
					<td>${temp.getHeros()}</td>
					<td>${temp.getDirector()}</td>
					<td><a href="deletemovie?id=${temp.getId()}">delete</a></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
</html>
