package com.neosoft.accesstest;

import com.neosoft.basics.AccessSpecifierTest;

public class AccessTest extends AccessSpecifierTest {
	
	
	public static void main(String[] args) {
		
		AccessSpecifierTest object = new AccessSpecifierTest();
		object.public_member=200;
		object.publicShow();
		
		AccessTest obj = new AccessTest();
		obj.protected_member = 200; //subclass can access protected member
		obj.protectedShow();

	}

}
