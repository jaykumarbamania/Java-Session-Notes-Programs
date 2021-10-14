package com.neosoft.basics;

public class InterfaceTest {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		System.out.println(v.isMoveable());
		System.out.println(v.isrollable());
		v.move();
	}

}

interface Moveable{
	int AVERAGE_SPEEED = 50; // auto public, static, final 
	void move(); // auto public and abstract
	boolean isMoveable();
}

interface Rollable extends Moveable{
	boolean isrollable();
}

class Vehicle extends InterfaceTest implements Rollable{

	@Override
	public void move() {
		System.out.println("Average speed: "+AVERAGE_SPEEED);
	}

	@Override
	public boolean isMoveable() {
		return true;
	}

	@Override
	public boolean isrollable() {
		return true;
	}
	
}
