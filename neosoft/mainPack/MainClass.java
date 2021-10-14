package com.neosoft.mainPack;

import java.util.Scanner;

import com.neosoft.task.Developer;
import com.neosoft.task.Intern;

public class MainClass {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int eid[] = new int[4];
		String ename[] = new String[4];
		int deptno[] = new int[4];
		double salary[] = new double[4];
		
		String skills[] = new String[4];
		String project_name[] = new String[4];
		int probation[] = new int[4];
		double certificate[] = new double[4];
		
		String[] myArr=  {"Dev 1", "Dev 2", " Intern 1", "Intern 2"};
		
		for (int i = 0; i <2; i++) {
			System.out.println("Enter Data for "+myArr[i]);
			
			System.out.println("Enter Emp ID");
			int empid = input.nextInt();
			eid[i] = empid;
			
			System.out.println("Enter EmpXJ Name");
			String empname = input.next();
			ename[i] = empname;
			
			int depart_no = input.nextInt();
			System.out.println("Enter Emp Department No");
			deptno[i] = depart_no;
			
			System.out.println("Enter Emp Salary");
			Double empsalary = input.nextDouble();
			salary[i] = empsalary;
			
			System.out.println("Enter Emp Skills");
			String empskills = input.nextLine();
			skills[i] = empskills;
			
			System.out.println("Enter Emp Project name");
			String proj = input.nextLine();
			project_name[i] = proj;

		}
		
		for (int i = 2; i <4; i++) {
			System.out.println("Enter Data for "+myArr[i]);
			
			System.out.println("Enter Emp ID");
			int empid = input.nextInt();
			eid[i] = empid;
			
			System.out.println("Enter Emp Name");
			String empname = input.nextLine();
			ename[i] = empname;
			
			System.out.println("Enter Emp Department No");
			int depart_no = input.nextInt();
			deptno[i] = depart_no;
			
			System.out.println("Enter Emp Salary");
			Double empsalary = input.nextDouble();
			salary[i] = empsalary;
			
			System.out.println("Enter Emp Skills");
			String empskills = input.nextLine();
			skills[i] = empskills;
			
			System.out.println("Enter Emp Project name");
			String proj = input.nextLine();
			project_name[i] = proj;
			
			System.out.println("Enter Emp Probation Period");
			int period = input.nextInt();
			probation[i] = period;
			
			System.out.println("Enter Emp Certificate");
			Double certi = input.nextDouble();
			certificate[i] = certi;
		}
		
		Developer[] developers = {
				new Developer(eid[0],ename[0],deptno[0],salary[0],skills[0],project_name[0]),
				new Developer(eid[1],ename[1],deptno[1],salary[1],skills[1],project_name[1])
		};
		
		//Developer dev1 = new Developer(eid[0],ename[0],deptno[0],salary[0],skills[0],project_name[0]);
		//Developer dev2 = new Developer(eid[1],ename[1],deptno[1],salary[1],skills[1],project_name[1]);
		
		for(Developer developer : developers) {
			if(developer.salary < 10000) {
				developer.showId();
				developer.showProfile();
			}
		}
		
		Intern intern1 = new Intern(eid[2],ename[2],deptno[2],salary[2],skills[2],project_name[2],probation[2],certificate[2]);
		Intern intern2 = new Intern(eid[3],ename[3],deptno[3],salary[3],skills[3],project_name[3],probation[3],certificate[3]);
		
		System.out.println("Calling who have salary < 10000");
		
//		if(dev1.salary <10000) {
//			dev1.showId();
//			dev1.showProfile();
//		}
//		if(dev2.salary <10000) {
//			dev2.showId();
//			dev2.showProfile();
//		}
//		
		if(intern1.salary < 10000) {
			intern1.showId();
			intern1.showStatus();
		}
	}
	
	

}
