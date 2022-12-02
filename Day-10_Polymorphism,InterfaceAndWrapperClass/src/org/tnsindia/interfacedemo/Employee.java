package org.tnsindia.interfacedemo;

/*Implementable Class
 //interface only implements the classes
public class Employee implements Manager {

@Override
public void salaryDiscussion(){
System.out.println("About Basic and variable pay");
}

@Override
public void projectDiscussion(){
System.out.println("About the java projects");
}
}*/
//Multiple Inheritance using interface
//child class is implementing the multiple parent interface
public class Employee implements HR,Manager
{

	public void projectDiscussion(){
	System.out.println("About the java projects");
	}
	

	public void salaryDiscussion(){
	System.out.println("About Basic and variable pay");
	}



}
