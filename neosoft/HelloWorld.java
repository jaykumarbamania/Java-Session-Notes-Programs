package com.neosoft;

public class HelloWorld {
	
	int x = 100 ;//data member of this class(attribute)
			
	public void show() {// class method (Object creation is not needed)
		System.out.println("From Instance method "+x);
	}

	public static void main(String[] args) {
		
		HelloWorld hw = new HelloWorld();
		System.out.println("Hello World "+hw.x);
		hw.show();

	}

}
