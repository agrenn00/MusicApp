
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
	
	<body background="resources/music.jpg">
	
		<header>
			<h1 class="title">Welcome to Music App</h1>
		</header>
			<div class="topnav">
  				<a class="active" href="home">Home</a>
  				<a class="active" href="register">Register</a>
				
			</div>
		
			<form:form id="loginForm" modelAttribute="login" action="loginProcess" method="POST">
                <table align="center">
                    <tr>
                        <td>
                            <form:input path="userName" name="username" id="userName" placeholder="Username" required="required" />
                        </td>
                    </tr>
                    <tr> 
                        <td>
                            <form:password path="password" name="password" id="password" placeholder="Password" required="required" />
                        </td>
                    </tr>
                    <tr>
                        
                        <td align="left">
                            <form:button id="login" name="login">Login</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr><td colspan="4" align="center"><div style="font-size: 15px; color: red; font-weight: bold;">${message}</div></td></tr>
                </table>
            </form:form>
	</body>
</html>