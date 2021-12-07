package com.coforge.training.CustDisp3;

public class Customer {
int id;
String name;
int items;
int price;

public Customer(int id, String name, int items, int price) {
	super();
	this.id = id;
	this.name = name;
	this.items = items;
	this.price = price;
}

public void display() {
	System.out.println("************Customer Details************");
	System.out.println(this.id+" "+this.name+" "+this.items+" "+this.price);
}


}
