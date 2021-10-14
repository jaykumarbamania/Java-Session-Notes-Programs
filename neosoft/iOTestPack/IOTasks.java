package com.neosoft.iOTestPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class IOTasks {

	public static void main(String[] args) throws IOException {
		
		String email="";
		String emailArr[] = new String[2];
		BufferedReader brInput = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i <2; i++) {
			
			try {
				System.out.println("Enter your Email #"+(i+1)+" : ");
				email = brInput.readLine();
				if(!email.matches("^(.+)@(.+)$")) throw new IllegalArgumentException("Enter Valid Email");
			}catch(IllegalArgumentException e) {
				System.out.println(e);
			}
			emailArr[i] = email;
		}
		brInput.close();
		
		File emailfile = new File("resources/email.txt");
		BufferedWriter bwEmail = new BufferedWriter(new FileWriter(emailfile));
		for (int i = 0; i < emailArr.length; i++) {
			bwEmail.write(emailArr[i]);
			bwEmail.newLine();
		}

		
		bwEmail.close();
		
		File domainFile = new File("resources/domain.txt");
		BufferedWriter bwDomain = new BufferedWriter(new FileWriter(domainFile));
		for (int i = 0; i < emailArr.length; i++) {
			int ind = emailArr[i].lastIndexOf("@");
			String domain = emailArr[i].substring(ind+1);
			bwDomain.write(domain);
			bwDomain.newLine();
		}
		bwDomain.close();
		
		BufferedReader brEmail = new BufferedReader(new FileReader(emailfile));
		String emails;
		System.out.println("Emails : ");
		while((emails = brEmail.readLine()) != null) {
			System.out.println(emails);
		}
		brEmail.close();
		System.out.println("======================");
		BufferedReader brDomain = new BufferedReader(new FileReader(domainFile));
		String domains;
		System.out.println("Domains : ");
		while((domains = brDomain.readLine()) != null) {
			System.out.println(domains);
		}
		brDomain.close();

	}

}
