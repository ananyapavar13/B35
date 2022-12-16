package org.tnsindia.builtinannotationdemo;

import java.util.ArrayList;

public class SupressWarningDemo {

	//used to solve the compile time warning
	@SuppressWarnings("Unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList<Object> obj=new ArrayList<>();
		obj.add(15);
		obj.add("Ananya");
		obj.add(17.5);
		System.out.println(obj);
		
		
	}

}
