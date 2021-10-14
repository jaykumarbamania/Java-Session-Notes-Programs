package com.neosoft.generics;

import java.util.Arrays;

public class ShallowDeepCloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a  = {10,20,30,40};
		Shallow s = new Shallow(a);
		s.showData();
		
		a[0] = 100;
		s.showData();
		System.out.println(a.hashCode());
		System.out.println(s.hashCode());
		System.out.println("=========================");
		
		int[] b  = {10,20,30,40};
		Deep d = new Deep(b);
		d.showData();
		
		b[0] = 100;
		d.showData();
		
		System.out.println(b.hashCode());
		System.out.println(d.hashCode());
		System.out.println("=========================");
	}

}
class Shallow{
	private int[] data;

	public Shallow(int[] data1) {
		data = data1;
	}
	
	public void showData() {
		System.out.println(Arrays.toString(data));
	}
}

class Deep{
	private int[] data;

	public Deep(int[] data1) {
		data = new int[data1.length];
		for (int i = 0; i < data1.length; i++) {
			data[i] = data1[i];
		}
	}
	
	public void showData() {
		System.out.println(Arrays.toString(data));
	}
}