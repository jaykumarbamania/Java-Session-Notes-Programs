package com.neosoft.polymorphism;

public class PolymorphismTest {

	public static void main(String[] args) {
		
		Calculate cal = new Calculate();
		cal.sum(12,32);
		
		cal.sum(12,34,56);
		
		cal.sum(12.2f,12.3f);
		
		PolymorphismTest.main('J');
		
		Dog dog = new Dog();
		dog.eat();
		
		Cat cat = new Cat();
		cat.eat();
		
		Animal animal = new Dog();
		animal.eat();
		
		Sample sample = new Sample(12, 23);
		System.out.println("Overriding toString : "+sample);
	}
	
	public static void main(char args) {
		System.out.println("Overloading Main Method : "+args);

	}
	

}

//Method Overloading (Compiletime Polymorphism)
class Calculate{
	
	void sum(int x, int y) {
		System.out.println("Int X + Int Y = "+(x+y));
	}
	
	void sum(float x, float y) {
		System.out.println("Float X + Float Y = "+(x+y));
	}
	
	void sum(int x, int y, int z) {
		System.out.println("Int X + Int Y + Int Z = "+(x+y+z));
	}
}


//Method Overriding (Runtime Polymorphism)

class Animal{
	
	public void eat() {
		System.out.println("Eat all foods...");
	}
}

class Dog extends Animal{
	public void eat() {
		System.out.println("Eat meat...");
	}
}

class Cat extends Animal{
	public void eat() {
		System.out.println("Drink Milk...");
	}
}

//Overriding toString

class Sample{
	private double a,b;

	public Sample(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "A: "+a+" B: "+b;
	}
}
