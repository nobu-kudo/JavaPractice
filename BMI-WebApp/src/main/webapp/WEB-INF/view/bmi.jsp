<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Healthアプリ(MVC版)</title>
	<link rel="stylesheet" href="css/bmi.css">
</head>
<body>
	<h1>診断結果</h1>
	<hr>
	<table border="1">
		<tr><th>身長(cm)</th><td>${height}(cm)</td></tr>
		<tr><th>体重(kg)</th><td>${weight}(kg)</td></tr>
		<tr><th>BMI値</th><td>${bmi}</td></tr>
	</table>
	
	<a href="<c:url value='/input.html' />">入力画面に戻る</a>
</body>
</html>