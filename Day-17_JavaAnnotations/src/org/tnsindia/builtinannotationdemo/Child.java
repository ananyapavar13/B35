package org.tnsindia.builtinannotationdemo;

public class Child extends Parent {
    public String name="Sandhya";
    //Indicated that a method declaration is intended to override method declaration in a supertype.
    @Override
    public void display()
    {
    	super.display();
    	System.out.println("Child Name: "+name);
    	

	

	}

}
