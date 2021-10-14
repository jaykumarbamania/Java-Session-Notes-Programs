package com.neosoft.iOTestPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name : ");
		String name = br1.readLine();
		System.out.println("Hi, "+ name);
		br1.close();
		
		System.out.println("=============");
		
		//Reading from a  file
		File file1 = new File("resources/sample.txt");
		BufferedReader br2 = new BufferedReader(new FileReader(file1));
		String line;
		String texts="";
		while((line = br2.readLine()) != null) {
//			System.out.println(line);
			texts = texts+ (line);
		}
		br2.close();
		
		//Writing to a file
		File file2 = new File("resources/sampletext.txt");
		if (!file2.exists()) {
		     file2.createNewFile();
		  }
		BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
		bw.write(texts);
		bw.close();
		
		BufferedReader br3 = new BufferedReader(new FileReader(file2));
		String line1;
		int count=0;
		while((line1 = br3.readLine()) != null) {
			System.out.println(line1);
			count++;
		}
		System.out.println(count+" lines copied");
		br3.close();

	}

}
