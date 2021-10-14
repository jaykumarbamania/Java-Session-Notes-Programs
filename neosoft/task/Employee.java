package com.neosoft.task;

public class Employee {
	
	public int eid;
	
	public String ename;
	
	public int deptno;
	
	public double salary;
	
	
	
	public Employee(int eid, String ename, int deptno, double salary) {
		this.eid = eid;
		this.ename = ename;
		this.deptno = deptno;
		this.salary = salary;
	}

	public void showId() {
		System.out.println(eid + " "+ename+" "+deptno+" "+salary);
	}

	public static void main(String[] args) {
		
		

	}

}
