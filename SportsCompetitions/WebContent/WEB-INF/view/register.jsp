<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Zawody sportowe - organizuj zawody szybciej, łatwiej i przyjemniej</title>
<link rel="Stylesheet" type="text/css" href="style/style.css" />
</head>
<body>
	<div id="top">
		<div id="header">Elastyczny system do organizowania zawodów sportowych</div>
		<div id="menu">
			<ul>
				<li><a href="index.jsp">Strona główna</a></li>
				<li><a href="create.jsp">Utworz tabelę</a></li>
				<c:if test="${isLogged ne true }">
					<li><a href="login">Zaloguj się</a></li>
				</c:if>
				<c:if test="${ isLogged eq true}">
					<li><a href="logout">Wyloguj</a></li>
				</c:if>
				<li style="float: right"><a href="contact.jsp">Kontakt</a></li>
			</ul>
		</div>
		<div id="content">
			<div id="loginBox">				
				<form method="post">
				E-mail:
				<input type="email" name="mail"><br />
       			Login: <br />
        		<input type="text" name="login" /><br /> 
        		Hasło: <br />
        		<input type="password" name="password1" /><br />
        		Powtórz hasło: <br />
        		<input type="password" name="password2" /><br /> 
        		<input type="submit" value="Zarejestruj">
    			</form>
    			<c:if test="${registerError eq 'loginExist' }">
    				<p>Login zajęty</p>
    			</c:if>
    			<c:if test="${registerError eq 'registerFailed' }">
    				<p>Rejestracja nie powiodła się</p>
    			</c:if>
    			<c:if test="${registerError eq 'wrongPassword' }">
    				<p>Nieprawidłowe hasło</p>
    			</c:if>
    			<c:if test="${registerError eq 'wrongLogin' }">
    				<p>Nieprawidłowy login</p>
    			</c:if>
			</div>
			
		</div>
	</div>
	<div id="footer">stopka</div>

</body>
</html>