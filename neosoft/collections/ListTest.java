package com.neosoft.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Student> students = new ArrayList<Student>();
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(101, "Jaykumar", "Java", 90));
		students.add(new Student(102, "Abhi", "Python", 88));
		students.add(new Student(103, "Dev", "Java", 89));
		students.add(new Student(104, "Yash", "Java", 75));
		
		Iterator<Student> itr = students.iterator();
		while(itr.hasNext()) {
			Student student = itr.next();
			System.out.println(student);;
		}
		System.out.println("=====================");
		students.remove(2);
		students.add(0, new Student(100, "Jay", "PHP", 88));
		students.add(new Student(111, "ABC", "Java", 65));
		
		
		for(Student student : students) {
//			if(student.course=="Java") 
				System.out.println(student);
		}
		students.clear();
		
		System.out.println("==============");
		
		ArrayList<Object> complexList = new ArrayList<Object>(Arrays.asList(null,"abc",100,10.50,true));
		complexList.addAll(1, Arrays.asList(10f,"Java",90,30,40));
		
//		for(int obj : (int) complexList)
//			System.out.print(obj+" ");
		
//		Iterator<Student> itr1 = complexList.iterator();
//		while(itr1.hasNext()) {
//			if(itr1.next().getClass() == int)
//			Student student = itr.next();
//			System.out.println(student);;
//		}
		
		System.out.println("====================================");
		int sum = 0;
		for(Object obj: complexList) {
			if(obj instanceof Integer)
//			if(obj.getClass() ==java.lang.Integer)
				sum = sum + (Integer)obj;
		}
		System.out.println(sum);
//			if(obj.getClass()== obj. )
//				sum += obj;
		complexList.clear();
		
		
		
	}

}

class Student{
	int stdid;
	String name;
	String course;
	int marks;
	
	public Student(int stdid, String name, String course, int marks) {
		super();
		this.stdid = stdid;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", name=" + name + ", course=" + course + ", marks=" + marks + "]";
	}
	
	
}
