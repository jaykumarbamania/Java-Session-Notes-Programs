package com.neosoft;

import java.util.regex.*;

public class RegexText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile(".a"); // . means any single char before a
		Matcher matcher = pattern.matcher("bba");
		boolean result  = matcher.matches();
		System.out.println(result);
		
		//2nd wayX
		boolean result1 = Pattern.compile(".a").matcher("ba").matches();
//		System.out.println(result1);
		
		//3rd Way
		boolean result2 = Pattern.matches(".matcher", "yxz");
//		System.out.println(result2);
		
		System.out.println("===================");
		System.out.println(Pattern.matches("\\d{2}", "0a"));
		System.out.println(Pattern.matches("\\w{3}", "0a0"));
		System.out.println(Pattern.matches("[0-5]{2}", "36"));
		System.out.println(Pattern.matches("\\s{2}", "  "));
		System.out.println(Pattern.matches("[a,c]{3}", "abc")); //true
		
		//4th way
//		String str = "its nice to learn java and python";
//		String exp = "*.(java|Java).*";
//		System.out.println((str.matches(exp)));
		
		System.out.println("9999999999".matches("\\d{10}"));
		
		System.out.println("+91-9999999999".matches("^[+]\\d{2}[-]\\d{10}"));
	}

}
