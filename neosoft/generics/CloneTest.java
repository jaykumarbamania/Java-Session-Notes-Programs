package com.neosoft.generics;

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Iphone13 iphone13= new Iphone13(12, 5.2, 3.5);
		Iphone13 iphone13_1 = (Iphone13) iphone13.clone();
		Iphone13 iphone13_2 = (Iphone13) iphone13.clone();
		Iphone13 iphone13_3 = (Iphone13) iphone13.clone();
		
		System.out.println(iphone13_2.height);
	}

}

class Iphone13 implements Cloneable{
	double weight;
	double height;
	double width;
	public Iphone13(double weight, double height, double width) {
		super();
		this.weight = weight;
		this.height = height;
		this.width = width;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
}
