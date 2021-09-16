<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<form action="./registercheck.ss" method="get">

<tr><td>Id:</td><td> <input type="text" name="id"></td></tr>
<tr><td>Client Number:</td><td> <input type="number" name="cn"></td></tr>
<tr><td>Client Type:</td><td><input type="text" name="ct"></td></tr>
<tr><td>DOB:</td><td> <input type="dob" name="dob"></td></tr>
<tr><td>Mobile:</td><td><input type="number" name="mobile"></td></tr>
<tr><td>Address:</td><td> <input type="text" name="address"></td></tr>
<tr><td>State:</td><td> <input type="text" name="state"></td></tr>
<tr><td>Initial amount:</td><td><input type="number" name="ia"></td></tr>
<tr><td>Name:</td><td> <input type="name" name="name"></td></tr>
<tr><td>Password:</td><td><input type="password" name="pw"></td></tr>
<tr><td>Re-Type Password:</td><td> <input type="password" name="pww"></td></tr>
<tr><td>Age:</td><td><input type="number" name="age"></td></tr>
<tr><td>Email:</td><td><input type="text" name="email"></td></tr>
<tr><td>City:</td><td><input type="text" name="city"></td></tr>
<tr><td>Nation:</td><td><input type="text" name="nation"></td></tr>


</table>
<input type="submit" value="Register">
</form>
</body>
</html>