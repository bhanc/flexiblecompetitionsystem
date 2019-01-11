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
				<li><a class="active" href="index.jsp">Strona główna</a></li>
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
		<div id="content">tresc Lorem ipsum dolor sit amet, consectetur
			adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore
			magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation
			ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute
			irure dolor in reprehenderit in voluptate velit esse cillum dolore eu
			fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
			proident, sunt in culpa qui officia deserunt mollit anim id est
			laborum. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed
			do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut
			enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi
			ut aliquip ex ea commodo consequat. Duis aute irure dolor in
			reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
			pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
			culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum
			dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor
			incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
			quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
			commodo consequat. Duis aute irure dolor in reprehenderit in
			voluptate velit esse cillum dolore eu fugiat nulla pariatur.
			Excepteur sint occaecat cupidatat non proident, sunt in culpa qui
			officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit
			amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt
			ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis
			nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
			consequat. Duis aute irure dolor in reprehenderit in voluptate velit
			esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat
			cupidatat non proident, sunt in culpa qui officia deserunt mollit
			anim id est laborum.</div>
	</div>
	<div id="footer">stopka</div>

</body>
</html>