<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Zawody sportowe - organizuj zawody szybciej, łatwiej i
	przyjemniej</title>
<link rel="Stylesheet" type="text/css" href="style/style.css" />
</head>
<body>
	<div id="top">
		<div id="header">Elastyczny system do organizowania zawodów
			sportowych</div>
		<div id="menu">
			<ul>
				<li><a href="index">Strona główna</a></li>
				<li><a href="createCompetitions">Utworz zawody</a></li>
				<li><a class="active" href="login">Zaloguj się</a></li>
				<li style="float: right"><a href="contact">Kontakt</a></li>
			</ul>
		</div>
		<div id="content">
			<div id="loginBox">
				<form method="post">
					Login: <br /> <input type="text" name="login" /><br /> Hasło: <br />
					<input type="password" name="password" /><br /> <input
						type="submit" value="zaloguj">
				</form>
				<c:if test="${loginError eq true }">
					<p>Nieprawidłowe dane</p>
				</c:if>
				<a href="register"><small>Nie masz konta? Zajerestruj
						się</small></a>
			</div>
		</div>
	</div>
	<div id="footer">stopka</div>

</body>
</html>