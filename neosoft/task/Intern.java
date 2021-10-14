package com.neosoft.task;

public class Intern extends Developer {
	
	public int probation;
	
	public double certificate;
	
	

	public Intern(int eid, String ename, int deptno, double salary, String skills, String project_name, int probation,
			double certificate) {
		super(eid, ename, deptno, salary, skills, project_name);
		this.probation = probation;
		this.certificate = certificate;
	}

	public void showStatus() {
		System.out.println("Probation : "+probation+" and Certificate no "+certificate);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
