package com.neosoft.enumPack;

import java.io.*;
import java.util.*;

public class EmailEntry {

	public static void main(String[] args) throws IOException {
		
		File f = new File("resources/email.txt");
		File f1 = new File("resources/domain.txt");
		
		BufferedWriter br = new BufferedWriter(new FileWriter(f));
		BufferedReader br1 = new BufferedReader(new FileReader(f));
		BufferedWriter br2 = new BufferedWriter(new FileWriter(f1, true));
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 5 emails:");
		String emailArr[] = new String[2];
		for(int i =0;i<2;i++) {
			String email = s.nextLine();
			if(email.matches("[0-9a-zA-Z+-_.]+@[a-zA-Z]+[.]{1}[a-zA-z]+")) {
				emailArr[i] = email;
				br.write(email);
				br.newLine();
			}
			else {
				System.out.println("Invalid email");
			}
		}
		br.close();
		
		
		String line = "";
		String domain = "";
		for (int i = 0; i < emailArr.length; i++) {
			int ind = emailArr[i].lastIndexOf("@");
			int ind1 = emailArr[i].lastIndexOf(".");
			domain = emailArr[i].substring(ind+1,ind1);
			br2.write(domain);
			br2.newLine();
		}
		br2.close();
//		while((line = br1.readLine())!=null) {
////			System.out.println(line.length());
//			int i = line.indexOf('@');
//			for(int j=1;j<=2;j++) {
////			for(int j=i+1;j<line.length();j++) {
////				domain = domain + line.charAt(j);
//				
//				try {
//					domain = line.substring(i+1);
//					System.out.println(domain);
//					br2.write(domain);
//					domain = "";
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		br2.newLine();
			
			domain = "";
			
		//}

	}

}