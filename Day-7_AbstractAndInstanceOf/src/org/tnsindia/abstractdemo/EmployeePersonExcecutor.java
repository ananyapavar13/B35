package org.tnsindia.abstractdemo;

public class EmployeePersonExcecutor {

	public static void main(String args[]) {
		Person p1=new Employee("Anu","Female",18);
		Person p2=new Employee("Manu","Male",14);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		p1.work();
		p2.work();
		}
}
