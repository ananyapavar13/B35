package org.tnsindia.ConstuctorDemo;
//driver class
public class ConstructorExcecutor {

	public static void main(String[] args) {
		
		//object creation
		Employee e=new Employee();
		Employee e1=new Employee(25000,"Anu");
		Employee e2=new Employee(30000,"Manu");
		
		e1.print();
		e2.print();
		
	}
}
