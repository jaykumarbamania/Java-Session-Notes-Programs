package com.neosoft.serializers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class IOSerializationTest {
	private static File f = new File("resources/users.db");
	static int index = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Trainer> trainers = new ArrayList<Trainer>();
		ObjectOutputStream oos = null;
		String outputFile = "resources/trainers.db";
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(outputFile,true));
			trainers.add(index++,new Trainer("Jaykumar",dateFormat.parse("02-16-2019"),true,30,30000.5f));
			trainers.add(index++,new Trainer("Dev",dateFormat.parse("02-16-2020"),false,30,30000.5f));
			trainers.add(index++,new Trainer("John",dateFormat.parse("02-16-2021"),false,30,30000.5f));
			
//			trainers.add(index++,new Trainer("Alice",dateFormat.parse("02-16-2019"),true,30,30000.5f));
//			trainers.add(index++,new Trainer("Deep",dateFormat.parse("02-16-2020"),false,30,30000.5f));
//			trainers.add(index++,new Trainer("John",dateFormat.parse("02-16-2021"),false,30,30000.5f));			
			
			for(Trainer trainer : trainers) {
				oos.writeObject(trainer);
			}
			System.out.println("Serialization done");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
