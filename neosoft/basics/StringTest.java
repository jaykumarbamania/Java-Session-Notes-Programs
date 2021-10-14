package com.neosoft.basics;

import java.util.GregorianCalendar;

public class StringTest {

	public static void main(String[] args) {
		
		String str = "Virat";
		str = str.concat(" Kohali");
		System.out.println(str);
		
		String s1 = "HELLO"; // s1 s2 have same addr in the String Constant Pool
		String s2 = "HELLO";
		String s3 = new String("HELLO");
		
		// == compares address and value
		System.out.println(s1 == s2);// true
		System.out.println(s1 == s3); //false
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals(s3)); //true
		
		System.out.println("=============");
		
		System.gc();
		
		long start = new GregorianCalendar().getTimeInMillis();
		long startMemory = Runtime.getRuntime().freeMemory();
		
		String string = new String();
		//time taken by String to iterate 1Lakh :-
		//Time Taken232218
	//emory Taken 32250648
		
		StringBuffer strbf = new StringBuffer();
		StringBuilder strbd = new StringBuilder();
		for (int i = 0; i < 1000000; i++) {
//			string = string.concat("i");
			strbf.append('i');
		}
		
		long end = new GregorianCalendar().getTimeInMillis();
		long endMemory = Runtime.getRuntime().freeMemory();
		
		System.out.println("Time Taken"+(end-start));
		System.out.println("Memory Taken "+(endMemory-startMemory));
	}

}
