package org.tnsindia.inheritancedemo;
import java.util.Scanner;
//driver class for single inheritance
public class singleinheritance {

	public static void main(String[] args) {
		
		System.out.println("The name of the animal is:");
		Scanner s=new Scanner(System.in);
		String name1=s.nextLine();
		System.out.println("The breed of the animal is:");
		String breed1=s.nextLine();
		
		Dog d=new Dog();
		d.name=name1;
		d.breed=breed1;
		d.display();
		d.print();
		s.close();
		
	}

}
