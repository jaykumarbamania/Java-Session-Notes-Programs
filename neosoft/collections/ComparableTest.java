package com.neosoft.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Student> students = new ArrayList<Student>();
		ArrayList<Candidates> students = new ArrayList<Candidates>();
		students.add(new Candidates(101, "Jaykumar", "Java", 90));
		students.add(new Candidates(102, "Abhi", "Python", 88));
		students.add(new Candidates(103, "Dev", "Java", 89));
		students.add(new Candidates(104, "Yash", "Java", 90));
		
	
		Collections.sort(students,Collections.reverseOrder()); //reverseorder
		System.out.println("=================");
		
		Collections.sort(students);
		for(Candidates candidate:students)
			System.out.println(candidate);
		
		//Min Max logic
		
		Candidates student1 = Collections.min(students);
		Candidates student2 = Collections.max(students);
		
		for(Candidates candidate : students) {
			if(student2.marks == candidate.marks) 
		}
		
		System.out.println("Min Marks : "+student1);
		System.out.println("Max Marks : "+student2);
		
	}

}

class Candidates implements Comparable<Candidates>{
	int stdid;
	String name;
	String course;
	int marks;
	
	public Candidates(int stdid, String name, String course, int marks) {
		super();
		this.stdid = stdid;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Candidates [stdid=" + stdid + ", name=" + name + ", course=" + course + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Candidates o) {
//		if(this.marks == o.marks) 
//			return 0;
//		else if(this.marks > o.marks)
//			return 1;
//		else
//			return -1;
		
		return this.marks - o.marks; //min max logic
	}
	
	
}
