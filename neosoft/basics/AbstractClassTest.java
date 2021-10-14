package com.neosoft.basics;

public class AbstractClassTest {

	public static void main(String[] args) {
		College1 child = new College1();
		child.techs();
		child.sports();
		
		College2 child2 = new College2();
		child2.techs();
		child2.sports();
	}

}

abstract class University{
	abstract void techs();
	
	abstract void sports();
}

class College1 extends University{
	@Override
	void sports(){
		System.out.println("Criket, Football");
	}
	
	@Override
	void techs() {
		System.out.println("Java and Angular");
	}
}

class College2 extends University{

	@Override
	void sports() {
		System.out.println("Swimming, Basketball");
	}
	
	@Override
	void techs() {
		System.out.println("React and Django");
	}
	
}