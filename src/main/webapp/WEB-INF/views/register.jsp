<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Music App</title>
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-
		awesome/4.7.0/css/font-awesome.min.css">
		<link rel="stylesheet" href="resources/css/style.css" type="text/css">

	</head>
	
	<body background="resources/music.jpg" >
	
		<header class="title">Welcome to Music App</header>
		<div class="topnav">
  			<a class="active" href="home">Home</a>
  			
		</div>
		<form:form id="regForm" modelAttribute="user" action="registerProcess" method="post">
		<table class="title" align="center" border="0">

						<tbody><tr>
							<td align="center" colspan="2">
							<h3>Registration Page</h3>
							</td>
						</tr>
						<tr><td align="center" colspan="2" style="font-style: italic;">Fields marked (<span style="font-weight: bold;color: red; font-size: 15px;">*</span>) are Mandatory</td></tr>
						<tr><td></td><td></td></tr>
						<tr><td></td><td></td></tr>
			<tr>
				<td><form:label path="firstName"><span style="font-weight: bold;color: red;font-size: 15px;">*</span>First Name</form:label></td>
				<td><form:input path="firstName" name="firstname" id="firstname" required="required"/></td>
			</tr>
			<tr>
				<td><form:label path="lastName"><span style="font-weight: bold;color: red;font-size: 15px;">*</span>Last Name</form:label></td>
				<td><form:input path="lastName" name="lastname" id="lastname" required="required"/></td>
			</tr>
			<tr>
				<td><form:label path="userName"><span style="font-weight: bold;color: red;font-size: 15px;">*</span>Username</form:label></td>
				<td><form:input path="userName" name="username" id="username" required="required"/></td>
			</tr>
			<tr>
				<td><form:label path="password"><span style="font-weight: bold;color: red;font-size: 15px;">*</span>Password</form:label></td>
				<td><form:password path="password" name="password" id="password" required="required"/></td>
			</tr>
<!-- 			Field on registration form to confirm password. -->
<!-- 			<tr> -->
<%-- 				<td><form:label path="cpassword"><span style="font-weight: bold;color: red;font-size: 15px;">*</span>Confirm Password</form:label></td> --%>
<%-- 				<td><form:password path="cpassword" name="cpassword" id="cpassword" required="required"/></td> --%>
<!-- 			</tr> -->
			<tr>
				<td><form:label path="email"><span style="font-weight: bold;color: red;font-size: 15px;">*</span>Email</form:label></td>
				<td><form:input path="email" name="email" id="email" required="required"/></td>
			</tr>
			<tr>
				<td><form:label path="phoneNo">Phone Number</form:label></td>
				<td><form:input path="phoneNo" name="phoneno" id="phoneno"/></td>
			</tr>
			<tr>
				<td></td>
				<td><form:button id="register" name="register">Register</form:button></td>
			</tr>
			<tr><td colspan="4" align="center"><div style="font-size: 15px; color: red; font-weight: bold;">${REGISTRATIONSTATUSMESSAGE}</div></td></tr>

							
						</tbody>
		</table>
		</form:form>
	</body>

</html>