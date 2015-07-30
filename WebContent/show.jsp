<%@page import="panier.metier.Article"%>
<%@page import="panier.metier.Panier"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Contenu du panier</h2>
<ul>
<%
	Panier panier = (Panier) session.getAttribute("panier");
	for(Article article : panier.getArticles()){
		out.print("<li>"+article.getName()+"</li>");
	}
%>
</ul>
</body>
</html>