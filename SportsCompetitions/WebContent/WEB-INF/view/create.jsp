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
				<li><a class="active" href="createCompetitions">Utwórz zawody</a></li>
				<c:if test="${isLogged ne true }">
					<li><a href="login">Zaloguj się</a></li>
				</c:if>
				<c:if test="${ isLogged eq true}">
					<li><a href="myCompetitions">Moje zawody</a>
					<li><a href="logout">Wyloguj</a></li>
				</c:if>
				<li style="float: right"><a href="contact">Kontakt</a></li>
			</ul>
		</div>
		<div id="content">
			<div id="box">
				<form action="${pageContext.request.contextPath}/addTeams" >
					Nazwa zawodów: <input type="text" name="competitionsName" /><br />
					Dyscyplina: <select name="discipline">
									<option value="basketball">Koszykówka</option>
									<option value="football">Piłka nożna</option>
									<option value="hockey">Hokej</option>
									<option value="volleyball">Siatkówka</option>
									<option value="handball">Piłka ręczna</option>
								</select>
					Ilość grup: <input type="number" min="0" name="quantityGroups"/><br />
					Ilość drużyn w grupie: <input type="number" min="0" name="quantityTeamsPerGroup"/><br />
					Ilość drużyn: <input type="number" min="2" title="Minimum 2 drużyny" name="quantityTeams"/><br />
					<input type="submit" value="Utwórz">
				</form>

			</div>
		</div>
	</div>
	<div id="footer">stopka</div>

</body>
</html>