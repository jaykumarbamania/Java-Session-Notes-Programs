package com.neosoft;

public class MethodTestClass {
	
	String getMessage(String name, int age) {
		return "Name is"+name + age;
	}
	
	int[] performOp(int a, int b) {
		int[] opArr = new int[2];
		opArr[0] = a+b;
		opArr[1] = a-b;
		return opArr;
	}

	public static void main(String[] args) {
		
		int[] operations;
		
		MethodTestClass obj = new MethodTestClass();
		operations = obj.performOp(300, 400);
		
		for (int i = 0; i < operations.length; i++) {
			System.out.println(operations[i]);
		}
		
	}

}
