<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login jsp</title>
</head>
<%

System.out.println("Jessica Biel [jsp]");
System.out.println("---" + request.getParameter("name") + " afficage depuis la jsp (j'ai encvie de faire caca)");
Date d = new Date();
%>
<body>
<div><%=d %></div>
Welcome ${name} and you password is ${password}


</body>
</html>