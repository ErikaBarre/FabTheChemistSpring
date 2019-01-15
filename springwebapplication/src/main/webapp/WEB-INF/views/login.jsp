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
System.out.println("---" + request.getParameter("name") + " afficage depuis la jsp");
Date d = new Date();
%>
<body>
<div><%=d %></div>
<!-- My first jsp ${name} and I give my password in the worldwide, this is ${password} -->
${message}

<form action="/login.do" method="post">
Enter you name 
<input type="text" name="name"/>
<input type="password" name="password"/> 
<input type="submit" value="Login"/>

</form>
</body>
</html>