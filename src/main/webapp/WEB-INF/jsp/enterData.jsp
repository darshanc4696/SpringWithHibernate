<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="displayData">

	<table>
		
		<tr>
			<td>Id</td>
			<td><input type="number" name="id"></td>
		</tr>
		
		<tr>
			<td>Name</td>
			<td><input type="text" name="name"></td>
		</tr>
		
		<tr>
			<td>Email</td>
			<td><input type="email" name="email"></td>
		</tr>
		
		<tr>
			<td>Address</td>
			<td><input type="text" name="address"></td>
		</tr>
		
		<tr>
			<td></td>
			<td><input type="submit" value="Register"></td>
		</tr>
	
	</table>

</form>

</body>
</html>