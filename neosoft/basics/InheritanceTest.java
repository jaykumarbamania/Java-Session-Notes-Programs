package com.neosoft.basics;

public class InheritanceTest {

	public static void main(String[] args) {

		
		Child child = new Child();
		child.showParent();
		child.showChild();

		Parent parent = new Child();
		parent.parent_member1 = 100;

		Child2 child2 = new Child2();
		child.parent_member1 = 100;

		B b = new B();
		b.show();
	}

}

class Parent {

	int parent_member1 = 1;

	void showParent() {
		System.out.println("I am from Parent!!");
	}
}

class Child extends Parent {

	int child_member1 = 1;

	void showChild() {
		System.out.println("I am from Child!!");
	}
}

class Child2 extends Child {

	int child2_member1 = 1;

}

//Using Super Keyword

class A {
	String name;

	public void show() {
		System.out.println(name);
	}
}

class B extends A {
	String name;

	public void show() {
		super.show();
		name = "B";
		System.out.println(name + " Parent : " + super.name);
	}
}
