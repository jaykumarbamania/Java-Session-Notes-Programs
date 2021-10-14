package com.neosoft.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.LinkedList<Object> complexLinkedList = new LinkedList<Object>(Arrays.asList(null,"abc",100,10.50,true));
//		complexLinkedList.addAll(1, Arrays.asList(10f,"Java",90,30,40));
		
		complexLinkedList.add(2,"Java");
		complexLinkedList.addFirst(3.4);
		System.out.println("==============");
		System.out.println(complexLinkedList.removeLast());
		System.out.println("==============");
		System.out.println(complexLinkedList.getLast());
		
		System.out.println("==============");
		for(Object obj:  complexLinkedList)
				System.out.println(obj);
		
		complexLinkedList.clear();
	}

}
