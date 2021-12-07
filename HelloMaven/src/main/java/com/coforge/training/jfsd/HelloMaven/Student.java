package com.coforge.training.jfsd.HelloMaven;

public class Student {
	
	private int rollNo;
	private String name;
	private String course;
	private double marks;
	
	
	public Student(int rollNo, String name, String course, double marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}


	public void display()
	{
	System.out.println("*********** Student Details ************");
	System.out.println(this.rollNo+" "+this.name+" "+this.course+" "
	+this.marks);
	}


	
	
	
	
	
}
