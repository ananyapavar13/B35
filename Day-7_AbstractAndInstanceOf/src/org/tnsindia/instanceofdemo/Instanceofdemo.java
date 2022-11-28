package org.tnsindia.instanceofdemo;

abstract class Animal
{
	abstract void accept();
	}
//implementable child class for the abstract class
class Lion extends Animal
{
	@Override
	void accept() {
		System.out.println("Lion Roars");
		
	}
}
public class Instanceofdemo {

	public static void main(String[] args) {
	Lion l=new Lion();
	l.accept();
	//instance of operation
	System.out.println(l instanceof Lion);
	System.out.println(l instanceof Animal);
	}
	
	}

