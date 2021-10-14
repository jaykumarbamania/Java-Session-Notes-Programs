package com.neosoft.enumPack;

import java.util.Scanner;

public class Student {

	int stdid;
	String stname;
	Subject subject;
	double marks;
	
	
	
	public Student(int stdid, String stname, Subject subject, double marks) {
		this.stdid = stdid;
		this.stname = stname;
		this.subject = subject;
		this.marks = marks;
	}



	public static void main(String[] args) {
		
		Student student1 = new Student(101, "Jay", Subject.valueOf("JAVA"), 80.0);
		Student student2 = new Student(102, "Dev", Subject.valueOf("PYTHON"), 70.0);
		Student student3 = new Student(103, "Abhi", Subject.valueOf("CPP"), 71.0);
		Student student4 = new Student(104, "Deepak", Subject.valueOf("JAVA"), 60.0);
		Student student5 = new Student(105, "Deep", Subject.valueOf("JAVA"), 80.0);
		
		System.out.print("Enter Name of Subject : ");
		Scanner input = new Scanner(System.in);
		String sub = input.nextLine().toUpperCase();
		
		Student[] students = {student1, student2,student3,student4,student5};
		int count=0;
		
		for(Student student : students) {
			if(Subject.valueOf(sub) == student.subject) {
				System.out.println("ID: "+student.stdid+",  Name: "+student.stname+",  Subject: "+student.subject+",  Marks: "+student.marks);
				count++;
			}
		}
		if(count==0) {
			System.out.println("No Students who have selected this subject");
		}
	}

}
