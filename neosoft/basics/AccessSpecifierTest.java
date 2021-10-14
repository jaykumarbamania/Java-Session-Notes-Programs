package com.neosoft.basics;

public class AccessSpecifierTest {
	
int default_member = 10;
	
	void defaultShow() {
		System.out.println("Default Show");
	}
	
	public int public_member = 10;
	
	public void publicShow() {
		System.out.println("Public Show");
	}
	
	protected int protected_member = 10;
	
	protected void protectedShow() {
		System.out.println("protected Show");
	}
	
	private int private_member = 10;
	
	private void privateShow() {
		System.out.println("private Show");
	}

	public static void main(String[] args) {
		
		ChildTest obj = new ChildTest();
		obj.default_member = 200;
		obj.protected_member = 200;
		obj.public_member = 200;

	}

}

class ChildTest extends AccessSpecifierTest{
	
}

class NonSubClass{
	public void show() {
		
		AccessSpecifierTest obj = new AccessSpecifierTest();
		obj.default_member = 300;
		obj.defaultShow();
		
		new AccessSpecifierTest().default_member = 200;
	}
}
