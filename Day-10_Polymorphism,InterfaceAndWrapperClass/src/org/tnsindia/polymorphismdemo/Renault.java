package org.tnsindia.polymorphismdemo;
//demo on construtor overloading
public class Renault {
	public String model;
	public String engine;
	//construtor overloading
	//default constructor
	Renault(String model,String engine)
	{
		System.out.println("Model name is: "+model+" "+
	"Engine is: "+engine);
		
	}
//parameterized constructor
	Renault(String model)
	{
		System.out.println("Model name is:  "+model);

	}

}
