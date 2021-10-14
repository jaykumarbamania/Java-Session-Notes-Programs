package com.neosoft;

public class TraineeSoftwareEngineer {
	
	//Set of attributes
	String name;
	String qualification;
	int age;
	String city;
	String email;
	
	public TraineeSoftwareEngineer() {
	name = "unknown";
	qualification = "unknown";
	age= 0;
	city = "unknown";
	email = "unknown";
	}
	

	public TraineeSoftwareEngineer(String name, String qualification, int age, String city, String email) {
		this.name = name;
		this.qualification = qualification;
		this.age = age;
		this.city = city;
		this.email = email;
	}



	//class member / static member (Common for all and same 1 copy to all)
	// final => constant or not changeable
	public final static String company_name = "NEOSOFT TECHNOLOGIES";
	
	public void showDetails() { //out method (instance behaviour
		System.out.println("Name : "+name);
		System.out.println("Qualification : "+qualification);
		System.out.println("Age : "+age);
		System.out.println("City : "+city);
		System.out.println("Email : "+email);
	}
}
