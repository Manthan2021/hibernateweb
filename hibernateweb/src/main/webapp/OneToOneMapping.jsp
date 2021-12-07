<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="org.hibernate.*,org.hibernate.boot.registry.*,
org.hibernate.cfg.Configuration,
com.coforge.training.hibernateweb.Transact,
com.coforge.training.hibernateweb.Customer,
javax.persistence.TypedQuery,
java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>One To One Mapping</title>
</head>
<body>
<h1>One To One Mapping</h1>

<%
Transact txn=new Transact();
txn.setDate(new Date());
txn.setTotal(1000);

Customer cust = new Customer();
cust.setAddress("Delhi, India");
cust.setEmail("John@gmail.com");
cust.setName("John Cena");

txn.setCust(cust);
cust.setTxn(txn);

Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory factory=cfg.buildSessionFactory(new
StandardServiceRegistryBuilder().configure().build());
Session sess= factory.openSession();
Transaction t = sess.beginTransaction();

sess.save(txn);
t.commit();
%>






</body>
</html>