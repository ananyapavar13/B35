package org.tnsindia.inheritancedemo;

//parent class
public class Vehicle {
	
	private String name;
	public void display()
	{
		System.out.println("The vehicle name is:"+name);
		
	}
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
