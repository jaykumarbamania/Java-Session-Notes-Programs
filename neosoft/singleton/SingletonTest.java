package com.neosoft.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton obj1 = Singleton.getInstance();
		
		Singleton obj2 = Singleton.getInstance();
		
		Singleton obj3 = Singleton.getInstance();
		
		System.out.println("Hashcode of obj1: "+obj1.hashCode());
		System.out.println("Hashcode of obj2: "+obj2.hashCode());
		System.out.println("Hashcode of obj3: "+obj3.hashCode());
		System.out.println("Database name : "+obj3.database_name);
	}

}

class Singleton{
	
	private static Singleton single_obj = null;
	
	//member
	public String database_name;
	
	private Singleton() {
		database_name = "My_db";
	}
	
	public static Singleton getInstance() {
		if(single_obj == null)
			single_obj = new Singleton();
		return single_obj;
	}
}
//package com.neosoft.singleton;
//
//public class SingletonTest {
//
//	public static void main(String[] args) {
//		// instantiating object
//		SingleTon obj1 = SingleTon.getInstance();
//		SingleTon obj2 = SingleTon.getInstance();
//		SingleTon obj3 = SingleTon.getInstance();
//		
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
//		System.out.println(obj3.hashCode());
//		System.out.println(obj3.database_name);
//	}
//
//}
//
//class SingleTon{
//	
//	private static SingleTon single_obj = null;
//	
//	// member
//	public String database_name;
//	
//	//private const
//	SingleTon() {
//		database_name = "Database";
//	}
//	
//	public static SingleTon getInstance() {
//		if(single_obj == null)
//			single_obj = new SingleTon();
//		return single_obj;
//	}
//}