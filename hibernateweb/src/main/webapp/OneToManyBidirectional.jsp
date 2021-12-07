<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="org.hibernate.*,org.hibernate.boot.registry.*,
org.hibernate.cfg.Configuration,
com.coforge.training.hibernateweb.Cart,
com.coforge.training.hibernateweb.Items,
javax.persistence.TypedQuery,
java.util.*"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>One To Many Bidirectional Mapping</title>
</head>
<body>
<h1>One To Many Bidirectional Mapping</h1>
<%
Cart cart = new Cart();
cart.setName("MyCart2");

Items item1 = new Items("Paper", 100, 2, cart);
Items item2 = new Items("Pen", 5, 20, cart);

Set<Items> itemsSet = new HashSet<Items>();
itemsSet.add(item1); itemsSet.add(item2);

cart.setItems(itemsSet);
cart.setTotal(100*2+ 5*20);

Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory factory=cfg.buildSessionFactory(new
StandardServiceRegistryBuilder().configure().build());
Session sess= factory.openSession();
Transaction t = sess.beginTransaction();
//save the Model object
sess.save(cart);
sess.save(item1);
sess.save(item2);
t.commit();
sess.close();
out.println("Success");
out.println("<hr>");
out.println("<h1>Cart Items</h1>");
out.println("Cart_id:"+cart.getId());
out.println("<br>");
out.println("Item_id"+item1.getId()+"Item_name:"+item1.getItemId());
out.println("<br>");
out.println("Item_id"+item2.getId()+"Item_name:"+item2.getItemId());


%>

</body>
</html>