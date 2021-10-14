package com.neosoft.basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest {

	public static void main(String[] args) throws FileNotFoundException {
		
//		String str = null;
//		System.out.println(str.length());// NullPointer Exception
		
		

		
		try {
//			int[] myarr = {20,101,10};
//			System.out.println(myarr[3]); //ArrayIndexOutOfBounds Exception
			int a = 10, b=0;
			if(b==0)
				throw new ArithmeticException("Should not be zero");
			int result = 10/0;
			System.out.println(result); //Artihmatic Exception
		}catch(ArithmeticException e) {
			System.err.println("Cannot devide by Zero " + e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
			System.err.println("Something Went Wrong "+" " + e.getLocalizedMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("I am always there!!");
		}
		System.out.println("End");
		
		//For throws checked exception
		File file = new File("/file.txt");
		FileReader fileReader = new FileReader(file);
		System.out.println("Done!!");
		
//		File file = new File("/file.txt");
//		try {
//			FileReader fileReader = new FileReader(file);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Done!!");
	}

}
