package com.neosoft.serializers;

import java.io.Serializable;
import java.util.Date;

public class Trainer implements Serializable{
	
	private static final long serialVersionID = 1L;

	/*
	serialVersionID is a unique identifier for each class,
	JVM uses it to compare the versions of the class ensuring that the same
	class was 
	*/
	private String name;
	private Date birthday;
	private boolean gender;
	private int age;
	private float salary;
	
	public Trainer() {
		// TODO Auto-generated constructor stub
	}

	public Trainer(String name, Date birthday, boolean gender, int age, float salary) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Trainer [name=" + name + ", birthday=" + birthday + ", gender=" + gender + ", age=" + age + ", salary="
				+ salary + "]";
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
}
