<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.*,
org.hibernate.*,
org.hibernate.cfg.Configuration,
com.coforge.training.hibernateweb.Student,
com.coforge.training.hibernateweb.Branch" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Component Mapping Demo</title>
</head>
<body>
<%
Session sess = new Configuration().configure("hibernate.cfg.xml")
.buildSessionFactory().openSession();
Transaction t = sess.beginTransaction();

Branch b1=new Branch("ME1","dATA Science");
Student s1=new Student("Pery","roger","322",25,b1);
sess.save(s1);
t.commit();
out.println("Student saved successfully");

%>



</body>
</html>