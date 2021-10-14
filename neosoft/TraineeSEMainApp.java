package com.neosoft;

public class TraineeSEMainApp {

	public static void main(String[] args) {
		
			TraineeSoftwareEngineer candidate1 = new TraineeSoftwareEngineer();
			candidate1.name = "Jaykumar";
			candidate1.city = "Diu";
			candidate1.age = 22;
			candidate1.qualification = "B.E.";
			candidate1.email = "jaykumar@neosoft.com";
			candidate1.showDetails();
			System.out.println("Company : "+TraineeSoftwareEngineer.company_name);
			
			System.out.println("=========================");
			
			TraineeSoftwareEngineer candidate2 = new TraineeSoftwareEngineer();
			candidate2.name = "Devang";
			candidate2.city = "Ahmedabad";
			candidate2.age = 21;
			candidate2.qualification = "B.E.";
			candidate2.email = "devang@neosoft.com";
			candidate2.showDetails();
			System.out.println("Company : "+TraineeSoftwareEngineer.company_name);
			
			System.out.println("=========================");
			
			TraineeSoftwareEngineer candidate3 = new TraineeSoftwareEngineer("Abhi","BE",21,"BE","abhi@gmail.com");
			candidate3.showDetails();
			System.out.println("Company : "+TraineeSoftwareEngineer.company_name);

	}

}
