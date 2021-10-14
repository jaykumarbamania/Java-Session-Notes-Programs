package com.neosoft;

public class StudentAttr {
	
	int stdid;
	String name;
	String course;
	float marks;
	

	public StudentAttr(int stdid, String name, String course, float marks) {
		this.stdid = stdid;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	public void show() {
		System.out.println("Student ID : "+stdid);
		System.out.println("Student Name : "+name);
		System.out.println("Student course : "+course);
		System.out.println("Student marks : "+marks);
	}

	public static void main(String[] args) {
		
		StudentAttr std1 = new StudentAttr(128,"Jaykumar","B.E.",75);
		std1.show();

	}

}
