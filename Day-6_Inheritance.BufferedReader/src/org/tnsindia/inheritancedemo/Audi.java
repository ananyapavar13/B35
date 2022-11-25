package org.tnsindia.inheritancedemo;

public class Audi extends Vehicle {
	private String name1;
	public void display()
	{
		System.out.println("The car name is:"+name1);
		
	}
	//getters and setters
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}

}
