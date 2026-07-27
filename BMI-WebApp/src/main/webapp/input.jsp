<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="mvchealth.User" %>

<%
User loginUser = (User) session.getAttribute("loginUser");

if (loginUser == null) {
    response.sendRedirect("login");
    return;
}
%>
<!DOCTYPE html>
<html>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Healthアプリ(MVC版)</title>
	<link rel="stylesheet" href="css/input.css">
</head>
<body>
<h2>ようこそ、<%= loginUser.getName() %> さん！</h2>
	<h1>健康診断</h1>
	<p>あなたのBMI値を求めます</p>
	<p>身長と体重を入力し,[診断]ボタンを押してください</p>
	<hr>
	<form action="bmi" method="post">
		<p>
			身長(cm)：
			<input type="number" step="0.1" name="height" required>
		</p>
		<p>
			体重(kg)：
			<input type="number" step="0.1" name="weight" required>
		</p>
		<input type="submit" value="診断">
	</form>
	<hr>

<form action="logout" method="get">
    <input type="submit" value="ログアウト">
</form>
</body>
</html>