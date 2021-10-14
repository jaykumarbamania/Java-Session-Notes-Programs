package com.neosoft.serializers;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class IODeserializationTest {

	public static void main(String[] args) {

		ObjectInputStream ois = null;
		String inputFile = "resources/trainers.db";
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		
		try {
			ois = new ObjectInputStream(new FileInputStream(inputFile));
			while(true) {
				Trainer trainer = (Trainer) ois.readObject();
//				System.out.print("Name : "+trainer.getName()+"\t");
//				System.out.print("BD : "+dateFormat.format(trainer.getBirthday())+"\t");
//				System.out.print("Salary : "+trainer.getSalary()+"\t");
//				System.out.print("Gender : "+trainer.isGender()+"\n");
				System.out.println(trainer.toString());
//				if("Dev".equals(trainer.getName()) && (trainer.isGender() != true)) {
//					// System.out.println(user.getUsername() +"  =>   "+ user.getPassword());
//					System.out.println(trainer.toString()); 
//					break;
//				 }
			}
		} catch (EOFException e) {
			System.out.println("It's end of record");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
