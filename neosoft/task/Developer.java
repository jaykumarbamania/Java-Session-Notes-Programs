package com.neosoft.task;

public class Developer extends Employee {
	
	public String skills ;
	
	public String project_name;
	
	public Developer(int eid, String ename, int deptno, double salary, String skills, String project_name) {
		super(eid, ename, deptno, salary);
		this.skills = skills;
		this.project_name = project_name;
	}

	public void showProfile() {
		
		System.out.println("Skills  : "+skills);
		System.out.println("Project Name is : "+project_name);
	}

	public static void main(String[] args) {
		
		

	}

}
