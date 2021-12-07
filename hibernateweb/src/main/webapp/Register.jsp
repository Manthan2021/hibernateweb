<%@page import="com.coforge.training.hibernateweb.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registeration Hibernate Demo</title>
</head>
<body>
<jsp:useBean id="userBean" class="com.coforge.training.hibernateweb.User">
</jsp:useBean>
<jsp:setProperty property="*" name="userBean"/>

<%
int i=UserDAO.userRegister(userBean);
if(i>0)
	out.print("User Successfully Registered");

%>



</body>
</html>